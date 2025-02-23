package lesson_5

const val FUEL_CONSUMPTION_DIVISOR = 100.0

fun main() {

    print("Введите расстояние поездки (в километрах): ")
    val distance = readln().toFloat()

    print("Введите расход топлива на 100 км (в литрах): ")
    val fuelConsumption = readln().toFloat()

    print("Введите текущую цену за литр топлива: ")
    val pricePerLiter = readln().toFloat()

    val totalFuel = (distance * fuelConsumption) / FUEL_CONSUMPTION_DIVISOR
    val totalCost = totalFuel * pricePerLiter

    println("Общее количество необходимого топлива (в литрах): ${"%.2f".format(totalFuel)}")
    println("Итоговая стоимость поездки: ${"%.2f".format(totalCost)}")
}