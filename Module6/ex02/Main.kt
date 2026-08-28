package module6.ex02

fun main(args: Array<String>) = println(args.firstOrNull()?.lowercase() ?: "none")