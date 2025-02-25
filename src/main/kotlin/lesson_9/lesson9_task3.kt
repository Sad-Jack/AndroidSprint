package lesson_9

fun main() {
    val ingredients = listOf(2, 50, 15)

    print("Введите количество порций: ")
    val portions = readln().toIntOrNull() ?: 1
    val totalIngredients = ingredients.map {it * portions}

    println("На $portions порций вам понадобится:")
    println("Яиц – ${totalIngredients[0]} шт.")
    println("Молока – ${totalIngredients[1]} мл.")
    println("Сливочного масла – ${totalIngredients[2]} гр.")
}