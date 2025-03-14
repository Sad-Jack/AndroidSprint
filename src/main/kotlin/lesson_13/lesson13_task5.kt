package lesson_13

class SafeContact(val name: String, val phoneNumber: Long, val company: String? = null) {
    fun printInfo() {
        println("Имя: $name, Номер: $phoneNumber, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    println("Введите имя:")
    val name = readln()

    println("Введите номер телефона:")
    val phoneNumber: Long? = try {
        readln().toLong()
    } catch (e: NumberFormatException) {
        println("Ошибка: ${e::class.simpleName} — введено некорректное значение!")
        null
    }

    if (phoneNumber != null) {
        println("Введите название компании (или оставьте пустым):")
        val company = readln().ifBlank { null }

        val contact = SafeContact(name, phoneNumber, company)
        contact.printInfo()
    } else {
        println("Контакт не был создан из-за ошибки ввода номера телефона.")
    }
}