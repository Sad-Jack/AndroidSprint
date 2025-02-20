package jack.ripper.lesson_6

const val MILLISECOND_SECOND = 1000L

fun main() {

    var timing = readln().toIntOrNull() ?: 0
    val passTime = timing

    while (timing > 0) {
        Thread.sleep(MILLISECOND_SECOND)
        timing--
    }

    println("Прошло $passTime секунд")
}