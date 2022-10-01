package control

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