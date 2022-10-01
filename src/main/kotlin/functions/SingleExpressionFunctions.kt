package functions

import kotlin.math.PI
import kotlin.math.pow

// --------------- Funciones de una expresión -----------------

fun areaDelCirculo(radio: Double): Double {
    return PI * radio.pow(2)
}

fun areaDelCirculo_(radio: Double): Double = PI * radio.pow(2)

fun areaDelCirculo__(radio: Double) = PI * radio.pow(2) // más simple

// 29.- Convierte todas las funciones posibles y recomendables que has
// implementado anteriormente en funciones de una expresión.

fun getListMultipliedByValueSE(list: List<Int>, value: Int = 1) = list.map { it * value }

fun calculateSubtractionSE(minuend: Int, subtrahend: Int) = minuend - subtrahend

fun getPairsInListSE(numbers: List<Int>) = numbers.filter { it % 2 == 0 }

fun getValuesGreaterThanFiveSE(numbers: List<Int>) = numbers.filter { it > 5 }

fun countPairsSE(numbers: List<Int>) = numbers.count { it % 2 == 0}

fun countValuesGreaterThanFiveSE(numbers: List<Int>) = numbers.count { it > 5 }

fun calculateAverageBetweenTwoNumbersSE(val1: Int, val2: Int) = (val1 + val2) / 2.0

fun getSecondsInMinutesSE(minutes: Int) = minutes / 60.00


