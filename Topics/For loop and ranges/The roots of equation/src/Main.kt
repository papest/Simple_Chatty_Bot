const val R1 = 0
const val R2 = 1000
fun main() {

    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()

    for (x in R1..R2) {
        if (a * x * x * x + b * x * x + c * x + d == 0) {
            println(x)
        }
    }
}