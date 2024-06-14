package org.example.lesson_1

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {
    val totalSecondsInSpace = 6429
    val hoursInSpace = totalSecondsInSpace / SECONDS_IN_HOUR
    val minutesInSpace = (totalSecondsInSpace - hoursInSpace * SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val secondsInSpace = totalSecondsInSpace - hoursInSpace * SECONDS_IN_HOUR - minutesInSpace * SECONDS_IN_MINUTE

    println("Гагарин провёл в космосе - ${"%02d:%02d:%02d".format(hoursInSpace, minutesInSpace, secondsInSpace)}")
}