package lesson_9

fun main() {
    print("Введите 5 ингредиентов через \", \" : ")
    val ingredientsInput = readln()

    val ingredients = ingredientsInput.split(",").map { it.trim() }

    if (ingredients.size != 5) {
        println("Ошибка: введите ровно 5 ингредиентов, разделенных запятыми и пробелом.")
        return
    }

    val ingredientsSort = ingredients.sorted()
    println("Отсортированные ингредиенты: ${ingredientsSort.joinToString(", ")}")

}