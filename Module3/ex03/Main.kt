package module3.ex03

fun main() {
    println("Table of 3:")
    println((0..10).joinToString(" ") { (it * 2).toString() })
}