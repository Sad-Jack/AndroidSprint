package lesson_8

fun main() {
    val ingredients = arrayOf("мука", "яйца", "молоко", "сахар", "соль", "масло")

    println("Ингредиенты в рецепте: " + ingredients.joinToString(", "))

    print("Введите ингредиент, который хотите заменить: ")
    val replaceable = readln().lowercase()
    val indexIngredient = ingredients.indexOf(replaceable)

    if (indexIngredient != -1) {
        print("Введите ингредиент, который будет заменять его: ")
        val replacement = readln().lowercase()
        ingredients[indexIngredient] = replacement

        println("Ингредиенты в рецепте: " + ingredients.joinToString(", "))
    } else {
        println("Такого ингредиента в рецепте нет.")
    }
}
