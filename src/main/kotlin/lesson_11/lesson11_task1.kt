package lesson_11

class User(
    private val token: String,
    private val login: String,
    private val password: String,
    private val email: String
) {
    override fun toString(): String {
        return """
            |token = '$token',
            |login = '$login',
            |password = '$password',
            |email = '$email'
        """.trimMargin()
    }
}

fun main() {
    val user1 = User("sd1esd1213", "Jack", "Las_123", "ema@il.ru")
    val user2 = User("adss12asd3", "Kit", "CRW_123", "em@il.com")

    println(user1)
    println(user2)
}