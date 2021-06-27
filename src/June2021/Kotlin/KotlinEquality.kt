package June2021.Kotlin

fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    // Returns true because it calls authors.equals(writes) and sets ignore element order
    println(authors == writers)

    // Returns false because authors and writes are distinct references
    println(authors === writers)

    println(max(99, -42))
}

fun max(a: Int, b: Int) = if (a > b) a else b