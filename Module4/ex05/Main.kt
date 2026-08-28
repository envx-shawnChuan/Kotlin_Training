package module4.ex05

fun main() {
    println(readlnOrNull().orEmpty().map { character ->
        if (character.isUpperCase()) character.lowercaseChar() else character.uppercaseChar()
    }.joinToString(""))
}