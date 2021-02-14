package Feb2021.sorting.kotlin

fun main(args: Array<String>) {
    val input = readLine()
    val inputList: ArrayList<Int> =
            ArrayList(input!!.split(" ")
                    .map { it.toInt() })

    sortingBinaryArray(inputList.toIntArray(), inputList.size)
}

fun sortingBinaryArray(toIntArray: IntArray, size: Int) {

}
