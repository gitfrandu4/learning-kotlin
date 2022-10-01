package functions

import kotlin.math.PI
import kotlin.math.pow

// ------------------ Argumenos con nombre y argumentos por defecto ------------------------

// 22.- Implementa una función que acepte como argumento una lista de
//números y tenga otro parámetro de tipo entero. Si se pasa un valor para ese
//segundo parámetro, se mostrará por pantalla la lista de los números
//multiplicados por el mismo, si no, se mostrará la lista de los números.

fun getListMultipliedByValue(list: List<Int>, value: Int = 1): List<Int>{
    return list.map { it * value }
}

// 23.- Crea una función que, al recibir dos números enteros, muestre por
//pantalla “La resta de ambos números es x” donde x será la resta. Llámala
//usando los nombres de los parámetros para distinguir el minuendo y el
//sustraendo.

fun calculateAndShowSubtraction(minuend: Int, subtrahend: Int): Int {
    val result = minuend - subtrahend

    println("La resta de ambos números es: $result")

    return result
}

// 24.- Implementa una función que tenga como parámetro de entrada una
//lista de enteros y te devuelva como salida el número de ellos que son
//pares.

fun getPairsInList(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 == 0 }
}

// 25.- Implementa una función que tenga como parámetro de entrada una
//lista de enteros y te devuelva como salida el número de ellos que son
//mayores que cinco.

fun getValuesGreaterThanFive(numbers: List<Int>): List<Int> {
    return numbers.filter { it > 5 }
}

// 26.- Desde la función main, crea una lista de enteros y llama a tus dos
//funciones anteriores mostrando por pantalla “Mi lista tiene ‘x’ números
//impares y ‘y’ números mayores que 5”

fun countPairs(numbers: List<Int>): Int {
    return numbers.count { it % 2 == 0}
}

fun countValuesGreaterThanFive(numbers: List<Int>): Int {
    return numbers.count { it > 5 }
}

// 27.- Implementa una función con dos argumentos de tipo entero que
//devuelva la media de los mismos.

fun calculateAverageBetweenTwoNumbers(val1: Int, val2: Int): Double {
    return (val1 + val2) / 2.0
}

// 28.- Implementa una función con un parámetro de tipo entero llamado
//segundos que devuelva su conversión en minutos.

fun getSecondsInMinutes(minutes: Int): Double {
    val secondsInOneMinute = 60
    return minutes / secondsInOneMinute.toDouble()
}


