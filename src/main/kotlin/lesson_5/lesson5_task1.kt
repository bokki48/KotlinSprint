package org.example.lesson_5

const val CORRECT_ANSWER = 94
const val FIRST_SUMMAND = 45
const val SECOND_SUMMAND = 49

fun main() {
    print("Решите пример: $FIRST_SUMMAND + $SECOND_SUMMAND = ")
    val userAnswer = readln().toInt()

    if (userAnswer == CORRECT_ANSWER) println("Добро пожаловать!")
    else println("Доступ запрещён.")
}