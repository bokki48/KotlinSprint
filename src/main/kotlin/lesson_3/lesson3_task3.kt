package org.example.lesson_3

fun main() {
    val testingNumber = 5
    val multiplicationTable = """
        $testingNumber x 1 = ${testingNumber * 1}
        $testingNumber x 2 = ${testingNumber * 2}
        $testingNumber x 3 = ${testingNumber * 3}
        $testingNumber x 4 = ${testingNumber * 4}
        $testingNumber x 5 = ${testingNumber * 5}
        $testingNumber x 6 = ${testingNumber * 6}
        $testingNumber x 7 = ${testingNumber * 7}
        $testingNumber x 8 = ${testingNumber * 8}
        $testingNumber x 9 = ${testingNumber * 9}
    """.trimIndent()

    println(multiplicationTable)
}