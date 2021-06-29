package June2021.Kotlin

fun main() {
    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    /*
    All nullable references to a are actually the same object because of the memory optimization that JVM applies to
    Integer s between -128 and 127. It doesn't apply to the b references, so they are different objects.
    * */
    println(boxedA === anotherBoxedA) // true
    println(boxedB === anotherBoxedB) // false


    val b1: Int = 10000
    println(b1 == b1) // Prints 'true'
    val boxedB1: Int? = b1
    val anotherBoxedB1: Int? = b1
    println(boxedB1 == anotherBoxedB1) // Prints 'true'
}