package poo.store.control

import poo.store.model.Cart
import poo.store.Client
import poo.store.view.View
import java.time.LocalDateTime

class Controlador (val client: Client, val cart: Cart, val view: View){
}

fun getDateOfLastUpdate(): LocalDateTime {
    return LocalDateTime.now()
}