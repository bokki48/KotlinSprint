package org.example.lesson_5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2024

fun main() {
    print("Введите год Вашего рождения: ")
    val userYearBith = readLine()!!.toInt()

    if (CURRENT_YEAR - userYearBith >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом.")
    else println("Вернуться на главный экран.")
}