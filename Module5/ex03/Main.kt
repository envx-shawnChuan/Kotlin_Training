package module5.ex03

fun main() = println(listOf(4, 10, 11, 50, 10, 24, -10, 4).filter { it > 5 }.toSet().sorted())