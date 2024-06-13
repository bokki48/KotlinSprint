package org.example.lesson_4

fun main() {
    val weightFirstCargo = 20
    val volumeFirstCargo = 80

    val weightSecondCargo = 50
    val volumeSecondCargo = 100

    println(
        "Груз с весом $weightFirstCargo кг и объёмом $volumeFirstCargo соответствует категории \'Average\':" +
                " ${(weightFirstCargo > 35 && weightFirstCargo <= 100) && volumeFirstCargo < 100}"
    )
    println(
        "Груз с весом $weightSecondCargo кг и объёмом $volumeSecondCargo соответствует категории \'Average\':" +
                " ${(weightSecondCargo > 35 && weightSecondCargo <= 100) && volumeSecondCargo < 100}"
    )
}