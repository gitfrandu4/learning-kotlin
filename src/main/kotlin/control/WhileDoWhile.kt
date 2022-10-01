package control

fun mainWhile() {
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