package org.example.lesson_4

fun main() {
    val lowWeightBasicCargo = 35
    val highWeightBasicCargo = 100

    val volumeBasicCargo = 100

    val weightFirstCargo = 20
    val volumeFirstCargo = 80

    val weightSecondCargo = 50
    val volumeSecondCargo = 100

    println(
        "Груз с весом $weightFirstCargo кг и объёмом $volumeFirstCargo соответствует категории \'Average\':" +
                " ${(weightFirstCargo > lowWeightBasicCargo && weightFirstCargo <= highWeightBasicCargo) && volumeFirstCargo < volumeBasicCargo}"
    )
    println(
        "Груз с весом $weightSecondCargo кг и объёмом $volumeSecondCargo соответствует категории \'Average\':" +
                " ${(weightFirstCargo > lowWeightBasicCargo && weightFirstCargo <= highWeightBasicCargo) && volumeFirstCargo < volumeBasicCargo}"
    )
}