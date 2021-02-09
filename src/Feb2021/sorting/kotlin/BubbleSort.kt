
fun main(args: Array<String>) {
    var isSorted = false
    val str = readLine()

    // Read values and convert them to arrayList
    val intList: ArrayList<Int> =
            ArrayList(str!!.split(" ").map { it.toInt() })

    // to keep the track of unsorted list
    var lastUnSorted = intList.size - 1

    while (!isSorted) {
        isSorted = true
        for (i in 0 until lastUnSorted) {
            if (intList[i] > intList[i+1]) {
                swapValues(intList, i, i+1)
                isSorted = false
            }
        }
        lastUnSorted--
    }

    for (i in intList) {
        print("$i ")
    }
}

fun swapValues(list: ArrayList<Int>, a: Int, b: Int) {
    val temp = list[a]
    list[a] = list[b]
    list[b] = temp
}


