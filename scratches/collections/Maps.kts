// Un mapa es una colección de pares de objetos llamados claves y valores.
// Las claves son únicas y con ellas se puede obtener el valor de manera
// eficiente.

// 10.- Crea un mapa que relacione el nombre de los alumnos y alumnas de
//una clase con su edad. Comprueba si Ana es alumna de esa clase.

val students = mapOf("Ana" to 20, "Raquel" to 21)

students.containsKey("Ana")

// 11.- Obtén un set con los nombres de los alumnos y alumnas.

val studentsNames = students.keys // val studentsNames: Set<String>
studentsNames

// 12.- Vamos a unir dos clases. Crea otro mapa con los nombres y edades de
//los alumnos y alumnas de otra clase y mediante una función, crea un mapa
//con la unión de ambos.

val teachers = mapOf("María" to 30, "Alejandro" to 34)

val all = students + teachers // val all: Map<String, Int>
all

// otra solución
val otra = students.toMutableMap().putAll(teachers)
otra

// 13.- Crea un mapa mutable con los nombres y edades del alumnado y
//añade usando una sola función dos alumnos nuevos que han entrado
//nuevos con sus respectivas edades.

val borbones = mutableMapOf("Juan Carlos" to 123, "Froilán" to 1242)
borbones.putAll(mapOf("leticia" to 124))
borbones