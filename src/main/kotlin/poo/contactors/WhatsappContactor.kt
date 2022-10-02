package poo.contactors

import poo.interfaces.Contactor

class WhatsappContactor: Contactor {
    override fun call(phone: String) {
        println("Llamando por whatsapp...")
    }

    override fun writeLetter(text: String) {
        println("Sending letter via whatsapp")
    }
}