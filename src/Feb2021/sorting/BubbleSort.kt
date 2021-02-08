
fun main(args: Array<String>) {
    var numberOfCases: Int = readLine()!!.toInt()

    while (numberOfCases-- > 0) {
        val n: Int = readLine()!!.toInt()
        val array = Array<Int>(n){ readLine()!!.toInt() }
        /*for (i in 0 until n-1) {
            array[i] = readLine()!!.toInt()
        }*/

        performBubbleSortAndPrint(array, n)
    }
}

private fun performBubbleSortAndPrint(array: Array<Int>, n: Int) {
    for (i in 0 until n-1) {
        for (j in 0 until n-i-1) {
            if (array[j] > array[j+1]) {
                val temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp
            }
        }
    }

    for (i in 0 until n) {
        print("$i ")
    }
    println()
}
