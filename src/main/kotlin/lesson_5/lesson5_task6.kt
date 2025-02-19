package jack.ripper.lesson_5

const val CONVERSION_FACTOR = 100.0
const val UNDERWEIGHT_THRESHOLD = 18.5
const val NORMAL_WEIGHT_THRESHOLD = 25.0
const val OVERWEIGHT_THRESHOLD = 30.0

fun main() {

    println("""
        Консольное приложение на языке Kotlin, предназначенное для вычисления индекса массы тела (ИМТ)
        пользователя и определения категории веса на основе полученного значения.
    """.trimIndent()
    )

    print("Введите ваш вес (в кг): ")
    val weight = readln().toDoubleOrNull() ?: 0.0

    print("Введите ваш рост (в см): ")
    val heightCm = readln().toDoubleOrNull() ?: 0.0

    val heightM = heightCm / CONVERSION_FACTOR
    val bmi = weight / (heightM * heightM)

    val category = when {
        bmi < UNDERWEIGHT_THRESHOLD -> "Недостаточная масса тела"
        bmi < NORMAL_WEIGHT_THRESHOLD -> "Нормальная масса тела"
        bmi < OVERWEIGHT_THRESHOLD -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ: %.2f".format(bmi))
    println("Категория: $category")
}