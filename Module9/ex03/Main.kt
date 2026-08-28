package module9.ex03

fun main() {
    val scientists = mapOf("Ada Lovelace" to 1815, "Cecilia Payne" to 1900, "Grace Hopper" to 1906, "Lise Meitner" to 1878)
    scientists.forEach { (name, year) -> println("$name is a great scientist born in $year.") }
}