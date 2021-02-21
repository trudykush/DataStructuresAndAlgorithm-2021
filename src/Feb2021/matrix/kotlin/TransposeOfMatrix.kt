package Feb2021.matrix.kotlin


fun main(args: Array<String>) {

    // Number of rows
    val rows = 2

    // Number of columns
    val columns = 3

    val ogMatrix = arrayOf(intArrayOf(2,3,4), intArrayOf(5,6,7))

    displayTranspose(ogMatrix)

    val inputMatrix = Array(columns) {IntArray(rows)}

    for (row in 0 until rows) {
        for (column in 0 until columns) {
            inputMatrix[column][row] = ogMatrix[row][column]
        }
    }

     displayTranspose(inputMatrix)
    //gettingTransposeOfMatrix(inputNumber, rows, columns)

}

fun displayTranspose(inputMatrix: Array<IntArray>) {
    println()
    for (row in inputMatrix) {
        for (column in row) {
            print("$column  ")
        }
        println()
    }
}

fun gettingTransposeOfMatrix(inputNumber: ArrayList<Int>,
                             rows: Int, columns: Int) {
    for (i in 0..rows) {
        for (j in i+1..columns) {

        }
    }
}
