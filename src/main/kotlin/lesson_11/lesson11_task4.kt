package lesson_11

data class RecipeCategory(
    val id: Int,
    val name: String,
    var image: String,
    val description: String,
)

data class Ingredient(
    val id: Int,
    val name: String,
    val quantity: Double,
    val unit: String,
)

data class Recipe(
    val id: Int, // Для добавления в избранное
    var image: String,
    val title: String,
    val description: String,
    val ingredients: List<Ingredient>,
    val category: RecipeCategory,
    val cookingTimeMinutes: Int,
) {

    fun scaleIngredients(quantity: Int): List<Ingredient> {
        return ingredients.map { it.copy(quantity = it.quantity * quantity) }
    }

}