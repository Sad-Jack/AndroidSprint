package jack.ripper.lesson_4

fun main() {

    val countCrew = 55..70
    val countProvisionBoxMin = 50

    val altCountCrew = 70


    println("Наличие повреждений корпуса: ")
    var inputDefect = readln().toBoolean()

    println("Количество экипажа: ")
    var inputCountCrew = readln().toInt()

    println("Количество ящиков провизии: ")
    var inputCountProvisionBoxMin = readln().toInt()

    println("Текущая погода: ")
    var inputWeather = readln().toBoolean() // true - благоприятна or false - неблагоприятная

    var approval =
                (inputDefect) &&
                (inputCountCrew in countCrew) &&
                (inputCountProvisionBoxMin > countProvisionBoxMin)

    var altApproval =
                (!inputDefect) &&
                (altCountCrew == inputCountCrew) &&
                (countProvisionBoxMin <= inputCountProvisionBoxMin) &&
                (inputWeather)

    println(
        """
        Разрешения выхода на воду : ${approval || altApproval}
        
        Наличие повреждений корпуса - $inputDefect
        Количество членов экипажа   - $inputCountCrew
        Количество провизии         - $inputCountProvisionBoxMin
        Текущая погода              - $inputWeather
        
    """.trimIndent()
    )
}