package poo.animal

import poo.enums.AnimalType

class Dog(age: Int): Animal(age, AnimalType.VERTEBRADO) {

    init {
        println("inicialización de perro")
    }

    fun bark() {
        println("Guau, guau")
    }

    override fun eat(){
        println("Comer huesitos de ñú")
    }
}