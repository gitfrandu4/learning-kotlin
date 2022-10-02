package poo

// Las clases de model siempre deben tener propiedades
// Normalmente, si solo tenemos una clase que tiene propiedades, la definiremos como clase de model,
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