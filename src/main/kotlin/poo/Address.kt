package poo

// Las clases de datos siempre deben tener propiedades
// Normalmente, si solo tenemos una clase que tiene propiedades, la definiremos como clase de datos,
// ya que nos proporcina múltiples utilidades
data class Address(
    val street: String,
    val number: Int,
    val postalCode: Int
) {
    // Parámetro Opcional:
    //  * Cuando copiamos un objeto no se copia este valor,
    //  * tampoco se tiene en cuenta para comparaciones, etc.
    var population: String = ""
}

fun main() {
    learningDataClass()
}
fun learningDataClass() {
    val myAddressA = Address("Calle Fuencarral", 78, 234555)
    val myAddressB = Address("Calle Lomo Blanco", 77, 234785)
    val myAddressC = Address("Calle Lomo Blanco", 77, 234785)

    myAddressA.population = "AAAAA"
    myAddressB.population = "BBBBB"
    myAddressC.population = "AAAAA"

    println(myAddressA) // Implementa la función toString
    println(myAddressB)
    println(myAddressC)

    println(myAddressA == myAddressB) // Implementa un comparador
    println(myAddressC == myAddressB)

    val myAddressD = myAddressA.copy() // Implementa una función para copiar el objeto
    val myAddressE = myAddressA.copy(number = 2345)

    println(myAddressD)
    println(myAddressE)
}