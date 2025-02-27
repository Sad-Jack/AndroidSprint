package lesson_10

const val CREDENTIAL_LENGTH = 4

fun main() {
    println("Зарегистрируйтесь в приложении")
    print("Логин:")
    val inputLogin = readln()
    print("Пароль:")
    val inputPassword = readln()
    if (checkValid(inputLogin) || checkValid(inputPassword)){
        println("Логин или пароль недостаточно длинные")
        return
    }
    println("Авторизация прошла успешно")
}

fun checkValid(input: String): Boolean = input.length < CREDENTIAL_LENGTH
