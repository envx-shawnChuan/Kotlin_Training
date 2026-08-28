package module6.ex04

fun main(args: Array<String>) {
    if (args.size != 2) return println("none")
    println(args[1].windowed(args[0].length).count { it == args[0] }.takeIf { it > 0 } ?: "none")
}