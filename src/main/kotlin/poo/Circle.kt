package poo

import poo.inheritance.Shape

// 60.- Crea una clase llamada Círculo con una propiedad llamada radio.
//Crea para esta una función que obtenga la longitud de su
//perímetro(2*pi*r) y otra que calcule su área(pi*r²)

class Circle(var radio: Double, x: Int, y: Int): Shape(x, y) {

    override fun getArea(): Double {
        TODO("Not yet implemented")
    }

    override fun getPerimeter(): Double {
        TODO("Not yet implemented")
    }


}