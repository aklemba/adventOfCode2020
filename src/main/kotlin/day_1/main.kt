import java.io.File

const val INPUT_FILE_NAME = "src/main/kotlin/day_1/input.txt"

const val SUM_TO_FIND = 2020

fun main() {
    val numberList = getInputAsAListOfLines().parseToIntList()
    println(fetchTheResult(numberList))
}

fun fetchTheResult(listOfNumbers: List<Int>): Int {
    for (i in listOfNumbers.indices) {
        for (j in i + 1 until listOfNumbers.size) {

            if (listOfNumbers[i] + listOfNumbers[j] == SUM_TO_FIND) {
                println("First number: ${listOfNumbers[i]} \nSecond number: ${listOfNumbers[j]}")
                return listOfNumbers[i] * listOfNumbers[j]
            }
        }
    }
    return -1
}

fun getInputAsAListOfLines(): List<String> = File(INPUT_FILE_NAME).readLines()


private fun List<String>.parseToIntList() = map { it.toInt() }

