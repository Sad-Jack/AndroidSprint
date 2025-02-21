package jack.ripper.lesson_6

const val MILLISECOND_SECOND = 1000L  //todo Не знаю что делать с конфликтом констант после мерджа веток

fun main() {

    print("Введите количество секунд: ")

    var timing = readln().toIntOrNull() ?: 0
    val passTime = timing

    while (timing > 0) {
        println("Осталось секунд: ${timing--}")
        Thread.sleep(MILLISECOND_SECOND)
    }

    println("Прошло $passTime секунд")
}