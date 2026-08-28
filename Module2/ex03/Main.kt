package module2.ex03

fun main() {
    val first = readlnOrNull()?.toIntOrNull() ?: return
    val second = readlnOrNull()?.toIntOrNull() ?: return
    val product = first * second
    println("$first x $second = $product")
    println(if (product >= 0) "This number is positive." else "This number is negative.")
}