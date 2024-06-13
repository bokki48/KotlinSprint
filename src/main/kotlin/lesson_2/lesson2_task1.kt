package org.example.lesson2

fun main() {
    val assessmentFirstStudent = 3
    val assessmentSecondStudent = 4
    val assessmentThirdStudent = 3
    val assessmentForthStudent = 5

    val arithmeticMean = (assessmentFirstStudent.toFloat() + assessmentSecondStudent.toFloat() + assessmentThirdStudent.toFloat() + assessmentForthStudent.toFloat()) / 4

    println("Средний балл 4 учеников равен ${"%.2f".format(arithmeticMean)}")

}