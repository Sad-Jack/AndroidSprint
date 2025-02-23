package lesson_8

fun main() {
    print("Введите количество ингридиентов: ")
    val countIngredients = readln().toInt()
    println("Введите ингридиенты: ")
    val ingredients = Array(countIngredients) {
        print("${it + 1}.")
        readln()
    }
    println("Ингредиенты в рецепте: " + ingredients.joinToString(", "))
}