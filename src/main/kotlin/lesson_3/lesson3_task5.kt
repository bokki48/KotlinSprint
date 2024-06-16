package org.example.lesson_3

fun main() {
    val chessMoveData = "D2-D4;0"
    val parsChessMoveData = chessMoveData.split('-', ';')

    val cageFrom = parsChessMoveData.get(0)
    val cageWhere = parsChessMoveData.get(1)
    val strokeNumber = parsChessMoveData.get(2)

    println("Фигура пошла с клетки: $cageFrom")
    println("Фигура была поставлена на клетку: $cageWhere")
    println("Номер совершённого хода: $strokeNumber")
}