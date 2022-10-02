package poo.animal

import poo.enums.AnimalType

/**
 * La clase por defecto de la que heredan todas las clases en Kotlin es la clase Any
 */
open class Animal(val age: Int, val type: AnimalType): Any() {

    init {
        println("Inicialización de Animal")
    }

    fun sleep() {
        println("Me voy a dormir")
    }

    open fun eat() {
        println("Me voy a comer")
    }
}