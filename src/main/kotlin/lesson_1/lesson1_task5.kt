package org.example.lesson_1

fun main() {
    val totalSeconds = 6429
    val hours = totalSeconds / 3600
    val minutes = (totalSeconds - hours * 3600) / 60
    val seconds = totalSeconds - hours * 3600 - minutes * 60

    println("Гагарин провёл в космосе - ${"%02d".format(hours)}:${"%02d".format(minutes)}:${"%02d".format(seconds)}")
}