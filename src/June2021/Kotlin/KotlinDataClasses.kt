package June2021.Kotlin

data class KotlinDataClasses(val name: String, val age: Int) {
    override fun equals(other: Any?) = other is KotlinDataClasses
            && other.age == this.age
    }

fun main() {
    val user = KotlinDataClasses("Kush", 29)
    println(user)

    val secondUser = KotlinDataClasses("Piyush", 28)
    println("User == secondUser: ${user == secondUser}")

    println(user.hashCode())
    println(secondUser.hashCode())

    println(user.copy())
    println(user === user.copy())
    println(user.copy(name = "Kush"))
    println(user.copy(age = 28))

    println("name = ${user.component1()}")
    println("name = ${user.component2()}")
}
