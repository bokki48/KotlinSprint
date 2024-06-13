package org.example.lesson_1

fun main(){
    val countOfOrders: Short = 75
    val thankYouText: String = "Уважаемый пользователь, благодарим Вас за заказ!"

    println("Количество заказанных товаров - $countOfOrders")
    println(thankYouText)

    var countOfEmployees: Short = 2000

    //println("Количество сотрудников в интернет-магазине - $countOfEmployees")

    countOfEmployees = 1999

    println("1 сотрудник уволился. Осталось работать $countOfEmployees")
}