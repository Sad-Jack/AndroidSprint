package jack.ripper.lesson_2

fun main() {
    val initialDeposit = 70000
    val interestRate = 16.7 / 100
    val years = 20

    val finalAmount = initialDeposit * Math.pow(1 + interestRate, years.toDouble())

    println(String.format("%.3f", finalAmount))
}