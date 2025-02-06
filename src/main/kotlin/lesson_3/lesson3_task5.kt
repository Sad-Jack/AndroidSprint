package jack.ripper.lesson_3

fun main() {
    val moveString = "D2-D4;0"

    val moveParts = moveString.split(";")
    val moveCoordinates = moveParts[0].split("-")

    val from = moveCoordinates[0]
    val to = moveCoordinates[1]
    val moveNumber = moveParts[1].toInt()

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNumber")
}