package poo

import java.lang.IllegalArgumentException

class Rectangle(var width: Double, var height: Double) {



    constructor(rectangle: Rectangle) :
            this(rectangle.width, rectangle.height) {
                // this.grosor = rectangle.grosor;
            }

    init {
        println("Inicializando")
        if(width < 0 || height < 0) {
            throw IllegalArgumentException("El ancho y el alto no pueden ser negativos")
        }

    }

    var grosor = 1
    fun getArea() = width * height

}