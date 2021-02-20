package Feb2021.matrix.kotlin


fun main(args: Array<String>) {

    // Number of rows
    val rows = readLine()!!.toInt()

    // Number of columns
    val columns = readLine()!!.toInt()

    val input = readLine()
    var inputNumber: ArrayList<Int> =
            ArrayList(input!!.split(" ")
                    .map { it.toInt() })

    gettingTransposeOfMatrix(inputNumber, rows, columns)

}

fun gettingTransposeOfMatrix(inputNumber: java.util.ArrayList<Int>, rows: Int, columns: Int) {

}
