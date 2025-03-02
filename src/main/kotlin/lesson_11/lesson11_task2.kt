//package lesson_11
//
//class User2(
//    private val token: String,
//    private val login: String,
//    private var password: String,
//    private val email: String,
//    private var bio: String = "",
//) {
//    override fun toString(): String {
//        return """
//            |token = '$token',
//            |login = '$login',
//            |password = '$password',
//            |email = '$email',
//            |bio = '$bio'
//        """.trimMargin()
//    }
//
//    private fun verifyPassword(inputPassword: String): Boolean {
//        return this.password == inputPassword
//    }
//
//    private fun setPassword(newPassword: String) {
//        password = newPassword
//        println("Пароль изменен")
//    }
//
//    fun changePassword() {
//        print("Введите старый пароль: ")
//        val oldPassword = readln()
//        print("Введите новый пароль: ")
//        val newPassword = readln()
//        return if (verifyPassword(oldPassword)) setPassword(newPassword) else println("Неверный пароль")
//    }
//
//    fun updateBio() {
//        print("Введите информацию о себе: ")
//        bio = readln().trim()
//        println("Информация о себе обновлена!")
//    }
//}
//
//val user1 = User2("sa3eADSD43daADASDSDs32AD4d", "Jack", "avosend", "sad@ya.ru")
//
//fun main() {
//    println("Обновление информации о себе!")
//    user1.updateBio()
//    println()
//
//    println("Изменение пароля!")
//    user1.changePassword()
//    println()
//
//    println("Вывод информации о пользователе!")
//    println(user1.toString())
//    println()
//}
