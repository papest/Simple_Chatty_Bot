fun main() {
    val first = readln().toInt() > 0
    val second = readln().toInt() > 0
    val third = readln().toInt() > 0
    println("${first xor second xor third && !(first && second && third)}")
}