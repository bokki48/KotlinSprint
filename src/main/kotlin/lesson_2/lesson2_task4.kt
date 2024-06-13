package org.example.lesson_2

fun main() {
    val minedCrystallineOre = 7
    val minedIronOre = 11
    val bonusToMindMaterial = 0.2

    val bonusCrystallOre = minedCrystallineOre * bonusToMindMaterial
    val bonusIronOre = minedIronOre * bonusToMindMaterial

    println("Количество бонусных кристаллических руд: ${bonusCrystallOre.toInt()}")
    println("Количество бонусных железных руд: ${bonusIronOre.toInt()}")
}