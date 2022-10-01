
// Un set es una colección de elementos sin ordenar. No puede
// contener objetos duplicados. En Kotlin existen los sets
// mutables y los inmutables.

val listaDeLaCompra = setOf("harina", "Huevos", "sal", "Naranjas") // versión inmutable
val listaDeLaCompra2 = listaDeLaCompra.toMutableSet() // versión mutable

listaDeLaCompra.first()
listaDeLaCompra.last()
listaDeLaCompra.random()

listaDeLaCompra2.add("Patatas")
listaDeLaCompra2.remove("Harina")
listaDeLaCompra2.remove("harina")

listaDeLaCompra2
listaDeLaCompra.union(listaDeLaCompra2) // no se duplican elementos
listaDeLaCompra2.clear()

setOf(1, 2).equals(setOf(2, 1)) // true, el orden no importa