package poo.interfaces

// 95.- Crear la interfaz Contactar con dos funciones, la función llamar sin
//      ningún parámetro de entrada y la función escribirCarta a la que se le
//      pasará un String con el texto de la carta.
interface Contactor {

    fun call(phone: String)

    fun writeLetter(text: String)
}