package jack.ripper.lesson_1

fun main() {

    val totalSeconds: Short = 6480

    val hours: Byte = (totalSeconds / 3600).toByte()
    val remainingSecondsAfterHours = totalSeconds % 3600

    val minutes: Byte = (remainingSecondsAfterHours / 60).toByte()
    val seconds: Byte = (remainingSecondsAfterHours % 60).toByte()

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)
    println("Время в космосе: [$formattedTime]")
}