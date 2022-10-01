package poo

import java.lang.IllegalArgumentException

class Rectangle2 (val ancho: Double, var alto: Double){

    val esCuadrado: Boolean
        get() = ancho == alto

    var grosor = 1
        set(value) {
            if(value <= 0) {
                throw IllegalArgumentException("El valor del grosor debe ser positivo")
            } else {
                // variable de backup que guarda kotlin para guardar el valor de las variables de las clases
                field = value
            }
        }

}