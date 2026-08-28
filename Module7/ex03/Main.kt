package module7.ex03

fun main(args: Array<String>) {
    if (args.isEmpty()) return println("none")
    args.filterNot { "ism" in it }.forEach { println("${it}ism") }
}