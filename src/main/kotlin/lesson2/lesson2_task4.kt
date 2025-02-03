package jack.ripper.lesson2

fun main() {
    val crystalOre: Int = 7
    val ironOre: Int = 11
    val buffPercent: Double = 0.2

    val bonusCrystal = (crystalOre * buffPercent).toInt()
    val bonusIron = (ironOre * buffPercent).toInt()

    println("Кристаллическая руда: $bonusCrystal")
    println("Железная руда: $bonusIron")
}