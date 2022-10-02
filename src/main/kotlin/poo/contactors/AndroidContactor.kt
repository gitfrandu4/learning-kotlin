package poo.contactors

import poo.interfaces.Contactor

class AndroidContactor: Contactor
{
    override fun call(phone: String) {
        println("Calling $phone...")
    }

    override fun writeLetter(text: String) {
        println("Writting letter: \n$text")
    }
}