package lesson_9

fun main() {
    val ingredients = listOf("мука", "яйца", "молоко", "сахар", "соль", "масло")
    print("Ингредиенты в рецепте:\n" + ingredients.joinToString("\n"))
}