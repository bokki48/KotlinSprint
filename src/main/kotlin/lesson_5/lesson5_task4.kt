package org.example.lesson_5

const val AUTHORIZED_USER_NAME = "Zaphod"
const val AUTHORIZED_USER_PASSWORD = "PanGalactic"

fun main() {
    print("Введите имя пользователя: ")
    val enteringUserName = readLine()!!

    if (enteringUserName == AUTHORIZED_USER_NAME) {
        print("Введите пароль: ")
        val enteringUserPassword = readLine()!!
        if (enteringUserPassword == AUTHORIZED_USER_PASSWORD)
            println("Уважаемый $enteringUserName, добро пожаловать на борт корабля!")
        else println("Пароль неверный! Повторите попытку входа.")
    } else println("Пользователя с именем \"$enteringUserName\" не существует! Давайте зарегестрируемся?")
}

