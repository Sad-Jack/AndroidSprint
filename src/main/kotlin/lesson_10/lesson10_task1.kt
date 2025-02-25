package lesson_10

fun main() {
    while (true) {
        println("Для броска кубика отправте 1, для выхода что-то что не 1")
        val input = readln().toIntOrNull()

        if (input == 1) {
            Thread.sleep(1000)
            val computerNumber = rollDice()
            println("ИИ бросил кубик на: $computerNumber")
            Thread.sleep(1000)
            val playerNumber = rollDice()
            println("Вы бросили кубик на: $playerNumber")
            println(chooseWinner(computerNumber, playerNumber))
        } else return
    }
}

fun rollDice() = (1..6).random()

fun chooseWinner(computerNumber: Int, playerNumber: Int) = when {
    computerNumber > playerNumber -> "Победила машина"
    computerNumber < playerNumber -> "Победило человечество"
    else -> "Победила дружба"
}