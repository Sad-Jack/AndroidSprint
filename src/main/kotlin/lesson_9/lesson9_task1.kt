package lesson_9

fun main() {
    val ingredients = listOf("мука", "яйца", "молоко", "сахар", "соль", "масло")
    print("В рецепте есть следующие ингредиенты:\n" + ingredients.joinToString("\n"))
}