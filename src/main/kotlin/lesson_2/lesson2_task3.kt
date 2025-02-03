package jack.ripper.lesson_2

fun main() {
    var departure = "9:39"
    var flightTime = 457

    var departureHour = departure.split(":")[0].toInt()
    var departureMinute = departure.split(":")[1].toInt()

    var departureTimeInMinutes = departureHour * 60 + departureMinute

    var comingTimeInMinutes = flightTime + departureTimeInMinutes

    var comingHours = comingTimeInMinutes / 60
    var comingMinutes = comingTimeInMinutes % 60

    println("Время прибытия поезда: [$comingHours:$comingMinutes]")

}