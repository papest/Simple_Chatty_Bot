fun main() {
    val first = readln().toInt()
    val second = readln().toInt()
    val third = readln().toInt()
    println("${second in first..third || second in third..first}")
}