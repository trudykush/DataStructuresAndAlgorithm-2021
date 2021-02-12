package Feb2021.sorting.kotlin

fun main(args: Array<String>) {
    val input = readLine()
    val inputList: ArrayList<Int> =
            ArrayList(input!!.split(" ").map { it.toInt() })

    /*quickSort(inputList.toIntArray(),
                0, inputList.size-1)*/
    printSortedArray(inputList)
}

fun printSortedArray(inputList: java.util.ArrayList<Int>) {
    for (i in 0 until inputList.size) {
        print("${inputList[i]} ")
    }
    println()
}

