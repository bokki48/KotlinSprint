package org.example.lesson_4

fun main() {
    val auspiciousIsSun = true
    val auspiciousIsOutdoorAwning = true
    val auspiciousAirMoisture = 20
    val notAuspiciousCurrentSeason = "Зима"

    val todayIsSun = true
    val todayIsOutdoorAwning = true
    val todayAirMoisture = 20
    val todayCurrentSeason = "Зима"

    val currentConditionsForGrowth = (auspiciousIsSun == todayIsSun) && (auspiciousIsOutdoorAwning == todayIsOutdoorAwning) && (auspiciousAirMoisture == todayAirMoisture) && (notAuspiciousCurrentSeason != todayCurrentSeason)
    println("Благоприятные ли условия сейчас для роста бобовых? $currentConditionsForGrowth")
}