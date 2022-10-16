package poo.scope

import poo.Ingredients

class Apply {
}

fun main() {
    val apply: Apply = Apply()

    // 110.- Declara una clase con 4 propiedades y un método. Las propiedades
    //deben ser declaradas fuera del constructor. Crea un objeto de esa clase e
    //inicializa sus propiedades mediante apply. Por último, llama al método de
    //ese objeto.
    val lentejas = Ingredients().apply {// Instanciación: Ingredients()

        // Inicialización
        calorias = 116.0
        hidratosDeCarbono = 20.0
        this.grasas = 0.4
        proteinas = 0.9
    }.also {
        // 111.- Crea un objeto de la clase anterior. Inicializa sus propiedades
        //mediante apply y usa also para mostrar alguna de ellas por pantalla.

        // also y apply suelen utilizarse juntos
        println("Hemos creado el objeto $it")
        println("Hemos creado un ingrediente con ${it.calorias} calorias")
    }

    lentejas.printData()
}