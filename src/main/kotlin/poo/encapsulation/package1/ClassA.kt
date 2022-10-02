package poo.encapsulation.package1

import poo.encapsulation.package2.ClassC

/**
 * En Kotlin, el modificador por defecto si no indicamos nada es public, y quiere decir
 * que será visible desde cualquier parte del proyecto.
 *
 *
 *
 *
 */
class ClassA {

    fun myFunction() {
        val myObjectB = ClassB("bebebe")

        // La propiedad es protected así que no podemos acceder a ella
        // myObjectB.propertyXYZ = "bababa"
        // myObjectB.hello() // Cannot access 'hello': it is protected in 'ClassB'

        myObjectB.revealSecret() // Como estamos en el mismo módulo (todo el proyecto)

        val myObjectC = ClassC("ceecece")
        myObjectC.myPropertyXYZ
    }
}