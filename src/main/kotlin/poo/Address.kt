package poo

data class Address(
    val street: String,
    val number: Int,
    val postalCode: Int
) {
    // opcional (no copia, no compara, etc)
    var population: String = ""
}
