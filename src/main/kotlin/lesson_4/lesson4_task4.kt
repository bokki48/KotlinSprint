package org.example.lesson_4

const val DAY = 5

fun main() {
    val isEven = DAY % 2 == 0
    val exersisesForHands = !isEven
    val exersisesForPress = !isEven
    val exersisesForLegs = isEven
    val exersisesForBack = isEven

    println(
        "Упражнения для рук:   $exersisesForHands\nУпражнения для ног:   $exersisesForLegs\n" +
                "Упражнения для спины: $exersisesForBack\nУпражнения для пресса:$exersisesForPress"
    )
}