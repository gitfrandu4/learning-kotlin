package control

fun mainControl(){

    println("\n========================================================")
    println("======= Probando las estructuras de control ============")
    println("========================================================\n")

    println("=========== Probando la sentencia if-else ==============\n")

    println("Es mayor de edad: ${esMayorDeEdadSimplified2(23)}")
    println("El mayor de {12, 33} es: ${getMaxBetweenTwoNumbers(12, 33)}")

    isValuePositiveOrNegative(12)
    isValuePositiveOrNegative(-122)
    isValuePositiveOrNegative(0)

    println("Froilán tiene 33 años y su nota media del curso pasado es: 1. Puede ser admitido en el curso: ${studentIsValid(33, 1)}")
}