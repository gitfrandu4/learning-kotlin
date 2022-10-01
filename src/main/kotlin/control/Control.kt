package control

// if expressionç
// In Kotlin, if is an expression: it returns a value. Therefore, there is no ternary
// operator (condition ? then : else) because ordinary if works fine in this role.

fun mainControl() {

    println("\n========================================================")
    println("=============== Estructuras de control ===================")
    println("========================================================\n")

    println("Es mayor de edad: ${esMayorDeEdadSimplified2(23)}")
    println("El mayor de {12, 33} es: ${getMaxBetweenTwoNumbers(12, 33)}")

    isValuePositiveOrNegative(12)
    isValuePositiveOrNegative(-122)
    isValuePositiveOrNegative(0)

    println(
        "Froilán tiene 33 años y su nota media del curso pasado es: 1. Puede ser admitido en el curso: ${
            studentIsValid(
                33,
                1
            )
        }"
    )


    mainWhen()
    mainJumps()
    mainFor()
    mainWhile()
    mainRangesAndProgressions()
}

//32.- Implementa una función que reciba la edad de una persona y devuelva
//true si esta es mayor de edad y false en otro caso.

fun esMayorDeEdad(edad: Int): Boolean {
    var mayor = true;

    if(edad < 18){
        mayor = false
    }

    return mayor
}

fun esMayorDeEdadSimplified1(edad: Int): Boolean {
    var mayor =
        if(edad < 18) {
            false
        } else {
            true
        }

    return mayor
}

fun esMayorDeEdadSimplified2(edad: Int): Boolean {
    return if(edad < 18) false else true
}

// 30.- Escribe una función que devuelva el máximo de dos números que
//reciba como argumentos de entrada. Solo está permitido usar if-else y
//operadores relacionales

fun getMaxBetweenTwoNumbers(val1: Int, val2: Int): Int{
    return if(val1>val2) val1 else val2
}

//31.- Implementa una función con un argumento de tipo entero que muestre
//o bien “El número es positivo” o bien “El número es negativo” o bien “El
//número es 0”

fun isValuePositiveOrNegative(value: Int) {
    if (value > 0) {
        println("$value => El valor es positivo")
    } else if(value < 0) {
        println("$value => El valor es negativo")
    } else {
        println("$value => El valor es cero")
    }
}

//33.- Un determinado curso solo acepta alumnos de más de 25 años y cuya
//nota del año anterior sea superior a 6. Escribe una función que determine si
//una persona será aceptada o no en ese curso.

// fun studentIsValid(age: Int, grade: Int) = if(age > 24 && grade > 6) true else false
fun studentIsValid(age: Int, grade: Int) = age > 24 && grade > 6

//34.- Implementa una función que determine si un determinado String tiene
//formato de email.

fun emailIsValid(email: String) : Boolean {
    return email.contains('@') &&
            email.substringAfter('@').contains('.') &&
            email.substringAfter('@').last() != '.'
}

fun mainWhen() {

    println("=========== Probando la sentencia when ==============\n")

    println("Enero: ${getDaysInMonth("Enero")} días")
    println("Febrero: ${getDaysInMonth("Febrero")} días")
    println("Abril: ${getDaysInMonth("Abril")} días")
    println("Febril: ${getDaysInMonth("Febril")} días")

    println("Lunes: ${getWeekDay("Lunes")}")
    println("Miércoles: ${getWeekDay("Miércoles")}")
    println("Viernes: ${getWeekDay("Viernes")}")
    println("Domingo: ${getWeekDay("Domingo")}")
    println("Vidolu: ${getWeekDay("Vidolu")}")
}

fun getDaysInMonth(month: String): Int {
    var days = 0
    when(month.lowercase()) {
        "enero", "marzo", "mayo", "julio", "agosto", "ocutbre", "diciembre" -> days = 31
        "febrero" -> days = 28
        "abril", "junio", "septiembre", "noviembre" -> days = 30
        else -> days = -1
    }
    return days
}

fun getDaysInMonthShort(month: String): Int {

    val days = when(month) {
        "enero", "marzo", "mayo", "julio", "agosto", "ocutbre", "diciembre" ->  31
        "febrero" -> 28
        "abril", "junio", "septiembre", "noviembre" -> 30
        else -> -1
    }
    return days
}

fun getDaysInMonthShorter(month: String): Int {
    return when(month) {
        "enero", "marzo", "mayo", "julio", "agosto", "ocutbre", "diciembre" ->  31
        "febrero" -> 28
        "abril", "junio", "septiembre", "noviembre" -> 30
        else -> -1
    }
}

fun showPersonInfo(edad: Int) {
    when (edad) {
        in 0..12 -> println("Es un nino")
        in 13..18 -> println("Es un adolescente")
        !in 0..130 -> println("Edad incorrecta")
        else -> println("Es un adulto")
    }
}

// 36.- Usando la expresión when, implementa una función que reciba un
//número entero y muestre por pantalla su correspondiente día de la semana,
//si el número no están entre el 1 y el 7, deberá mostrar “error”

fun getWeekDay(day: String): Int {
    return when(day) {
        "Lunes" -> 1
        "Martes" -> 2
        "Miércoles" -> 3
        "Jueves" -> 4
        "Viernes" -> 5
        "Sábado" -> 6
        "Domingo" -> 7
        else -> -1
    }
}

// 37.- Usando la expresión when, implementa una función que devuelva si
//un determinado carácter es una vocal o no.

fun isVocal(char: String): Boolean {
    return when(char.toCharArray()[0]) {
        'a', 'e', 'i', 'o', 'u' -> true
        else -> false
    }
}

// 38.- Usando la expresión when, implementa una función que acepte un
//número entero y muestre por pantalla “par” si este es par o “impar” en
//caso contrario

fun isPar(number: Int): Boolean {
    return when(number % 2 == 0 ) {
        true -> true
        else -> false
    }
}

// 39.- Usando la expresión when, implementa una función que reciba una
//nota numérica y la transforme en una palabra:
// Menor que 5 → “Suspenso”
// Mayor o igual a 5 y menor que 7 → “Aprobado”
// Mayor o igual que 7 y menor que 9 → “Notable”
// Mayor o igual que 9 → “Sobresaliente”

fun numericGradeToWord(numericGrade: Int): String{
    return when(numericGrade) {
        in 0..4 -> "Suspenso"
        in 5..6 -> "Aprobado"
        in 7..8 -> "Notable"
        in 9..10 -> "Sobresaliente"
        !in 0..10 -> "Nota inválida"
        else -> "La vida es una tómbola, tom tom tómbola"
    }
}

// https://kotlinlang.org/docs/returns.html

fun mainJumps() {

    println("========================================================\n")
    println("========================================================\n")

    var listX = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var listY = listOf<Int>(12, 23, 4, 67, 8, 98, 2, 12)

    for (x in listX) {
        for (y in listY) {
            if (x==y) {
                println("$x está en ambos")
                break // interrumple la ejecución del for actual
            }
        }
    }

    bucle_externo@ for(x in listX) {
        for (y in listY) {
            if (x==y) {
                println("$x está en ambos")
                break@bucle_externo // interrumple la ejecución del bucle inmediatamente superior
            }
        }
    }

    val frase = "El mundo es un pañuelo"

    for (ch in frase) {
        if (ch == ' ') {
            continue
        }
        print(ch)
    }

    println("")

    println(ex47(listOf(10, 15, 20, 25, 30, 35, 40, 45, 50)))
    println(ex47(listOf(10)))
    ex48(listOf(10, 15, 20, 25, 30, 35, 40, 45, 50))
}

// 47.- Implementa una función que tenga un parámetro de tipo List<Int> y
//que te devuelva el índice del elemento que hace que la suma de todos los
//anteriores sea mayor que 100. Si la suma de todos no lo cumple se
//devolverá -1

fun ex47(list: List<Int>): Int {
    var contador = 0
    var index = -1

    for ((i, value) in list.withIndex()) {
        contador+=value
        if(contador>=100){
            index = i
            break
        }
    }

    return index
}

//48.- Usa continue para mostrar solo los números pares de una lista de
//enteros

fun ex48(list: List<Int>) {

    for (i in list) {
        if(i %2 != 0) continue
        println(i)
    }
}

fun mainFor() {

    println("========================================================\n")
    println("========================================================\n")

    for (i in 1..100) {
//        println(i)
    }

    val animals = arrayOf("perro", "gato", "elefante")
    for (animal in animals) {
        println("$animal tiene ${animal.length} letras")
    }

    for (index in animals.indices) {
        println("${animals[index]} tiene ${animals[index].length} letras y está en la posición $index")
    }

    for ((index, value) in animals.withIndex()) {
        println("${animals[index]} tiene ${animals[index].length} letras y está en la posición $index")
    }

    println(tengoSueño(33333))
}

// 40.- Haz una función que muestre por pantalla los primeros 10 números
//naturales

fun naturalNumbersUntilTen () {
    for (i in 1..10) {
        println(i)
    }
}

//41.- Implementa una función que reciba un número entero como
//argumento y devuelva la suma de todos los números naturales hasta él.

fun sumaNumerosHasta(entero: Int): Int {
    var contador = 0
    for (i in 1..entero) {
        contador += i
    }
    return contador
}

//42.- Implementa una función que muestre por pantalla la tabla de
//multiplicar de un número entero que reciba como argumento.

fun multiplica(number: Int) {
    for (i in 1..10){
        println(i * number)
    }
}

//43.- Escribe una función que tenga un parámetro de tipo List<Int> y que
//devuelva el mayor usando un bucle for.

fun getMayorValueInList(list: List<Int>): Int {
    var mayor = list[0]
    for(element in list) {
        if (mayor < element) mayor = element
    }
    return mayor
}

// 44.- Escribe una función con un parámetro de tipo entero que devuelva la
//suma de los números naturales hasta el mismo que sean divisibles por 5.

fun tengoSueño(number: Int): List<Int> {
    var divisibles = mutableListOf<Int>()

    for (i in 1..number) {
        if(i % 5 == 0) divisibles.add(i)
    }

    return divisibles
}


fun mainWhile() {

    println("========================================================\n")
    println("========================================================\n")

    var potenciaDeDos = 2

    while(potenciaDeDos <= 3000) {
        potenciaDeDos *= 2
    }

    println("El resultado es $potenciaDeDos")

    var x = 50
    do {
        println(x)
        x++
    } while (x <= 20)

    println(ex46())
    println(ex45(listOf("Hola", "Mundo", "Cruel", "Tengo", "Sueño")))
}

// 45.- Implementar una función a la que se le pase una lista de Strings y que
//devuelva el primero que contenga la letra ‘e’ o un String vacío si no existe.
//Usa un bucle while para conseguirlo.

fun ex45(list: List<String>): String {
    var index = 0
    while(index < list.size) {
        var current = list[index]
        if(current.contains('e')) return current
        index++
    }
    return ""
}

//46.- Muestra por pantalla el primer múltiplo de 5 que sea mayor que 2001
//usando un bucle while

fun ex46(): Int {
    var value = 0

    while (value < 2001 || value % 5 != 0) {
        value++
    }

    return value
}


// https://kotlinlang.org/docs/ranges.html

fun mainRangesAndProgressions() {

    println("downTo:")
    for(i in 10 downTo 1) {
        println(i)
    }

    println("until 5:")
    for (i in 1 until 5) {
        println(i)
    }

    println("step:")
    for (i in 1 .. 10 step 3) {
        println(i)
    }

    println("setp with until 10")
    for (i in 1 until 10 step 3) {
        println(i)
    }

    if("mariposa" in "acacia".."amapola") // works
    {
        // works
    }

//    for (i in "acacia".."amapola") {
//         dont works
//    }

// rango => hay un mínimo y un máximo
// secuencia => tenemos que tener todos los elementos entre un mínimo y un máximo
// con los strings tenemos rangos pero no secuencias
// Solo con los números y los carácteres ('a'..'z') tenemos secuencias (pero no rangos?)

    println("showEvenNumbers")
    showEvenNumbers()

    println("showOddNumbers")
    showOddNumbers()

    println(ex49(5, 1, 10))
    println(ex49(5, 10, 1))
    println(ex49(100, 5, 10))
}

// 49.- Implementa una función con 3 parámetros de entrada de tipo entero y
//que devuelva true si el primero está dentro del rango de los otros dos.
//Devolverá false en caso contrario

fun ex49(val1: Int, val2: Int, val3: Int): Boolean {
    if(val1 in val2..val3){
        return true
    }

    if(val1 in val2 downTo val3){
        return true
    }

    return false
}

//50.- Usando una progresión, muestra por pantalla todos los números
//impares del 0 al 100.

fun showEvenNumbers(){
    for(i in 0 .. 20 step 2)
    {
        println(i)
    }
}

//51.- Usando una progresión, muestra por pantalla todos los números
//impares del 0 al 100 de mayor a menor.

fun showOddNumbers(){
    for(i in 19 downTo 0 step 2)
    {
        println(i)
    }
}