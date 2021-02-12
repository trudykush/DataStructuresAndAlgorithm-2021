package Feb2021.sorting.kotlin

fun main(args: Array<String>) {
    val input = readLine()
    val inputList: ArrayList<Int> =
            ArrayList(input!!.split(" ").map { it.toInt() })

    quickSort(inputList.toIntArray(),
                0, inputList.size-1)
    printSortedArray(inputList)
}

fun printSortedArray(inputList: java.util.ArrayList<Int>) {
    for (i in 0 until inputList.size) {
        print("${inputList[i]} ")
    }
    println()
}

fun quickSort(toArray: IntArray, low: Int, high: Int) {

    if (low < high) {
        val pivot = partition(toArray, low, high)

        quickSort(toArray, low, pivot-1)
        quickSort(toArray, pivot+1, high)
    }
}

fun partition(toArray: IntArray, low: Int, high: Int): Int {
    val pivot = toArray[high]
    var i: Int = low - 1
    for (j in low until high) {
        if(toArray[j] < pivot) {
            i++
            val temp = toArray[i]
            toArray[i] = toArray[j]
            toArray[j] = temp
        }
    }

    val temp = toArray[i+1]
    toArray[i+1] = toArray[high]    // high or pivot
    toArray[high] = temp

    return i+1
}

