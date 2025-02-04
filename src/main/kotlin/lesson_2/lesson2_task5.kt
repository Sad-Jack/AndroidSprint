package jack.ripper.lesson_2

const val PERCENT_DIVISOR = 100.0

fun main() {
    val initialDeposit = 70_000
    val interestRatePercent = 16.7
    val years = 20

    val interestRate = (interestRatePercent / PERCENT_DIVISOR) + 1
    val finalAmount = initialDeposit * Math.pow(interestRate, years.toDouble())

    println(String.format("%.3f", finalAmount))
}