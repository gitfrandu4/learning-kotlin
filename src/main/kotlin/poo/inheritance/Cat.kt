package poo.inheritance

import poo.enum.AnimalType

class Cat(age: Int) : Animal(age, AnimalType.VERTEBRADO) {
    init {
        println("Inicialización de gato")
    }

    fun maullar(){
        println("maullar")
    }
}