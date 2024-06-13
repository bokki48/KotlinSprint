package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val departureHours = 9
    val departureMinutes = 39
    val timeOfDepartureInMinutes = departureHours * MINUTES_IN_HOUR + departureMinutes

    val minutesInRoad = 457
    val timeOfArrivalInMinutes = timeOfDepartureInMinutes + minutesInRoad


    val arrivalHours = timeOfArrivalInMinutes / MINUTES_IN_HOUR
    val arrivalMinutes = timeOfArrivalInMinutes % MINUTES_IN_HOUR

    println("Время прибытия поезда - ${"%02d:%02d".format(arrivalHours, arrivalMinutes)}")

}