package jack.ripper.lesson_4

fun main() {
    val totalTables = 13
    var bookingToday = 13
    var bookingTomorrow = 9

    val availableTablesToday = bookingToday >= totalTables
    val availableTablesTomorrow = bookingTomorrow >= totalTables

    println("[Доступность столиков на сегодня: $availableTablesToday ],\n" +
            "[Доступность столиков на завтра: $availableTablesTomorrow ].")
}