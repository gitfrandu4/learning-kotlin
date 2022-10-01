val miChar = 'a'

// usamos comillas simples para indicar que es un caracter
val nuevaLinea = '\n'
nuevaLinea

val comillaSimple = '\''
comillaSimple

val aConAcento = '\u00E1'
aConAcento

// ------------------------

val nombre = "Manuel"
val apellido = "Fraga"

val nombreCompleto = nombre + " " + apellido
nombreCompleto

println(nombreCompleto)
println("Hola $nombreCompleto")
println("Hola ${nombreCompleto.length}")

nombre[3] // u

nombre.uppercase()
nombre.length
nombre.contains('A') // false
nombre.contains('A', true) // true
nombre.drop(1).replaceFirstChar {
    it.uppercase()
} // Anuel

nombre // Manuel
nombre.toUByte()