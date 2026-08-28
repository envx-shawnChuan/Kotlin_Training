package module1.ex03

fun main() {
    val firstName = readlnOrNull().orEmpty()
    val lastName = readlnOrNull().orEmpty()
    println("Pleased to meet you, $firstName $lastName.")
}