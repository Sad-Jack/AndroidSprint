package jack.ripper.lesson_6

fun main() {
    println("Зарегистрируйтесь в приложении")
    print("Логин: ")
    val registeredLogin = readln()
    print("Пароль: ")
    val registeredPassword = readln()

    while (true) {
        print("Введите логин: ")
        val inputLogin = readln()
        print("Введите пароль: ")
        val inputPassword = readln()

        if (registeredLogin == inputLogin && registeredPassword == inputPassword) {
            println("Авторизация прошла успешно")
            break
        } else {
            println("Ошибка: неверный логин или пароль. Попробуйте снова.")
        }
    }
}