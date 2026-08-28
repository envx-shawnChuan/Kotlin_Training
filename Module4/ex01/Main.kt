package module4.ex01

fun main() {
    val age = readlnOrNull()?.toIntOrNull() ?: return
    println("You are currently $age years old.")
    for (years in listOf(10, 20, 30)) println("In $years years, you'll be ${age + years} years old.")
}