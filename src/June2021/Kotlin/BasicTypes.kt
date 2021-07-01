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

    //You can use underscores to make number constants more readable:
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println(creditCardNumber)
    println(hexBytes)
    println(bytes)

    /*
    *   Decimals: 123
        Longs are tagged by a capital L: 123L

        Hexadecimals: 0x0F

        Binaries: 0b00001011

        Octal literals are not supported.

        Kotlin also supports a conventional notation for floating-point numbers:

        Doubles by default: 123.5, 123.5e10

        Floats are tagged by f or F: 123.5f
    * */

    println(1 + 2)
    println(2_500_000_000L - 1L)
    println(3.14 * 2.71)
    println(10.0 / 3)
}