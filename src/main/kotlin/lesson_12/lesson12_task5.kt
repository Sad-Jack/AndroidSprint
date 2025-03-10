package lesson_12

class Weather(dayTempKelvin: Int, nightTempKelvin: Int, val hasPrecipitation: Boolean) {
    val dayTemperature: Int = dayTempKelvin - 273
    val nightTemperature: Int = nightTempKelvin - 273
}

fun main() {
    val daysInMonth = 30
    val weatherData = List(daysInMonth) {
        Weather(
            dayTempKelvin = (270..310).random(),// от -3°C до +37°C
            nightTempKelvin = (270..310).random(), // от -13°C до +27°C
            hasPrecipitation = (0..1).random() == 1
        )
    }

    val dayTemps = weatherData.map { it.dayTemperature }
    val nightTemps = weatherData.map { it.nightTemperature }
    val precipitationDays = weatherData.count { it.hasPrecipitation }

    println("Средняя дневная температура: ${dayTemps.average()}°C")
    println("Средняя ночная температура: ${nightTemps.average()}°C")
    println("Количество дней с осадками: $precipitationDays")
}