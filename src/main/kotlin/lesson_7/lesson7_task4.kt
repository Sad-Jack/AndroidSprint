package lesson_7

import lesson_6.MILLISECOND_SECOND

fun main() {
    println("Таймер.")
    print("Введите время в секундах: ")
    val seconds = readln().toInt()
    for (i in seconds downTo 0) {
        println(i)
        Thread.sleep(MILLISECOND_SECOND)
    }
    println("Время вышло.")
}