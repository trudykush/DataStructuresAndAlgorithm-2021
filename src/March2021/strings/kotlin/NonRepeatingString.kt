package March2021.strings.kotlin

import java.util.*

fun main(args: Array<String>) {
    // Reading input from user
    val inputStr = readLine()
    // changing string into char array
    val inputChar = inputStr!!.toCharArray()

    // making int array of size 256 and populating with -1
    var map = IntArray(256) {-1}
    // for loop with index
    for ((index, value) in inputChar.withIndex()) {
        map[inputChar[index].toInt()] = map[inputChar[index].toInt()] + 1
    }

    // for loop for finishing string
    for (i in inputChar.indices) {
        if (map[inputChar[i].toInt()] == 0) {
            print("The first non-repeating char is: ${inputChar[i]}")
            break;
        }
    }
}