package lesson_11

data class RecipeCategory(
    val name: String,
    var picture: String,
)

data class Ingredient(
    val name: String,
    val quantity: Double,
    val unit: String,
)

data class Recipe(
    val id: Int, // Для добавления в избранное
    var picture: String,
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