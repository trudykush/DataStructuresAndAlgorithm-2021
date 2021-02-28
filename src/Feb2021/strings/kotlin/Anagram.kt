package Feb2021.strings.kotlin

fun main(args: Array<String>) {
    val firstInputStr = readLine()
    val secondInputStr = readLine()

    val firstCharArray = firstInputStr!!.toCharArray()
    val secondCharArray = secondInputStr!!.toCharArray()

    firstCharArray.sort()
    secondCharArray.sort()

    var result = "Not anagram"
    if (firstCharArray.size == secondCharArray.size) {
        anagram(firstCharArray, secondCharArray)
        print(result)
    } else {
        print(result)
    }

}

fun anagram(firstCharArray: CharArray, secondCharArray: CharArray): String {
    for (elements in firstCharArray.indices) {
        if (firstCharArray[elements] != secondCharArray[elements]) {
            return "Not anagram"
        }
    }
    return "Anagram"
}
