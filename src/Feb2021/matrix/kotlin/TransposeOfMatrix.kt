package Feb2021.matrix.kotlin


fun main(args: Array<String>) {

    // Number of rows
    val rows = readLine()!!.toInt()

    // Number of columns
    val columns = readLine()!!.toInt()

    val ogMatrix = arrayOf(intArrayOf(2,3,4), intArrayOf(5,6,7))

    val inputMatrix = Array(rows) {IntArray(columns)}

    for (row in 0 until rows - 1) {
        for (column in 0 until columns - 1) {
            inputMatrix[column][row] = ogMatrix[row][column]
        }
    }


    //gettingTransposeOfMatrix(inputNumber, rows, columns)

}

fun gettingTransposeOfMatrix(inputNumber: ArrayList<Int>,
                             rows: Int, columns: Int) {
    for (i in 0..rows) {
        for (j in i+1..columns) {

        }
    }
}
