package poo.inheritance

import poo.data.Address

open class Person(
    val firstname: String,
    val lastname: String,
    val address: Address,
    val phone: String
) {

    open fun showPostalCode() {
        println("El código postal es: ${address.postalCode}")
    }
}