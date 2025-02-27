package lesson_10

fun main() {
    while (true) {
        println("Введите '1' для броска кубика или любое другое значение для выхода:")
        val input = readln().toIntOrNull()

        if (input != 1) {
            println("Выход из игры. До новых встреч!")
            return
        }

        val computerNumber = rollDice()
        println("ИИ бросил кубик: $computerNumber")

        val playerNumber = rollDice()
        println("Вы бросили кубик: $playerNumber")

        println(chooseWinner(computerNumber, playerNumber))
        println()
    }
}

fun rollDice() = (1..6).random()

fun chooseWinner(computerNumber: Int, playerNumber: Int) = when {
    computerNumber > playerNumber -> "Победила машина 🤖"
    computerNumber < playerNumber -> "Победило человечество 🏆"
    else -> "Победила дружба ✨"
}