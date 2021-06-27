package June2021.Kotlin

import org.omg.CORBA.Object

fun main() {

    val cakes = listOf<String>("carrot", "Cheese", "Chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

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