package lesson_10

const val LOGIN = "login"
const val PASSWORD = "password"

val userBasket = arrayOf("Ноутбук", "Смартфон", "Наушники")

fun main() {
    val token: String? = generateToken(authUser())
    val basket = getBasket(token)
    if (basket != null) {
        println("Ваша корзина: ${basket.joinToString(", ")}")
    } else {
        println("Ошибка: повторите авторизацию!")
    }
}

fun generateToken(isAuth: Boolean): String? {
    if (isAuth) {
        val digits = ('0'..'9')
        val lowerCase = ('a'..'z')
        val upperCase = ('A'..'Z')
        val chars = (digits + lowerCase + upperCase).toList()
        return (1..32).map { chars.random() }.joinToString("")
    }
    return null
}

fun verificationData(login: String, password: String): Boolean {
    return (login == LOGIN && password == PASSWORD)
}

fun authUser(): Boolean {
    print("Ввдите логин: ")
    val login = readln()
    print("Ввдите пароль: ")
    val password = readln()
    return verificationData(login, password)
}

fun getBasket(token: String?): Array<String>? {
    return if (token != null) { userBasket } else null
}