// Una lista es una colección de elementos en un orden específico.
// Puede contener objetos duplicados. En Kotlin tenemos listas
// mutables e inmutables.

val nombres = listOf("Ana", "Maria", "Juan", "Andrés") // val nombres: List<String>
val edades = listOf<Int>(19, 23, 22, 24)

nombres.toString()
nombres[0] // Ana
nombres.get(0) // Ana
nombres.indexOf("Andrés") // 3
nombres.count() // 4
nombres.size // 4
nombres.first() // Ana
nombres.last() // Andrés
nombres.sorted()

val nombresOrdenados = nombres.sorted()

edades
edades.contains(10) // false
10 in edades // false
edades.max() // 24
edades.sum() // 88
edades.average() // 22.0

val lista = listOf(12, "Perro", 'a')

// Ahora estamos viendo listas inmutables
// nombres[0] = "perrosanxe" // error

// Probemos ahora con listas mutables
val nombres2 = mutableListOf("Pedro", "Luisa")
nombres2[0] = "Perro sanxe" // works
nombres2.remove("Perro sanxe")
nombres2
nombres2.add("ZP")
nombres2

// Listas vacías
var a = emptyList<Int>()
var b = mutableListOf<Int>()