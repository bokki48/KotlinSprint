package org.example.lesson_4

fun main() {
    val totalCountOfTables = 13
    val todayReserved = 13
    val tomorrowReserved = 9

    println("Доступность столиков на сегодня: ${todayReserved < totalCountOfTables}")
    println("Доступность столиков на завтра: ${tomorrowReserved < totalCountOfTables}")
}