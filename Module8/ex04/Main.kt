package module8.ex04

fun format(value: String): String = if (value.length > 8) value.take(8) else value.padEnd(8, 'Z')

fun main(args: Array<String>) {
	if (args.isEmpty()) return println("none")
	args.forEach { println(format(it)) }
}