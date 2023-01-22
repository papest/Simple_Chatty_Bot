fun main() {
    val readNumber = readln().toInt()
    val remainder = readNumber % 2
    println("${readNumber + 2 - remainder}")
}