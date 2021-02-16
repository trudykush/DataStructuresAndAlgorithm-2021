package Feb2021.searching.kotlin
fun main(args: Array<String>) {
    val inputArray = readLine()!!.split(" ")
            .map { it.toInt() }

    val x = readLine()!!.toInt()

    var low = 0
    var high = inputArray.size - 1

    while (low <= high) {
        val mid = low + (high - low) / 2
        if (inputArray[mid] == x) {
            print("Element present at $mid")
            break
        }

        if (inputArray[mid] < x) {
            low = mid + 1
        } else if (inputArray[mid] > x) {
            high = mid - 1
        }
    }
}