package lesson_13

class ContactEntryV2(val name: String, val phoneNumber: Long, val company: String? = null) {
    fun printInfo() {
        println("Имя: $name,\nНомер: $phoneNumber,\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contactList = mutableListOf<ContactEntryV2>()

    while (true) {
        println("Введите имя (или 'exit' для выхода): ")
        val name = readln()
        if (name.lowercase() == "exit") break

        println("Введите номер телефона: ")
        val phoneNumber = readln().toLongOrNull()
        if (phoneNumber == null) {
            println("Ошибка: номер телефона должен быть числом!")
            continue
        }

        println("Введите название компании (или оставьте пустым): ")
        val company = readln().ifBlank { null }

        contactList.add(ContactEntryV2(name, phoneNumber, company))
    }

    println("\nСохранённые контакты:")
    contactList.forEach { it.printInfo()}
}