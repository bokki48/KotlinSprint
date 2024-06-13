package org.example.lesson_2

const val minutesInHour = 60

fun main() {
    val departureHours = 9
    val departureMinutes = 39
    val timeOfDepartureInMinutes = departureHours * minutesInHour + departureMinutes

    val minutesInRoad = 457
    val timeOfArrivalInMinutes = timeOfDepartureInMinutes + minutesInRoad


    val arrivalHours = timeOfArrivalInMinutes / minutesInHour
    val arrivalMinutes = timeOfArrivalInMinutes % minutesInHour

    println("Время прибытия поезда - ${"%02d:%02d".format(arrivalHours, arrivalMinutes)}")

}