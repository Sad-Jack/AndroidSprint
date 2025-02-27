package lesson_10

fun main() {
    var counterWins = 0

    do {
        val computerNumber = rollDice()
        println("ИИ бросил кубик: $computerNumber")
        val playerNumber = rollDice()
        println("Вы бросили кубик: $playerNumber")

        if (chooseWinner(computerNumber, playerNumber)) {
            counterWins += 1
        }
        println()

        print("Хотите бросить кости еще раз? Введите 'Да' или 'Нет': ")
        val input = readln()
        println()

        if (input.lowercase() != "да") {
            println("Выход из игры. До новых встреч!")
            break
        }
    } while (true)

    println("Выигрышные числа: $counterWins")
}

fun rollDice() = (1..6).random()

fun chooseWinner(computerNumber: Int, playerNumber: Int): Boolean {
    when {
        computerNumber < playerNumber -> {
            println("Победило человечество 🏆")
            return true
        }

        computerNumber > playerNumber -> {
            println("Победила машина 🤖")
            return false
        }

        else -> {
            println("Победила дружба ✨")
            return false
        }
    }
}