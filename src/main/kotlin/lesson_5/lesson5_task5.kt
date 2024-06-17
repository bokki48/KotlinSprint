package org.example.lesson_5

import kotlin.random.Random

const val THREE_MATCHED_NUMBERS = 3
const val TWO_MATCHED_NUMBERS = 2
const val ONE_MATCHED_NUMBERS = 1
const val LOW_MATCHED_NUMBERS = 0
const val NOT_INCLUDED_HIGH_MATCHED_NUMBERS = 43

fun main() {
    val firstWinningNumber =
        Random.nextInt(LOW_MATCHED_NUMBERS, NOT_INCLUDED_HIGH_MATCHED_NUMBERS) % NOT_INCLUDED_HIGH_MATCHED_NUMBERS
    val secondWinningNumber =
        Random.nextInt(LOW_MATCHED_NUMBERS, NOT_INCLUDED_HIGH_MATCHED_NUMBERS) % NOT_INCLUDED_HIGH_MATCHED_NUMBERS
    val thirdWinningNumber =
        Random.nextInt(LOW_MATCHED_NUMBERS, NOT_INCLUDED_HIGH_MATCHED_NUMBERS) % NOT_INCLUDED_HIGH_MATCHED_NUMBERS
    val listWinningNumbers = listOf(firstWinningNumber, secondWinningNumber, thirdWinningNumber)

    println(firstWinningNumber)
    println(secondWinningNumber)
    println(thirdWinningNumber)

    print("Введите первое число: ")
    val firstEnteringNumber = readln().toInt()
    print("Введите второе число: ")
    val secondEnteringNumber = readln().toInt()
    print("Введите третье число: ")
    val thirdEnteringNumber = readln().toInt()
    val listEnteringNumbers = listOf(firstEnteringNumber, secondEnteringNumber, thirdEnteringNumber)

    val countOfMatchedNumbers = (listWinningNumbers.intersect(listEnteringNumbers)).size
    when {
        countOfMatchedNumbers == THREE_MATCHED_NUMBERS -> println("Поздравляем, Вы выиграли джекпот!")
        countOfMatchedNumbers == TWO_MATCHED_NUMBERS -> println("Вы выиграли крупный приз!")
        countOfMatchedNumbers == ONE_MATCHED_NUMBERS -> println("Не расстраиваетесь, Вы выиграли утешительный приз!")
        else -> println("К сожалению, Вы не угадали ни одного числа.")
    }

    print("Выигрышная комбинация: ")
    listWinningNumbers.forEach { print("$it ") }
}