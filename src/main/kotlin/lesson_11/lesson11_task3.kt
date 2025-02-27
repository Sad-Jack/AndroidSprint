package lesson_11

enum class Status(val status: String) {
    TALKING("разговаривает"),
    MICROPHONE_OFF("микрофон выключен"),
    MUTED("пользователь заглушен"),
}


class User3(
    private val avatar: String,
    private val name: String,
    private var status: Status = Status.MICROPHONE_OFF,
) {
    fun getName() = name
    fun getAvatar() = avatar

    fun updateStatus(newStatus: Status) {
        status = newStatus
        println("$name: $status")
    }
}


class RoomFeed(
    private val rooms: MutableList<Room> = mutableListOf()
) {
    fun addRoom(room: Room) {
        rooms.add(room)
        println("Добавлена новая комната: ${room.getName()}")
    }

    fun showRooms() {
        if (rooms.isNotEmpty()){
            println("Список комнат.")
            rooms.forEach {
                println("Название комнаты: ${it.getName()}")
            }
        } else {
            println("Список комнат пуст.")
        }

    }
}


class Room(
    private val name: String,
    private val avatar: String,
    private val users: MutableList<User3>,
) {
    fun getName() = name

    fun getInfo() {
        println("Название комнаты: $name")
        println("Аватар комнаты: $avatar")
        println("Список пользователей:")
        users.forEach {
            println("\tИмя пользователя: ${it.getName()}")
            println("\tАватар пользователя: ${it.getAvatar()}")
        }
        println()
    }

    fun addUser(user: User3) {
        users.add(user)
        println("Новый пользователь: ${user.getName()}")
    }

    fun updateUserStatus(userName: String, newStatus: Status) {
        users.find { it.getName() == userName }?.updateStatus(newStatus) ?: println("Пользователь не найден")
    }
}


fun main() {
    val roomFeed = RoomFeed()
    roomFeed.addRoom(room1)
    roomFeed.addRoom(room2)

    roomFeed.showRooms()

    room1.getInfo()
    room1.addUser(user3)

    room1.getInfo()

    room1.updateUserStatus("Jack", Status.MICROPHONE_OFF)
    room1.updateUserStatus("Kitty", Status.TALKING)
    room1.updateUserStatus("Crabs", Status.MUTED)
}

val user1 = User3("avatar1", "Jack")
val user2 = User3("avatar2", "Crabs")
val user3 = User3("avatar3", "Kitty")
val user4 = User3("avatar4", "Lion")

val userInRoom1 = mutableListOf(user1, user2)
val userInRoom2 = mutableListOf(user4)

val room1 = Room("game", "avatar1", userInRoom1)
val room2 = Room("anime", "avatar2", userInRoom2)