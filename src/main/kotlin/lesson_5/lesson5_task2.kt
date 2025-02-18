package jack.ripper.lesson_5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2025

fun main() {
    val userYearBirth = readLine()!!.toInt()

    val userAge = CURRENT_YEAR - userYearBirth

    val resultText = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом."
    else if (userAge == 16 || userAge == 17) "Показать экран с ограниченным контентом."
    else "Вернуться на главный экран."

    println(resultText)

}