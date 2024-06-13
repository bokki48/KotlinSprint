package org.example.lesson_1

fun main() {
    val year = 1961
    var hours = 9
    var minutes = 7
    println("Год полёта - $year")
    println("Полетел в ${"%02d".format(hours)} часов ")
    println("... ${"%02d".format(minutes)} минут ")
}