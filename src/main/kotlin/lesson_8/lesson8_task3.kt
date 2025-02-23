package lesson_8

fun main() {
    val ingredients = arrayOf("мука", "яйца", "молоко", "сахар", "соль", "масло")

    println("Введите ингредиент, который хотите найти:")
    val userIngredient = readln()

    val isIngredientFound = userIngredient in ingredients

    if (isIngredientFound) {
        println("Ингредиент \"$userIngredient\" в рецепте есть.")
    } else {
        println("Такого ингредиента в рецепте нет.")
    }
}