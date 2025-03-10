package lesson_12

class KelvinWeather(dayTempKelvin: Int, nightTempKelvin: Int, val hasPrecipitation: Boolean) {
    val dayTemperature: Int = dayTempKelvin - 273
    val nightTemperature: Int = nightTempKelvin - 273

    fun printWeather() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Осадки: ${if (hasPrecipitation) "Да" else "Нет"}")
        println("---------------")
    }
}

fun main() {
    val todayWeather = KelvinWeather(300, 285, true)
    todayWeather.printWeather()
}