package poo.person

import poo.Address

open class Person(
    val firstname: String,
    val lastname: String,
    val address: Address,
    val phone: String
) {


    open fun showPostalCode() {
        println("El código postal es: ${address}")
    }
}