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
}
