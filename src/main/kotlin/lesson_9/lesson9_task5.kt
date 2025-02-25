package lesson_9

fun main() {
    println("Введите 5 уникальных ингредиентов:")
    val ingredients = List(5) { readln().trim() }.toSet().sorted()
    val ingredientsString = ingredients.joinToString(", ").replaceFirstChar { it.uppercaseChar() }
    println("Ингредиенты в рецепте: $ingredientsString")
}