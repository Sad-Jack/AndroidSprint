package lesson_11;

data class User4(val userId: Int, val userName: String)

data class Message(val authorId: Int, val message: String)

class Forum {
    private val users = mutableListOf<User4>()
    private val messages = mutableListOf<Message>()
    private var currentUserId = 1

    fun createNewUser(userName: String): Forum {
        val user = User4(userId = currentUserId++, userName = userName)
        users.add(user)
        return this
    }

    fun createNewMessage(authorId: Int, messageText: String): Forum {
        val user = users.find { it.userId == authorId }
        if (user != null) {
            val message = Message(authorId = authorId, message = messageText)
            messages.add(message)
        } else {
            println("Пользователь с id $authorId не найден!")
        }
        return this
    }

    fun printThread(): Forum {
        if (messages.isEmpty()) {
            println("Нет сообщений на форуме.")
        } else {
            messages.forEach { message ->
                val user = users.find { it.userId == message.authorId }
                println("${user?.userName ?: "Неизвестный"}: ${message.message}")
            }
        }
        return this
    }
}

fun main() {
    Forum()
        .createNewUser("Alice")
        .createNewUser("Bob")
        .createNewMessage(1, "Привет, форум!")
        .createNewMessage(2, "Привет, Alice!")
        .createNewMessage(1, "Как дела?")
        .createNewMessage(2, "Отлично, спасибо!")
        .printThread()
}