package org.example.lesson_4

const val LOW_COUNT_OF_CREW = 55
const val HIGH_COUNT_OF_CREW = 70
const val LOW_COUNT_OF_BOXES = 50

fun main() {
    print("Есть ли повреждения в корбале? ")
    val isBodyDamage = readln().toBoolean()

    print("Сколько человек на борту? ")
    val countOfCrew = readln().toInt()

    print("Сколько ящиков провизии? ")
    val countOfBoxes = readln().toInt()

    print("Погодные условия благоприятны? ")
    val isWeatherConditionsFavorable = readln().toBoolean()

    val isRecommendedCountOfCrew = countOfCrew in LOW_COUNT_OF_CREW..HIGH_COUNT_OF_CREW
    val isRecommendedCountOfBoxes = countOfBoxes > LOW_COUNT_OF_BOXES

    val isAlternativeCountOfCrew = countOfCrew == HIGH_COUNT_OF_CREW
    val isAlternativeCountOfBoxes = countOfBoxes >= LOW_COUNT_OF_BOXES

    val setSail = (!isBodyDamage && isRecommendedCountOfCrew && isRecommendedCountOfBoxes)
            || (isBodyDamage && isAlternativeCountOfCrew && isAlternativeCountOfBoxes && isWeatherConditionsFavorable)
    println("Благоприятные ли условия для отправки корбаля в плавание? $setSail")
}