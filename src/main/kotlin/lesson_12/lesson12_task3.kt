package lesson_12

class KelvinWeather(dayTempKelvin: Int, nightTempKelvin: Int, val hasPrecipitation: Boolean) {

    val dayTemperature: Int = dayTempKelvin - 273
    val nightTemperature: Int = nightTempKelvin - 273

    fun printWeather() {
        println("Дневная температура: $dayTemperature°C")
    }
}