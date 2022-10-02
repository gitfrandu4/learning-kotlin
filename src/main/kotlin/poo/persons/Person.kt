package poo.persons

import poo.Address
import poo.contactors.AndroidContactor
import poo.interfaces.Contactor

// 85.- Vamos a crear una clase llamada Persona y vamos a trasladar ahí
//      todas las propiedades y funciones de nuestra clase Alumno que sean
//      propiedades de cualquier persona, aunque no fuera estudiante.

// 98.- En nuestro proyecto, crear dos paquetes, uno llamado personas y otro
//      llamado asignaturas y mover a estos las clases o interfaces
//      correspondientes

// 96.- Hacer que Persona implemente Contactar e implementar sus métodos
//      de manera figurada añadiendo un comentario (No podemos hacer que
//      nuestro programa haga una llamada, si fuera una aplicación Android si que
//      podríamos)

open class Person(
    val firstname: String,
    val lastname: String,
    private val address: Address,
    val phone: String
) {
    open fun showPostalCode() {
        println("El código postal es: ${address}")
    }

    // 87.- Crear una función en Persona que muestre por pantalla la dirección de
    //      esa persona
    open fun showAddress() {
        println(address.toString())
    }

    val contactor: Contactor = AndroidContactor()

    fun call() {
        contactor.call(phone)
    }
    fun writeLetter(text: String) {
        contactor.writeLetter(text)
    }
}