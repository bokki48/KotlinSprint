package org.example.lesson_5

fun main() {
    print("Введите первое число от 0 до 42: ")
    val firstEnteringNumber = readLine()!!.toInt()

    print("Введите второе число от 0 до 42: ")
    val secondEnteringNumber = readLine()!!.toInt()

    val firstWinningNumber = 40
    val secondWinningNumber = 25

    if ((firstEnteringNumber == 40 && secondEnteringNumber == 25) || (firstEnteringNumber == 25 && secondEnteringNumber == 40))
        println("Поздравляем! Вы выиграли главный приз!")
    else if (firstEnteringNumber == 40 || secondEnteringNumber == 25 || firstEnteringNumber == 25 || secondEnteringNumber == 40)
        println("Вы выиграли утешительный приз!")
    else println("Неудача!")

    println("Выигрышными числами являются: $firstWinningNumber и $secondWinningNumber")
}