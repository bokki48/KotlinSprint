package org.example.lesson_5

const val CORRECT_ANSWCER = 94

fun main() {
    print("Решите пример: 45 + 49 = ")
    val userAnswer = readln().toInt()

    if (userAnswer == CORRECT_ANSWCER) println("Добро пожаловать!")
    else println("Доступ запрещён.")
}