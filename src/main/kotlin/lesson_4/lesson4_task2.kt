package org.example.lesson_4

const val LOW_WEIGHT_BASIC_CARGO = 35
const val HIGH_WEIGHT_BASIC_CARGO = 100
const val VOLUME_BASIC_CARGO = 100


fun main() {
    val weightFirstCargo = 20
    val volumeFirstCargo = 80

    val weightSecondCargo = 50
    val volumeSecondCargo = 100

    println(
        "Груз с весом $weightFirstCargo кг и объёмом $volumeFirstCargo соответствует категории \'Average\':" +
                " ${
                    (weightFirstCargo > LOW_WEIGHT_BASIC_CARGO && weightFirstCargo <= HIGH_WEIGHT_BASIC_CARGO)
                            && volumeFirstCargo < VOLUME_BASIC_CARGO
                }"
    )
    println(
        "Груз с весом $weightSecondCargo кг и объёмом $volumeSecondCargo соответствует категории \'Average\':" +
                " ${
                    (weightFirstCargo > LOW_WEIGHT_BASIC_CARGO && weightFirstCargo <= HIGH_WEIGHT_BASIC_CARGO)
                            && volumeFirstCargo < VOLUME_BASIC_CARGO
                }"
    )
}