package jack.ripper.lesson_1

fun main() {
    val totalOrders: Int = 75
    val thankYouMessage: String = "Спасибо за вашу покупку! Мы ценим ваш выбор."
    var workers = 2000

    println("Всего заказов: $totalOrders")
    println(thankYouMessage)

    println("Количество работников: $workers")
    workers -= 1
    println("Количество работников: $workers")
}