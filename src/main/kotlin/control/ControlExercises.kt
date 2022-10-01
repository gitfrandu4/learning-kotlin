package control

import kotlin.math.abs

fun mainControlExercises() {
    println(ex52(5, 2))
    println(ex52(2, 5))
    println(ex53(100, 305))
}

// 52.- Implementa una función que devuelva el valor absoluto de la resta de
//dos números que se le pasen como argumento

fun ex52(value1: Int, value2: Int): Int {
    return abs(value1-value2)
}

//53.- Implementa una función con dos parámetros de entrada que devuelva
//true si alguno de los dos está comprendido entre 100 y 200

fun ex53(value1: Int, value2: Int): Boolean {
//    return if(value1 in 100..200 || value2 in 100..200) true else false // redundant if statement
    return value1 in 100..200 || value2 in 100..200
}

//54.- Implementa una función con dos parámetros de tipo entero que
//devuelva el que esté más cercano a 100. Devuelve -1 si los dos números
//son iguales.
//55.- Escribe un algoritmo que cuente el número de 5`s que están junto a
//otro en una lista de enteros56.- Implementa una función con dos
//parámetros de tipo String y que determine si ambos comparten algún
//carácter.