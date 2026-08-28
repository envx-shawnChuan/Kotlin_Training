package module7.ex02

fun main(args: Array<String>) {
    val parameter = args.firstOrNull() ?: return println("none")
    if (args.size != 1) return println("none")
    println(parameter.filter { it == 'z' }.ifEmpty { "none" })
}