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

fun main() {
    val dog: KotlinInheritance = Yorkshire()
    dog.sayHello()
}