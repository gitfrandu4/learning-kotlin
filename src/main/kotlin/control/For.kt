package control

fun mainFor() {

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