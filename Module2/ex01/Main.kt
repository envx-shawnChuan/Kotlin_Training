package module2.ex01

fun main() {
    val number = readlnOrNull()?.toIntOrNull() ?: 0
    when {
        number > 0 -> println("This number is positive.")
        number < 0 -> println("This number is negative.")
        else -> println("This number is both positive and negative.")
    }
}