package org.example.lesson_4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val AUSPICIOUS_AIR_MOISTURE = 20
const val NOT_AUSPICIOUS_AIR_MOISTURE = "Зима"

fun main() {
    val isSunnyToday = IS_SUNNY
    val isOwningOpenToday = IS_AWNING_OPEN
    val todayAirMoisture = 20
    val todayCurrentSeason = "Зима"

    val currentConditionsForGrowth = (isSunnyToday) && (isOwningOpenToday) &&
            (todayAirMoisture == AUSPICIOUS_AIR_MOISTURE) && (todayCurrentSeason != NOT_AUSPICIOUS_AIR_MOISTURE)
    println("Благоприятные ли условия сейчас для роста бобовых? $currentConditionsForGrowth")
}