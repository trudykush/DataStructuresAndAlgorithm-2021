package March2021.strings.kotlin


// TODO: Needs improvement, id doesn't check if string is same
fun main(args: Array<String>) {
    val firstStr = readLine()
    val secondStr = readLine()

    if ((firstStr!!.length == secondStr!!.length)
            &&
            (firstStr+secondStr).contains(secondStr)) {
            print("Is rotated")
        } else {
            print("Not Rotated")
    }
}