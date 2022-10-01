package poo

import java.lang.IllegalArgumentException

class Rectangle (var width: Double, var height: Double){

    constructor(rectangle: Rectangle) :
            this(rectangle.width, rectangle.height) {
        // this.grosor = rectangle.grosor;
    }

    fun getArea() = width * height

    init {
        println("Inicializando")
        if(width < 0 || height < 0) {
            throw IllegalArgumentException("El ancho y el alto no pueden ser negativos")
        }

    }

    val esCuadrado: Boolean
        get() = height == width

    var thickness = 1
        set(value) {
            if(value <= 0) {
                throw IllegalArgumentException("El valor del grosor debe ser positivo")
            } else {
                // variable de backup que guarda kotlin para guardar el valor de las variables de las clases
                field = value
            }
        }

}