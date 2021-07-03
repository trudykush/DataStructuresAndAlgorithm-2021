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

    val x = 5 / 2
    //println(x == 2.5) // ERROR: Operator '==' cannot be applied to 'Int' and 'Double'
    println(x == 2)

    val x1 = 5L / 2
    println(x1 == 2L)

    val x2 = 5 / 2.toDouble()
    println(x2 == 2.5)

    val x3 = (1 shl 2) and 0x000FF000
    println(0x000FF000)
    println(x3)
    /*
    * Here is the complete list of bitwise operations:

    shl(bits) – signed shift left

    shr(bits) – signed shift right

    ushr(bits) – unsigned shift right

    and(bits) – bitwise and

    or(bits) – bitwise or

    xor(bits) – bitwise xor

    inv() – bitwise inversion
    * */


    // Special characters start from an escaping backslash \. The following escape sequences are supported: \t, \b, \n, \r, \', \", \\ and \$
    val aChar: Char = 'a'

    println(aChar)
    println('\n') //prints an extra newline character
    println('\uFF00')


    /*
    * The cast operator throws an exception if the cast isn't possible. Thus, it's called unsafe
    * Note that null cannot be cast to String as this type is not nullable.
    * */
    //val x4: String = y as String

    /*
    *  If y is null, the code above throws an exception. 
    * To make such code correct for null values, use the nullable type on the right hand side of the cast:
    * */
    //val x5: String? = y as String?


    //To avoid exceptions, use the safe cast operator as? that returns null on failure.
    //val x: String? = y as? String
}
