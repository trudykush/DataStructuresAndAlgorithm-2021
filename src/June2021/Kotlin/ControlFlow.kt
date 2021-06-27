package June2021.Kotlin

import org.omg.CORBA.Object

fun main() {

    // while and do-while
    var cakesEaten = 0
    var cakesBakes = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }

    do {
        bakeACake()
        cakesBakes++
    } while (cakesBakes < cakesEaten)

    // for loop
    val cakes = listOf<String>("carrot", "Cheese", "Chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }

    // when statements
    println(whenAssigned("Hello"))
    println(whenAssigned("hello"))
    println(whenAssigned(1))
    println(whenAssigned(31L))
    println(whenAssigned(ControlFlow()))
}

fun eatACake() = println("Eat a cake!")
fun bakeACake() = println("Bake a cake!")

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