package module7.ex04

fun main(args: Array<String>) {
    val start = args.getOrNull(0)?.toIntOrNull()
    val end = args.getOrNull(1)?.toIntOrNull()
    println(if (start == null || end == null) "none" else (start..end).toList())
}