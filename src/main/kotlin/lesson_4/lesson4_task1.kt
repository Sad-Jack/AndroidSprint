package jack.ripper.lesson_4

const val TOTAL_TABLES = 13

fun main() {
    val bookingToday = 13
    val bookingTomorrow = 9

    val availableTablesToday = bookingToday >= TOTAL_TABLES
    val availableTablesTomorrow = bookingTomorrow >= TOTAL_TABLES

    println("[Доступность столиков на сегодня: $availableTablesToday ],\n" +
            "[Доступность столиков на завтра: $availableTablesTomorrow ].")
}