package org.example.lesson_4

const val TOTAL_COUNT_OF_TABLES = 13

fun main() {
    val todayReserved = 13
    val tomorrowReserved = 9

    println("Доступность столиков на сегодня: ${todayReserved < TOTAL_COUNT_OF_TABLES}")
    println("Доступность столиков на завтра: ${tomorrowReserved < TOTAL_COUNT_OF_TABLES}")
}