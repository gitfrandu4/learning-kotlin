package poo.animal

import poo.enum.AnimalType

open class Animal(val age: Int, val type: AnimalType) {

    fun sleep() {
        println("Me voy a dormir")
    }

    open fun eat() {
        println("Me voy a comer")
    }
}