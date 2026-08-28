package module6.ex01

fun main(args: Array<String>) = println(args.firstOrNull()?.uppercase() ?: "none")