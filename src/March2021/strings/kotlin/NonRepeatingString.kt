package March2021.strings.kotlin

import java.util.*

fun main(args: Array<String>) {
    val inputStr = readLine()
    val inputChar = inputStr!!.toCharArray()

    var map = IntArray(256) {-1}
    for ((index, value) in inputChar.withIndex()) {
        map[inputChar[index].toInt()] = map[inputChar[index].toInt()] + 1
    }

    for (i in inputChar.indices) {
        if (map[inputChar[i].toInt()] == 0) {
            print("The first non-repeating char is: ${inputChar[i]}")
            break;
        }
    }
}