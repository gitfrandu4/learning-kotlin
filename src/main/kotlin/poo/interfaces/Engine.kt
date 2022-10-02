package poo.interfaces

/**
 * En programación, se llama interfaz a un conjunto de métodos a los que una instancia de una clase responderá
 *
 * Así, podemos considerar que la interfaz de una clases es el conjunto de todos sus métodos públicos.
 *
 * Una interfaz especifica que acciones puede ejecutar una instancia, pero no especifica la manera en que se implementarán
 * estas acciones. Una vez definimos una interfaz en Kotlin, cualquier clase puede implementarla. Además, una clase puede
 * implementar múltiples interfaces.
 *
 */
interface Engine {

    // Las clases que implementen la interfaz Engine se compromenten a implementar las siguientes funcionalidades:
    fun startEngine()
    fun speedUp(units: Int)
    fun slowDown(units: Int)
    fun stopEngine()
}