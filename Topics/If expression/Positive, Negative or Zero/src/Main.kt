fun main() {
    val readNumber = readln().toInt()
    val outputString = if (readNumber < 0) "negative" else if (readNumber == 0) "zero" else "positive"
    println(outputString)
}