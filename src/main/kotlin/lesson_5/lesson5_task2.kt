package lesson_5

const val AGE_OF_MAJORITY = 18
const val AGE_SEVENTEEN = 17
const val AGE_SIXTEEN = 16

const val CURRENT_YEAR = 2025

fun main() {
    val userYearBirth = readln().toIntOrNull() ?: CURRENT_YEAR

    val userAge = CURRENT_YEAR - userYearBirth

    val resultText = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом."
    else if (userAge == AGE_SIXTEEN || userAge == AGE_SEVENTEEN) "Показать экран с ограниченным контентом."
    else "Вернуться на главный экран."

    println(resultText)

}