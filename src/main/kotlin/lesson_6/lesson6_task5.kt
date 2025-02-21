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
            if (verifyHuman()) {
                println("Авторизация прошла успешно")
                break
            }
            continue
        } else {
            println("Ошибка: неверный логин или пароль. Попробуйте снова.")
        }
    }
}

fun verifyHuman(): Boolean {
    var tryCount = 3
    println("Докажите что вы не робот, у вас $tryCount попыток")
    while (tryCount > 0) {
        val num1 = (0..9).random()
        val num2 = (0..9).random()
        val sum = num1 + num2

        tryCount--
        print("Решите пример: $num1 + $num2 = ")
        val inputAnswer = readln().toIntOrNull() ?: 0
        if (inputAnswer == sum) return true
        if (tryCount > 0) {
            println("Ответ неверный, количество попыток: $tryCount")
            continue
        }
        println("Доступ запрещен!")
    }
    return false
}