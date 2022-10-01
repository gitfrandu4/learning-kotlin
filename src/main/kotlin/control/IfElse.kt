package control

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