package June2021.Kotlin

fun main() {
    for (i in 0..3) {
        print(i)
    }

    println()

    for (i in 0 until 3) {
        print("$i ..")
    }

    println()

    for (i in 2..8 step 2) {
        print("$i ._. ")
    }

    println()

    for (i in 3 downTo 0) {
        print(i)
    }

    println()
}