package jack.ripper.lesson_1

const val SECONDS_IN_HOUR = 3600

fun main() {

    val totalSeconds = 6480

    val hours = totalSeconds / SECONDS_IN_HOUR
    val remainingSecondsAfterHours = totalSeconds % SECONDS_IN_HOUR

    val minutes = remainingSecondsAfterHours / 60
    val seconds = remainingSecondsAfterHours % 60

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println("Время в космосе: [$formattedTime]")
}