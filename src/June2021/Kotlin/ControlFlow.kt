package June2021.Kotlin

fun main() {
    println(whenAssigned("Hello"))
    println(whenAssigned("hello"))
}

fun whenAssigned(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class ControlFlow