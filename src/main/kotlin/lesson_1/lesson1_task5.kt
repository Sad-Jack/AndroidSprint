package jack.ripper.lesson_1

fun main() {

    val totalSeconds: Short = 6480

    val hours: Byte = (totalSeconds / 3600).toByte()
    val remainingSecondsAfterHours = totalSeconds % 3600

    val minutes: Byte = (remainingSecondsAfterHours / 60).toByte()
    val seconds: Byte = (remainingSecondsAfterHours % 60).toByte()

    println("Время в космосе: [$hours:$minutes:$seconds]")
}