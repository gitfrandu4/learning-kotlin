package functions

// Una función es una secuencia de instrucciones que ejecutan una
// determinada tarea.

import java.time.LocalDateTime
import kotlin.math.pow

fun mainFunctions(args: Array<String>) {
    println("Hello World!")

    println("\n========================================================")
    println("======= Probando las funciones en Kotlin ===============")
    println("========================================================\n")

//    showDate()
//    val vocals = getVocals()
//    showVocals(vocals)
//    showVocals()
//    showAlphabet()

//    showMain()

//    println("El cuadrado de 7 es: " + square(7))

    val numbersList = listOf<Int>(1, 2, 3, 4, 5, 55, 67, 78, 99, 12, 22)

    println("En la lista numérica ${numbersList.sorted()} el mayor valor es: " + getMayorValueInList(numbersList))

    showGreeting("María", "Pérez de los Olmos")

    println("\n========= Probando Funciones con parámetros ============\n")

    println(getListMultipliedByValue(numbersList))
    println(getListMultipliedByValue(numbersList, 3))
    println(getListMultipliedByValue(value = 10, list = numbersList))
    calculateAndShowSubtraction(minuend = 6, subtrahend = 9)

    println("Números pares en la lista: ${getPairsInList(numbersList)}")
    println("Números mayores que 5 en la lista ${getValuesGreaterThanFive(numbersList)}")

    println("Mi lista tiene ${countPairs(numbersList)} números pares y ${countValuesGreaterThanFive(numbersList)} mayores que cinco")

    println("\n======== Probando Single Expression Functions ==========\n")

    println(getListMultipliedByValueSE(value = 10, list = numbersList))
    calculateSubtractionSE(minuend = 6, subtrahend = 9)

    println("Números pares en la lista: ${getPairsInListSE(numbersList)}")
    println("Números mayores que 5 en la lista ${getValuesGreaterThanFiveSE(numbersList)}")

    println("Mi lista tiene ${countPairsSE(numbersList)} números pares y ${countValuesGreaterThanFiveSE(numbersList)} mayores que cinco")

}

fun showDate() {
    val localDate = LocalDateTime.now()
    println("La fecha actual es $localDate")
}

// 15.- En el mismo proyecto y la misma clase Main, crea una función
//llamada milisegundosDesde1970 que muestre por pantalla los
//milisegundos que han pasado desde el 1 de enero de 1970 con una frase
//explicativa. Llama al método desde tu método main.

fun millisecondsFrom1970(): Long {
    return System.currentTimeMillis()
}

// 16.- Crea una función que muestre las letras del alfabeto por pantalla
//¿Cual sería un nombre adecuado para tu función?

fun getVocals(): Set<String> {
    val vocals = setOf<String>("a", "e", "i", "o", "u")

    return vocals
}

fun showVocals(vocals: Set<String>) {
    val vocalsIterator = vocals.iterator()

    vocalsIterator.forEach{
        println(it)
    }

    vocals.forEach(){
        println(it)
    }
}

fun showVocals() {
    val vocals = 'a'..'u' // [a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u]

    println(vocals.sorted())
}

fun showAlphabet(){
    val alphabet = 'a'..'z'

    println(alphabet.sorted())
}

// 17.- Crea una función que muestre por pantalla “Hola, mundo” y prueba a
//llamarla múltiples veces desde tu función main. ¿Qué ocurre?

fun showMain() {
    println("Hola, mundo")
}

// 18.- Crea una función con un parámetro de tipo entero que muestre por
//pantalla true si el argumento es par y false si es impar.

fun isPar(value: Int) {
    if(value % 2 == 0) println("El valor $value es par")
    else println("El valor $value no es par")
}

// 19.- Implementa una función que muestre por pantalla el cuadrado de un
//número que se le ha pasado como argumento.

fun square(value: Int): Double{
    return value.toDouble().pow(2.toDouble())
}

// 20.- Implementa una función con un parámetro de tipo List<Int> que
//muestre por pantalla el elemento mayor de la lista

fun getMayorValueInList(list: List<Int>): Int {
    return list.max()
}


// 21.- Implementa una función con dos parámetros llamados nombre y
//apellido y que muestre un saludo a esa persona por pantalla.

fun showGreeting(name: String, lastName: String) {
    println("¡Hola, $name $lastName!\n¡Qué tengas un día genial!")
}

