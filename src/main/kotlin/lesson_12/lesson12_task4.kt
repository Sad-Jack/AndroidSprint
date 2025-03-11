package lesson_12

class WeatherKelvin(dayTempKelvin: Int, nightTempKelvin: Int, hasPrecipitation: Boolean) {
    val dayTemperature: Int = dayTempKelvin - 273
    val nightTemperature: Int = nightTempKelvin - 273

    init {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Осадки: ${if (hasPrecipitation) "Да" else "Нет"}")
        println("---------------")
    }
}

fun main() {
    WeatherKelvin(300, 285, true)
}