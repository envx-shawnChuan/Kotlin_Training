package module8.ex05

private var value = 5

fun increment() {
    value++
    println(value)
}

fun main() {
    println(value)
    increment()
}