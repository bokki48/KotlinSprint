package org.example.lesson_2

import java.lang.Math.pow

fun main() {
    val currentAmount = 70000
    val annualInterestRate = 16.7
    val countOfBillingPeriods = 20

    val depositAmount = currentAmount * pow((1 + annualInterestRate / 100), countOfBillingPeriods.toDouble())
    println("Размер вклада через $countOfBillingPeriods будет равен ${"%.3f".format(depositAmount)}")
}

