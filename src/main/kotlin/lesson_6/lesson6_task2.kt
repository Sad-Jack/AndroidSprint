package lesson_6

const val MILLISECOND_SECOND = 1000L

fun main() {
    val timing = readln().toIntOrNull() ?: 0
    Thread.sleep(MILLISECOND_SECOND * timing)
    println("Прошло $timing секунд")
}