package June2021.Kotlin

fun main() {
    println(whenAssigned("Hello"))
    println(whenAssigned("hello"))
    println(whenAssigned(1))
    println(whenAssigned(31L))
    println(whenAssigned(ControlFlow()))
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