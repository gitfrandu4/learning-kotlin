// Ejercicios - List

// 1.- Crear una lista con los nombres de 5 ciudades. Ordenar la lista
// alfabéticamente y encontrar el nombre de la primera ciudad (primera en
// orden alfabético)

println("================== Ejercicio 1 ==================")
val cities = listOf(
    "Vohémar",
    "Mampikony",
    "Arivonimamo",
    "Port-Bergé",
    "Fianarantsoa",
)

cities
    .sorted()
    .first()

// 2.- Con la misma lista anterior, crear otra lista con las ciudades que
//contengan la letra ‘a’

println("================== Ejercicio 2 ==================")

cities.filter{
    it.lowercase().contains("a")
}

// 3.- Cuenta el número de ciudades que contienen la letra ‘a’

println("================== Ejercicio 3 ==================")

cities.filter{ it.lowercase().contains("a") }.count()

cities.count {
    it.contains('a')
}

cities.map {it.lowercase()}.count{it.contains('a')}

// 4.- Ahora encuentra la primera ciudad de la lista que contenga la letra ‘x’

println("================== Ejercicio 4 ==================")

cities.filter {
    it.contains("é")
}.first() // user preferiblemente SIEMPRE firstOrNull porque si no hay elemento devuelve una excepción

cities.filter {
    it.contains("x")
}.firstOrNull() ?: "nothing to see here"



// 5.- Crea una lista de la compra con los objetos: “Pan”, “Leche”, “Harina”,
//“Huevos” y “Naranjas”. Quita el elemento “Leche” de la lista y en su
//misma posición añade el elemento “Aceite”

println("================== Ejercicio 5 ==================")

val food = mutableListOf(
    "Pan",
    "Leche",
    "Harina",
    "Huevos",
    "Naranjas"
)

food[food.indexOf("Leche")] = "Aceite"

// Ejercicios - Set

// 6.- Crea un set mutable de números enteros. Borra todos los que sean
//pares.

println("================== Ejercicio 6 ==================")

val numbers = mutableSetOf(1, 2, 4, 5, 6, 7, 8, 9)

numbers.filter {
    it % 2 == 0
}

numbers.removeIf{
    it % 2 == 0
}
// 7.- Crea un set de números enteros. Obtén otro set idéntico pero con los
//números multiplicados por 3.

println("================== Ejercicio 7 ==================")

val numbers3 = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
numbers3.map {
    it * 3
}

// 8.- Crea un set de números enteros. Obtén la media de esos números

println("================== Ejercicio 8 ==================")

val numbersAvg = setOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 100)
numbersAvg.average()

// 9.- Crea un set de números enteros. Obtén la media de esos números sin
//usar la función average.

println("================== Ejercicio 9 ==================")

numbersAvg.sum()/numbersAvg.size.toDouble()
// Ejercicios - Map

// 10.- Crea un mapa que relacione el nombre de los alumnos y alumnas de
//una clase con su edad. Comprueba si Ana es alumna de esa clase.

println("================== Ejercicio 10 ==================")

val students = mapOf("Ana" to 20, "Raquel" to 21)

students.containsKey("Ana")

// 11.- Obtén un set con los nombres de los alumnos y alumnas.

println("================== Ejercicio 11 ==================")

val studentsNames = students.keys // val studentsNames: Set<String>
studentsNames

// 12.- Vamos a unir dos clases. Crea otro mapa con los nombres y edades de
//los alumnos y alumnas de otra clase y mediante una función, crea un mapa
//con la unión de ambos.

println("================== Ejercicio 12 ==================")

val teachers = mapOf("María" to 30, "Alejandro" to 34)

val all = students + teachers // val all: Map<String, Int>
all

// otra solución
val otra = students.toMutableMap().putAll(teachers)
otra

// 13.- Crea un mapa mutable con los nombres y edades del alumnado y
//añade usando una sola función dos alumnos nuevos que han entrado
//nuevos con sus respectivas edades.

println("================== Ejercicio 13 ==================")

val borbones = mutableMapOf("Juan Carlos" to 123, "Froilán" to 1242)
borbones.putAll(mapOf("leticia" to 124))
borbones

