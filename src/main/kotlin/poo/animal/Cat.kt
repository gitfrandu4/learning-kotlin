package poo.animal

import poo.enums.AnimalType

class Cat(age: Int) : Animal(age, AnimalType.VERTEBRADO) {
    init {
        println("Inicialización de gato")
    }

    fun maullar(){
        println("maullar")
    }

    override fun eat() {
        println("Estoy comiendo sardinitas, ñam ^^")
    }
}