package June2021.Kotlin

open class KotlinInheritance {
    open fun sayHello() {
        println("Saying Hello")
    }
}

class Yorkshire: KotlinInheritance() {
    override fun sayHello() {
        println("Yorkshire Saying Hello")
    }
}

fun main1() {
    val dog: KotlinInheritance = Yorkshire()
    dog.sayHello()
}

open class Tiger(private val origin: String) {
    fun sayHello() {
        println("A Tiger from $origin says: grhhh")
    }
}

class SiberianTiger: Tiger("Siberian")

fun main2() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh:")
    }
}

