package jack.ripper.lesson_5

fun main() {
    val robotTest = "111 + 999 = "
    val answer = 1110

    println("Авторизация в системе...")
    println("Пожалуйста, решите пример, чтобы подтвердить, что вы не бот.")
    print(robotTest)

    val inputAnswer = readLine()?.toIntOrNull()
    val isHuman = inputAnswer == answer

    if (isHuman) {
        println("Добро пожаловать!")
    } else {
        println("До свидания!")
    }
}