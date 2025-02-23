package lesson_7

fun main() {
    val letters = ('a'..'z').toList()
    val numbers = ('0'..'9').toList()
    val password = buildString {
        for (i in 0 until 3) {
            append(letters.random())
            append(numbers.random())
        }
    }
    println("Сгенерированный пароль: $password")
}