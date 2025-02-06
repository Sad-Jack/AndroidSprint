package jack.ripper.lesson_2

const val PERCENT_DIVISOR = 100.0

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffPercent = 20.0
    val buffCoefficient = buffPercent / PERCENT_DIVISOR

    val bonusCrystal = (crystalOre * buffCoefficient).toInt()
    val bonusIron = (ironOre * buffCoefficient).toInt()

    println("Кристаллическая руда: $bonusCrystal")
    println("Железная руда: $bonusIron")
}