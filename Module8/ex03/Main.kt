package module8.ex03

fun greeting(name: String?): String = when (name) {
    null -> "Hello, nobel stranger."
    "" -> "Error! It was not a name."
    else -> "Hello, $name"
}

fun main() {
    listOf("Alxendra", "Wil", null, "").forEach { println(greeting(it)) }
}