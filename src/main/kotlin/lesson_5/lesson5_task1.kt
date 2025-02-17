package jack.ripper.lesson_5

fun main() {
    val operantOne = 11
    val operantTwo = 99
    val answer = operantOne + operantTwo

    println("Авторизация в системе...")
    println("Пожалуйста, решите пример, чтобы подтвердить, что вы не бот.")
    print("$operantOne + $operantTwo = ")

    val inputAnswer = readLine()?.toIntOrNull()
    val isHuman = inputAnswer == answer

    if (isHuman) {
        println("Добро пожаловать!")
    } else {
        println("До свидания!")
    }
}