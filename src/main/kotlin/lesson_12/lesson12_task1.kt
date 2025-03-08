package lesson_12

class WeatherDay {
    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var hasPrecipitation: Boolean = false

    fun printWeather() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Осадки: ${if (hasPrecipitation) "Да" else "Нет"}")
        println("---------------")
    }
}

fun main() {
    val weather1 = WeatherDay()
    weather1.dayTemperature = 25
    weather1.nightTemperature = 15
    weather1.hasPrecipitation = true

    val weather2 = WeatherDay()
    weather2.dayTemperature = 30
    weather2.nightTemperature = 20
    weather2.hasPrecipitation = false

    weather1.printWeather()
    weather2.printWeather()
}