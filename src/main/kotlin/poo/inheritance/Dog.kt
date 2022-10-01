package poo.inheritance

import poo.enum.AnimalType

class Dog(age: Int): Animal(age, AnimalType.VERTEBRADO) {

    init {
        println("inicialización de perro")
    }

    fun bar() {
        println("Guau, guau")
    }

    override fun eat(){
        println("Comer huesitos de ñú")
    }
}