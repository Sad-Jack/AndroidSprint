package lesson_13

class ContactEntry(val name: String, val phoneNumber: Long, val company: String? = null) {
    fun printInfo() {
        println("Имя: $name,\nНомер: $phoneNumber,\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contacts = listOf(
        ContactEntry("Ростислав", 89123456789, "Reddit"),
        ContactEntry("Анна", 89227654321),
        ContactEntry("Игорь", 89051234567, "null"),
        ContactEntry("Мария", 89998887766, "Google"),
        ContactEntry("Сергей", 88005553535)
    )

    val companies = contacts.mapNotNull { it.company }.toSet()
    println("Список компаний в телефонной книге: $companies")
}