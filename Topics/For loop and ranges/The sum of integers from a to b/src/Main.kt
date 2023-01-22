fun main() {
    val range = readln().toInt()..readln().toInt()
    var sum = 0
    for (x in range) sum += x
    println(sum)
}