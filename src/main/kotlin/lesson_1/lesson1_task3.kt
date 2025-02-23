package lesson_1

fun main() {
    val flightYear = 1961
    var flightHour = "09"
    var flightMinute = "07"

    print(""" 
        Время взлета:
        год - $flightYear,
        час - $flightHour,
        минуты - $flightMinute
        
    """.trimIndent())

    flightHour = "10"
    flightMinute = "55"

    println("Время посадки: [$flightHour:$flightMinute]")

}