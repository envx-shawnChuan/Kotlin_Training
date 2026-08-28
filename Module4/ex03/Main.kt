package module4.ex03

fun main() {
    val number = readlnOrNull()?.toDoubleOrNull() ?: return
    println(if (number % 1.0 == 0.0) "This number is an integer." else "This number is a decimal.")
}