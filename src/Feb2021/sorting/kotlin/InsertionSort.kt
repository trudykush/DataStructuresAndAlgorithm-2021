package Feb2021.sorting.kotlin

fun main(args: Array<String>) {
    // to take all input in one line
    val input = readLine()
    // splitting the input in arrayList
    val inputList: ArrayList<Int> =
            ArrayList(input!!.split(" ").map { it.toInt() })

    for (i in 1 until inputList.size) {
        val key = inputList[i]
        var j = i - 1

        while (j >= 0 && inputList[j] > key) {
            inputList[j+1] = inputList[j]
            j -= 1
        }
        inputList[j+1] = key
    }

    for (i in 0 until inputList.size) {
        print("${inputList[i]} ")
    }
}