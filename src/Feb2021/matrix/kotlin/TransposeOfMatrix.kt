package Feb2021.matrix.kotlin


fun main(args: Array<String>) {

    // Number of rows
    val rows = readLine()!!.toInt()

    // Number of columns
    val columns = readLine()!!.toInt()

    val input = readLine()
   /* val inputNumber: ArrayList<Int> =
            ArrayList(input!!.split(" ")
                    .map { it.toInt() })*/

    val inputMatrix = Array(rows) {IntArray(columns)}

    for (row in inputMatrix.indices) {
        for (column in inputMatrix[row].indices) {
            print(inputMatrix[row].contentToString())
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
