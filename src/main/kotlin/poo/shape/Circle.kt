package poo.shape

import poo.shape.Shape
import kotlin.math.PI
import kotlin.math.pow

// 60.- Crea una clase llamada Círculo con una propiedad llamada radio.
//Crea para esta una función que obtenga la longitud de su
//perímetro(2*pi*r) y otra que calcule su área(pi*r²)

class Circle(var radio: Double, x: Int, y: Int): Shape(x, y) {

    override fun getArea(): Double {
        return PI * radio.pow(2)
    }

    override fun getPerimeter(): Double {
        return 2 * PI * radio
    }
}