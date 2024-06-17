package org.example.lesson_5

const val FIRST_WINNIG_NUMBER = 40
const val SECOND_WINNIG_NUMBER = 25

fun main() {
    print("Введите первое число от 0 до 42: ")
    val firstEnteringNumber = readln().toInt()

    print("Введите второе число от 0 до 42: ")
    val secondEnteringNumber = readln().toInt()

    if ((firstEnteringNumber == FIRST_WINNIG_NUMBER && secondEnteringNumber == SECOND_WINNIG_NUMBER) ||
        (firstEnteringNumber == SECOND_WINNIG_NUMBER && secondEnteringNumber == FIRST_WINNIG_NUMBER)
    ) println("Поздравляем! Вы выиграли главный приз!")
    else if (firstEnteringNumber == FIRST_WINNIG_NUMBER || secondEnteringNumber == SECOND_WINNIG_NUMBER ||
        firstEnteringNumber == SECOND_WINNIG_NUMBER || secondEnteringNumber == FIRST_WINNIG_NUMBER
    ) println("Вы выиграли утешительный приз!")
    else println("Неудача!")

    println("Выигрышными числами являются: $FIRST_WINNIG_NUMBER и $SECOND_WINNIG_NUMBER")
}