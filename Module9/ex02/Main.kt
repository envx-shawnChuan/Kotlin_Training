package module9.ex02

fun main() {
    val classes = mapOf("3B" to listOf(18.0, 15.0, 8.0, 9.0), "3C" to listOf(17.0, 15.0, 8.0, 13.0))
    classes.forEach { (name, grades) -> println("Average for class $name: ${grades.average()}.") }
}