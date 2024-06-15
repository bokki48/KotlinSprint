package org.example.lesson_4

const val TOTAL_COUNT_OF_TABLES = 13

fun main() {
    val todayReserved = 13
    val tomorrowFree = 4
    val tomorrowReserved = TOTAL_COUNT_OF_TABLES - tomorrowFree

    println("Доступность столиков на сегодня: ${todayReserved < TOTAL_COUNT_OF_TABLES}")
    println("Доступность столиков на завтра: ${tomorrowReserved < TOTAL_COUNT_OF_TABLES}")
}