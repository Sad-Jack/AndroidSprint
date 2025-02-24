package lesson_8

fun main() {
    val ingredients = arrayOf("мука", "яйца", "молоко", "сахар", "соль", "масло")
    var isIngredientFound = false

    println("Введите ингредиент, который хотите найти:")
    val userIngredient = readln()

    for (ingredient in ingredients) {
        if (ingredient == userIngredient) {
            isIngredientFound = true
            break
        }
    }

    if (isIngredientFound) {
        println("Ингредиент \"$userIngredient\" в рецепте есть.")
    } else {
        println("Такого ингредиента в рецепте нет.")
    }
}