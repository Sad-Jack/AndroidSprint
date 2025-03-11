package lesson_12

class DailyWeather(val dayTemperature: Int, val nightTemperature: Int, val hasPrecipitation: Boolean) {
    fun printWeather() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Осадки: ${if (hasPrecipitation) "Да" else "Нет"}")
        println("---------------")
    }
}

fun main() {
    val todayWeather = DailyWeather(28, 18, true)
    todayWeather.printWeather()
}