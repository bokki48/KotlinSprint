package org.example.lesson_4

fun main() {
    var day = 5
    var exersisesForHands = day % 2 != 0
    var exersisesForPress = day % 2 != 0
    var exersisesForLegs = day % 2 == 0
    var exersisesForBack = day % 2 == 0

    println(
        "Упражнения для рук:   $exersisesForHands\nУпражнения для ног:   $exersisesForLegs\n" +
                "Упражнения для спины: $exersisesForBack\nУпражнения для пресса:$exersisesForPress"
    )
}