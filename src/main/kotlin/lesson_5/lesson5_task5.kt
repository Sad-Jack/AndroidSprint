package lesson_5

import kotlin.random.Random

const val COUNTER_OF_WINNING_NUMBERS = 3
const val NUMBERS_FROM = 0
const val NUMBERS_TO = 42

fun main() {

    val winningNumbers = List(COUNTER_OF_WINNING_NUMBERS) {
        Random.nextInt(NUMBERS_FROM, NUMBERS_TO + 1)
    }

    println("Введите три числа от $NUMBERS_FROM до $NUMBERS_TO через Enter:")
    val userNumbers = List(COUNTER_OF_WINNING_NUMBERS) {
        readLine()?.toIntOrNull() ?: Random.nextInt(NUMBERS_FROM, NUMBERS_TO + 1)
    }

    val matches = winningNumbers.intersect(userNumbers).size

    when (matches) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли ДЖЕКПОТ!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        else -> println("Вы не угадали ни одного числа. Удачи в следующий раз!")
    }

    println("Выигрышные числа: $winningNumbers")
}