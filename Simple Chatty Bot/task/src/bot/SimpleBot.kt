package bot

fun main() {
    greet("Bot", "2023") // change it as you need
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("""Hello! My name is $assistantName.
I was created in $birthYear.
Please, remind me your name.""")
}

fun remindName() {
    val name = readln()
    println("What a great name you have, ${name}!")
}

fun guessAge() {
    println("""Let me guess your age.
Enter remainders of dividing your age by 3, 5 and 7.""")

    val rem3 = readln().toInt()
    val rem5 = readln().toInt()
    val rem7 = readln().toInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = readln().toInt()
    for (i in 0..num) {
        println("$i!")
    }
}
const val RIGHT_ANSWER = 2
fun test() {
    var number = 0

    println("""Let's test your programming knowledge.
Why do we use methods?
1. To repeat a statement multiple times.
2. To decompose a program into several small subroutines.
3. To determine the execution time of a program.
4. To interrupt the execution of a program.""")

    while (number != RIGHT_ANSWER) {
        println("Please, try again.")
        number = readln().toInt()

    }
}

fun end() {
    println("Congratulations, have a nice day!")
}
