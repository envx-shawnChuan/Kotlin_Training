package module4.ex04

import kotlin.math.ceil

fun main() {
    val number = readlnOrNull()?.toDoubleOrNull() ?: return
    println(ceil(number).toInt())
}