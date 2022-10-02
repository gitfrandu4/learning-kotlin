package poo

import poo.contactors.AndroidContactor
import poo.interfaces.Contactor

class Company(val phone: String, val address: Address) {

    val contactor: Contactor = AndroidContactor()

    fun call() {
        contactor.call(phone)
    }

    fun writeLetter(text: String) {
        contactor.writeLetter(text)
    }
}