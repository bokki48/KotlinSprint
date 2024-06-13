package org.example.lesson_2

fun main() {
    val countOfPermanentEmployees = 50
    val salaryOfPermanentEmploee = 30000
    val countOfInterns = 30
    val salaryOfPermanentIntern = 20000

    val paymentToPermanentEployees = countOfPermanentEmployees * salaryOfPermanentEmploee
    val paymentToPermanentInterns = countOfInterns * salaryOfPermanentIntern
    val totalSalaryCosts = paymentToPermanentInterns + paymentToPermanentEployees
    val averageSalary = totalSalaryCosts / (countOfInterns + countOfPermanentEmployees)

    println("Расходы на выплату зарплаты постоянных сотрудников: $paymentToPermanentEployees")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalaryCosts")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary")

}