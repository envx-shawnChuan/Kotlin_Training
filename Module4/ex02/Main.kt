package module4.ex02

fun main() {
    val first = readlnOrNull()?.toIntOrNull() ?: return
    val second = readlnOrNull()?.toIntOrNull() ?: return
    println("$first + $second = ${first + second}")
    println("$first - $second = ${first - second}")
    println("$first / $second = ${first / second}")
    println("$first * $second = ${first * second}")
}