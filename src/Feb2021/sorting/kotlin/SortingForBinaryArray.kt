package Feb2021.sorting.kotlin

fun main(args: Array<String>) {
    val input = readLine()
    val inputList: ArrayList<Int> =
            ArrayList(input!!.split(" ")
                    .map { it.toInt() })

    sortingBinaryArray(inputList.toIntArray(), inputList.size)
}

fun sortingBinaryArray(toIntArray: IntArray, size: Int) {
    var left = 0
    var right = size - 1

    while (left < right) {
        while (toIntArray[left] == 0 && left < right) {
            left++
        }
        while (toIntArray[right] == 1 && left < right) {
            right--
        }
        if (toIntArray[left] == 1 && toIntArray[right] == 0) {
            val temp = toIntArray[left]
            toIntArray[left] = toIntArray[right]
            toIntArray[right] = temp

            left++
            right--
        }
    }

    printingResult(toIntArray)
}

fun printingResult(toIntArray: IntArray) {
    for (elements in toIntArray) {
        print("$elements ")
    }
    println()
}
