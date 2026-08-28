package module3.ex01

fun main() {
    val multiplier = readlnOrNull()?.toIntOrNull() ?: return
    for (number in 0..9) println("$number x $multiplier = ${number * multiplier}")
}