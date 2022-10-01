package control

// https://kotlinlang.org/docs/returns.html

fun mainExceptions() {
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