package June2021.Kotlin

fun main() {

}

fun whenAssigned(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"
        else -> 42
    }
    return result
}