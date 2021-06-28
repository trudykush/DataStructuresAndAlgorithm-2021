package June2021.Kotlin

data class KotlinDataClasses(val name: String, val age: Int) {
    override fun equals(other: Any?) = other is KotlinDataClasses
            && other.age == this.age
    }

fun main() {

}
