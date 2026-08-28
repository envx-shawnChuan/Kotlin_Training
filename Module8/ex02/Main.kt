package module8.ex02

fun downcaseAll(values: Array<String>): List<String> = values.map(String::lowercase)

fun main(args: Array<String>) = println(downcaseAll(args).takeIf { it.isNotEmpty() } ?: "none")