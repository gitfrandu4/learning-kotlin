package encapsulation.control

import encapsulation.datos.Carro
import encapsulation.Usuario
import encapsulation.vista.Vista
import java.time.LocalDateTime

class Controlador (val usuario: Usuario, val carro: Carro, val vista: Vista){
}

fun getDateOfLastUpdate(): LocalDateTime {
    return LocalDateTime.now()
}