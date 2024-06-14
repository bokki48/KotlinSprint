package org.example.lesson_5

fun main() {
    print("Решите пример: 45 + 49 = ")
    val userAnswer = readLine()?.toInt()

    if (userAnswer == 94) println("Добро пожаловать!")
    else println("Доступ запрещён.")
}