package jack.ripper.lesson_5

const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"

fun main() {

    var messageWelcome = """
        Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold".
        [вздыхает...] 
        Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа.
        Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь.
        [вздыхает ещё глубже...]
        Да, вперед, пожалуйста, вводите свои данные...

    """.trimIndent()
    val messageSuccessfulAuthorization = """
        [вздыхает...]
        Ваши данные проверены, и о, чудо, они верны...
        Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold".
        Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов...
        [меланхолический вздох...]
        Надеюсь, вам понравится пребывание здесь больше, чем мне.

    """.trimIndent()
    val messageUnsuccessfulAuthorization = """
        [вздыхает...]
        Данные введены неверно...
        Пройди регистрацию и попробуйте еще раз...
        [Увел взгляд...]
    """.trimIndent()

    println(messageWelcome)
    println("Введите имя пользователя:")
    val isSuccessName = readLine()!!.toString() == LOGIN
    println("Введите пароль:")
    val isSuccessPassword = readLine()!!.toString() == PASSWORD

    if (isSuccessName && isSuccessPassword) print(messageSuccessfulAuthorization)
    else print(messageUnsuccessfulAuthorization)
}