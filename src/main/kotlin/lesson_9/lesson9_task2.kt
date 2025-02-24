package lesson_9

fun main() {
    val ingredients = mutableListOf("мука", "яйца", "молоко")
    println("В рецепте есть базовые ингредиенты: " + ingredients.joinToString(", "))
    print("Желаете добавить еще? ")
    val isWant = readln().lowercase() == "да"
    if (isWant) {
        print("Какой ингредиент вы хотите добавить? ")
        ingredients.add(readln())
        print("Теперь в рецепте есть следующие ингредиенты: " + ingredients.joinToString(", "))
    }
}
