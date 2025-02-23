package lesson_5

fun main() {

    val winningNumber1 = 7
    val winningNumber2 = 21
    val ranges = 0..42

    println("Введите первое число (от 0 до 42): ")
    val userNumber1 = readLine()?.toIntOrNull()

    println("Введите второе число (от 0 до 42): ")
    val userNumber2 = readLine()?.toIntOrNull()

    if (userNumber1 == null || userNumber2 == null || userNumber1 !in ranges || userNumber2 !in ranges) {
        println("Ошибка ввода! Введите числа от 0 до 42.")
        return
    }

    val guessedBoth = (userNumber1 == winningNumber1 && userNumber2 == winningNumber2) ||
            (userNumber1 == winningNumber2 && userNumber2 == winningNumber1)

    val guessedOne = (userNumber1 == winningNumber1 || userNumber1 == winningNumber2) ||
            (userNumber2 == winningNumber1 || userNumber2 == winningNumber2)

    when {
        guessedBoth -> println("Поздравляем! Вы выиграли главный приз!")
        guessedOne -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача!")
    }

    println("Выигрышные числа: $winningNumber1 и $winningNumber2")
}