package module3.ex00

fun main() {
    val start = readlnOrNull()?.toIntOrNull() ?: return
    if (start > 25) {
        println("Error")
        return
    }
    for (number in start..25) println("Inside the loop, my variable is $number")
}