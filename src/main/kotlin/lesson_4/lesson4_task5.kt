package org.example.lesson_4

fun main() {
    print("Есть ли повреждения в корбале? ")
    val bodyDamage = readLine()?.toBoolean()!!

    print("Сколько человек на борту? ")
    val countOfCrew = readLine()?.toInt()!!

    print("Сколько ящиков провизии? ")
    val countOfBoxes = readLine()?.toInt()!!

    print("Погодные условия благоприятны? ")
    val favorableWeatherConditions = readLine()?.toBoolean()!!

    val recommendedCountOfCrew = countOfCrew in 55..70
    val recommendedCountOfBoxes = countOfBoxes > 50

    val alternativeCountOfCrew = countOfCrew == 70
    val alternativeCountOfBoxes = countOfBoxes >= 50

    val setSail = (!bodyDamage && recommendedCountOfCrew && recommendedCountOfBoxes) || (bodyDamage && alternativeCountOfCrew && alternativeCountOfBoxes && favorableWeatherConditions)
    println("Благоприятные ли условия для отправки корбаля в плавание? $setSail")
}