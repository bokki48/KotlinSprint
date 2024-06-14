package org.example.lesson_4

fun main() {
    val day = 5
    val exersisesForHands = day % 2 != 0
    val exersisesForPress = day % 2 != 0
    val exersisesForLegs = day % 2 == 0
    val exersisesForBack = day % 2 == 0

    println(
        "Упражнения для рук:   $exersisesForHands\nУпражнения для ног:   $exersisesForLegs\n" +
                "Упражнения для спины: $exersisesForBack\nУпражнения для пресса:$exersisesForPress"
    )
}