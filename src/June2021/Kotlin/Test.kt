package June2021.Kotlin

fun main() {
    println("Hello World")

    var neverNull: String = "This can't be null"
    //neverNull = null

    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"
    //inferredNonNull = null

    val result = strLength(neverNull)
    println(result)

    /* //Error
    val resultNull = strLength(nullable)
    println(resultNull)*/
}

fun strLength(nonNull: String) :Int {
    return nonNull.length
}