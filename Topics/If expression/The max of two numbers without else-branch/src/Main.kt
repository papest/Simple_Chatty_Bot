fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    var outNumber = a

    if (b > a) {
        outNumber = b
    }

    println(outNumber)
}