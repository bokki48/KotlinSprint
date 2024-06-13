package org.example.lesson_3

fun main() {
    val chessMoveData = "D2-D4;0"
    val cageFrom = chessMoveData.substring(0,2)
    val cageWhere = chessMoveData.substring(3,5)
    val strokeNumber = chessMoveData.substring(6)

    println("Фигура пошла с клетки: $cageFrom")
    println("Фигура была поставлена на клетку: $cageWhere")
    println("Номер совершённого хода: $strokeNumber")
}