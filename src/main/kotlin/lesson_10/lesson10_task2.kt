package lesson_10

fun main() {
    println("Зарегистрируйтесь в приложении")
    print("Логин:")
    val inputLogin = readln()
    print("Пароль:")
    val inputPassword = readln()
    if (isInvalid(inputLogin) || isInvalid(inputPassword)){
        println("Логин или пароль недостаточно длинные")
        return
    }
    println("Авторизация прошла успешно")
}

fun isInvalid(input: String): Boolean = input.length < 4
