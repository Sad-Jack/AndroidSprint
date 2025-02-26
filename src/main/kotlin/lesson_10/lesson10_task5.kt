package lesson_10

const val LOGIN = "login"
const val PASSWORD = "password"

val userBasket = arrayOf("Ноутбук", "Смартфон", "Наушники")
val chars = (('0'..'9') + ('a'..'z') + ('A'..'Z')).toList()

fun main() {
    val token: String? = authUser()
    val basket = getBasket(token)
    if (basket != null) {
        println("Ваша корзина: ${basket.joinToString(", ")}")
    } else {
        println("Ошибка: повторите авторизацию!")
    }
}

fun authUser(): String? {
    print("Ввдите логин: ")
    val login = readln()
    print("Ввдите пароль: ")
    val password = readln()
    return if (verifyCredentials(login, password)) generateToken() else null
}

fun generateToken(): String {
    return (1..32).map { chars.random() }.joinToString("")
}

fun verifyCredentials(login: String, password: String): Boolean {
    return login == LOGIN && password == PASSWORD
}

fun getBasket(token: String?): Array<String>? {
    return if (token != null) { userBasket } else null
}