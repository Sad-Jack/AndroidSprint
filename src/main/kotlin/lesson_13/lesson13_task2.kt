package lesson_13

class ContactInfo(val name: String, val phoneNumber: Long, val company: String? = null) {
    fun printInfo() {
        println("Имя: $name,\nНомер: $phoneNumber,\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contact1 = ContactInfo("Ростислав", 89123456789, "Reddit")
    val contact2 = ContactInfo("Анна", 89227654321)

    contact1.printInfo()
    contact2.printInfo()
}