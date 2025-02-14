package jack.ripper.lesson_4

fun main() {
    val sunnyWeather = true
    val openAwning = true
    val airHumidity = 20
    val season = "winter"

    var sunnyWeatherNow = true
    var openAwningNow = true
    var airHumidityNow = 20
    var seasonNow = "winter"

    var result =
        (sunnyWeather == sunnyWeatherNow) && (openAwning == openAwningNow) && (airHumidity == airHumidityNow) && (season != seasonNow)

    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}