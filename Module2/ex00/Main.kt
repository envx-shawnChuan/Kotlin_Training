package module2.ex00

fun main() {
    when (readlnOrNull()?.toIntOrNull()) {
        null -> println("This is not a number.")
        0 -> println("This number is equal to zero.")
        else -> println("This number is different from zero.")
    }
}