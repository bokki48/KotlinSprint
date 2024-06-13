package org.example.lesson_1

const val secondsInHour = 3600
const val secondsInMinute = 60

fun main() {
    val totalSecondsInSpace = 6429
    val hoursInSpace = totalSecondsInSpace / secondsInHour
    val minutesInSpace = (totalSecondsInSpace - hoursInSpace * secondsInHour) / secondsInMinute
    val secondsInSpace = totalSecondsInSpace - hoursInSpace * secondsInHour - minutesInSpace * secondsInMinute

    println("%02d:%02d:%02d".format(hoursInSpace, minutesInSpace, secondsInSpace))
}