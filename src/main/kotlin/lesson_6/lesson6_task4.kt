package jack.ripper.lesson_6

fun main() {
    val number = (1..9).random()
    var tryCount = 5
    val textStart = "Нужно угадать число от 1 до 9. У вас $tryCount попыток."
    val textRepeat = "Неверно. Осталось попыток: $tryCount"
    val textEndWin = "Поздравляю, вы угадали! Это была великолепная игра!"
    val textEndLose = "Вы проиграли! Было загадано число: $number"

    println(textStart)

    while (tryCount > 0) {
        val userNumber = readLine()?.toIntOrNull() ?: 0
        if (userNumber == number) {
            println(textEndWin)
            break
        }
        tryCount--
        if (tryCount > 0) {
            println(textRepeat)
        } else {
            println(textEndLose)
        }
    }
}