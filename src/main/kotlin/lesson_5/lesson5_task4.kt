package org.example.lesson_5

fun main() {
    val authorizedUserName = "Zaphod"
    val authorizedUserPassword = "PanGalactic"

    print("Введите имя пользователя: ")
    val enteringUserName = readLine()!!
    if (enteringUserName == authorizedUserName) {
        print("Введите пароль: ")
        val enteringUserPassword = readLine()!!
        if (enteringUserPassword == authorizedUserPassword) println("Уважаемый $enteringUserName, добро пожаловать на борт корабля!")
        else println("Пароль неверный! Повторите попытку входа.")
    } else println("Пользователя с именем \"$enteringUserName\" не существует! Давайте зарегестрируемся?")
}

