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

    println(boxedB == anotherBoxedB) // Prints 'true'

    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println(creditCardNumber)
    println(hexBytes)
    println(bytes)
}