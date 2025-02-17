package jack.ripper.lesson_4


const  val COUNT_PROVISION_BOX_MIN = 50
const  val ALT_COUNTER_CREW = 70

fun main() {

    val countCrew = 55..70

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
                (inputCountProvisionBoxMin > COUNT_PROVISION_BOX_MIN)

    var altApproval =
                (!inputDefect) &&
                (ALT_COUNTER_CREW == inputCountCrew) &&
                (COUNT_PROVISION_BOX_MIN <= inputCountProvisionBoxMin) &&
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