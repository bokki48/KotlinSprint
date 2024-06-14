package org.example.lesson_5

import kotlin.random.Random


fun main() {
    val firstWinningNumber = Random.nextInt(0, 42) % 43
    val secondWinningNumber = Random.nextInt(0, 42) % 43
    val thirdWinningNumber = Random.nextInt(0, 42) % 43
    val listWinningNumbers = listOf(firstWinningNumber, secondWinningNumber, thirdWinningNumber)

    print("Введите первое число: ")
    val firstEnteringNumber = readLine()!!.toInt()
    print("Введите второе число: ")
    val secondEnteringNumber = readLine()!!.toInt()
    print("Введите третье число: ")
    val thirdEnteringNumber = readLine()!!.toInt()
    val listEnteringNumbers = listOf(firstEnteringNumber, secondEnteringNumber, thirdEnteringNumber)

    val countOfMatchedNumbers = (listWinningNumbers.intersect(listEnteringNumbers)).size
    when {
        countOfMatchedNumbers == 3 -> println("Поздравляем, Вы выиграли джекпот!")
        countOfMatchedNumbers == 2 -> println("Вы выиграли крупный приз!")
        countOfMatchedNumbers == 1 -> println("Не расстраиваетесь, Вы выиграли утешительный приз!")
        else -> println("К сожалению, Вы не угадали ни одного числа.")
    }

    print("Выигрышная комбинация: ")
    listWinningNumbers.forEach { print("$it ") }
}