package lesson_8

fun main() {
    val recipeSalad = arrayOf("Огурец", "Морковь", "Картошка", "Грибы", "Чеснок")
    val userProduct = readln()
    for (i in recipeSalad.indices) {
        if (recipeSalad[i] == userProduct) {
            println("Есть в рецепте")
        } else {
            println("Нет в рецепте")
        }
    }
}