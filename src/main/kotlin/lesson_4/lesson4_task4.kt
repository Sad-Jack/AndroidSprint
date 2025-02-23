package lesson_4

fun main() {
    val day = 5
    val isArmsAndAbsDay = (day % 2 == 1)
    val isLegsAndBackDay = !isArmsAndAbsDay

    println("""
        Упражнения для рук:   $isArmsAndAbsDay
        Упражнения для ног:   $isLegsAndBackDay
        Упражнения для спины: $isLegsAndBackDay
        Упражнения для пресса:$isArmsAndAbsDay
        """
    )
}