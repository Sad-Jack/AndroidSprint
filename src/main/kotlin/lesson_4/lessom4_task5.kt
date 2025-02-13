package jack.ripper.lesson_4

fun main() {

    val defect = false
    val countCrew = 55..70
    val countProvisionBoxMin = 50

    val altCountCrew = 70
    val altCountProvisionBoxMin = 50
    val weather = true


    println("Наличие повреждений корпуса: ")
    var inputDefect = readln().toBoolean()

    println("Количество экипажа: ")
    var inputCountCrew = readln().toInt()

    println("Количество ящиков провизии: ")
    var inputCountProvisionBoxMin = readln().toInt()

    println("Текущая погода: ")
    var inputWeather = readln().toBoolean() // true - благоприятна or false - неблагоприятная

    var approval =
                (defect == inputDefect) &&
                (inputCountCrew in countCrew) &&
                (countProvisionBoxMin < inputCountProvisionBoxMin)

    var altApproval =
                (defect != inputDefect) &&
                (altCountCrew == inputCountCrew) &&
                (altCountProvisionBoxMin <= inputCountProvisionBoxMin) &&
                (weather == inputWeather)

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