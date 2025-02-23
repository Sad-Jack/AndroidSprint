package lesson_7

const val MIN_PASSWORD_LENGTH = 6

fun main() {
    val characterTypes = 3
    val digits = ('0'..'9').toList()
    val lowerCase = ('a'..'z').toList()
    val upperCase = ('A'..'Z').toList()
    val allChars = digits + lowerCase + upperCase


    print("Введите длину пароля (не меньше 6): ")
    val length = readln().toIntOrNull() ?: return
    if (length < MIN_PASSWORD_LENGTH) {
        println("Ошибка: минимальная длина пароля – 6 символов.")
        return
    }

    val result = buildString {
        append(lowerCase.random())
        append(digits.random())
        append(upperCase.random())
        for (i in 1..length - characterTypes) {
            append(allChars.random())
        }
    }
    val shuffledPassword = result.toMutableList().shuffled().joinToString("")
    println("Ваш пароль: $shuffledPassword")
}