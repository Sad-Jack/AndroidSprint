package jack.ripper.lesson_2

import kotlin.math.pow

const val PERCENT_DIVISOR = 100.0

fun main() {
    val initialDeposit = 70_000
    val interestRatePercent = 16.7
    val years = 20

    val interestRate = interestRatePercent / PERCENT_DIVISOR
    val finalAmount = initialDeposit * (1 + interestRate).pow(years)

    println(String.format("%.3f", finalAmount))
}