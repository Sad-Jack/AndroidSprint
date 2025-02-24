package lesson_9

fun main() {
    val ingredients = listOf(2, 50, 15)

    print("Введите количество порций: ")
    val portions = readln().toIntOrNull() ?: 1

    val eggs = ingredients[0] * portions
    val milk = ingredients[1] * portions
    val butter = ingredients[2] * portions

    println("На $portions порций вам понадобится:")
    println("Яиц – $eggs шт.")
    println("Молока – $milk мл.")
    println("Сливочного масла – $butter гр.")
}