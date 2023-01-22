fun main() {
    val range1 = readln().toInt()..readln().toInt()
    val range2 = readln().toInt()..readln().toInt()
    val checkValue = readln().toInt()
    println("${checkValue in range1 || checkValue in range2}")
}