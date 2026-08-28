package module7.ex01

fun main(args: Array<String>) {
    println("Number of parameters: ${args.size}")
    args.forEach { parameter -> println("$parameter: ${parameter.length}") }
}