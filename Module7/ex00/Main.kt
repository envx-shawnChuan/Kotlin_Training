package module7.ex00

fun main(args: Array<String>) {
    val expected = args.firstOrNull() ?: return
    println(if (readlnOrNull() == expected) "Good job!" else "Nope, sorry...")
}