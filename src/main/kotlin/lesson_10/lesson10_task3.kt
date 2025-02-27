package lesson_10

val digits = ('0'..'9')
val specialCharacters = ("!\"#$%&'()*+,-./")

fun main() {
    print("Введите длину пароля: ")
    val passwordLength = readln().toIntOrNull() ?: return
    val password = generatePassword(passwordLength)
    println("Сгенерированный пароль: $password")
}

fun generatePassword(length: Int): String {
    return (0 until length).joinToString("") {
        if (it % 2 == 0) digits.random().toString()
        else specialCharacters.random().toString()
    }
}