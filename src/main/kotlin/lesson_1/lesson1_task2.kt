package lesson_1

fun main() {
    val totalOrders: Int = 75
    val thankYouMessage: String = "Спасибо за вашу покупку! Мы ценим ваш выбор."
    println("Всего заказов: $totalOrders")
    println(thankYouMessage)

    var workersCounter: Int = 2000
//    println("Количеcnво работников: $workersCounter")
    workersCounter -= 1
    println("Количеcnво работников: $workersCounter")
}