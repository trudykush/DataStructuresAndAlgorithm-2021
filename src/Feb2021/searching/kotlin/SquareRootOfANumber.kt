package Feb2021.searching.kotlin

fun main(args: Array<String>) {
    val input = readLine()

    var result = findingSquareRoot(input!!.toInt())
    print(result)
}

fun findingSquareRoot(input: Int?): Int {
    var low = 0
    var high = input
    var ans = 0
    while (low < high!!) {
        if (input == 0 || input == 1) {
            return 0
        }
        var mid = low + (high - low) / 2
        var midSquare = mid * mid
        if (midSquare == input) {
            return mid
        }
        if (midSquare < input!!) {
            low = mid + 1;
            ans = mid
        } else {
            high = mid - 1
        }
    }
    return ans
}
