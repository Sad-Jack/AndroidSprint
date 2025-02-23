package lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    var departure = "9:39"
    var flightTime = 457

    var departureHour = departure.split(":")[0].toInt()
    var departureMinute = departure.split(":")[1].toInt()

    var departureTimeInMinutes = departureHour * MINUTES_IN_HOUR + departureMinute

    var comingTimeInMinutes = flightTime + departureTimeInMinutes

    var comingHours = comingTimeInMinutes / MINUTES_IN_HOUR
    var comingMinutes = comingTimeInMinutes % MINUTES_IN_HOUR

    val formattedTime = String.format("%02d:%02d", comingHours, comingMinutes)

    println("Время прибытия поезда: [$formattedTime]")

}