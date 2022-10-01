package control

fun mainWhen() {

    println("=========== Probando la sentencia when ==============\n")

    println("Enero: ${getDaysInMonth("Enero")} días")
    println("Febrero: ${getDaysInMonth("Febrero")} días")
    println("Abril: ${getDaysInMonth("Abril")} días")
    println("Febril: ${getDaysInMonth("Febril")} días")

    println("Lunes: ${getWeekDay("Lunes")}")
    println("Miércoles: ${getWeekDay("Miércoles")}")
    println("Viernes: ${getWeekDay("Viernes")}")
    println("Domingo: ${getWeekDay("Domingo")}")
    println("Vidolu: ${getWeekDay("Vidolu")}")
}

fun getDaysInMonth(month: String): Int {
    var days = 0
    when(month.lowercase()) {
        "enero", "marzo", "mayo", "julio", "agosto", "ocutbre", "diciembre" -> days = 31
        "febrero" -> days = 28
        "abril", "junio", "septiembre", "noviembre" -> days = 30
        else -> days = -1
    }
    return days
}

fun getDaysInMonthShort(month: String): Int {

    val days = when(month) {
        "enero", "marzo", "mayo", "julio", "agosto", "ocutbre", "diciembre" ->  31
        "febrero" -> 28
        "abril", "junio", "septiembre", "noviembre" -> 30
        else -> -1
    }
    return days
}

fun getDaysInMonthShorter(month: String): Int {
    return when(month) {
        "enero", "marzo", "mayo", "julio", "agosto", "ocutbre", "diciembre" ->  31
        "febrero" -> 28
        "abril", "junio", "septiembre", "noviembre" -> 30
        else -> -1
    }
}

fun showPersonInfo(edad: Int) {
    when (edad) {
        in 0..12 -> println("Es un nino")
        in 13..18 -> println("Es un adolescente")
        !in 0..130 -> println("Edad incorrecta")
        else -> println("Es un adulto")
    }
}

// 36.- Usando la expresión when, implementa una función que reciba un
//número entero y muestre por pantalla su correspondiente día de la semana,
//si el número no están entre el 1 y el 7, deberá mostrar “error”

fun getWeekDay(day: String): Int {
    return when(day) {
        "Lunes" -> 1
        "Martes" -> 2
        "Miércoles" -> 3
        "Jueves" -> 4
        "Viernes" -> 5
        "Sábado" -> 6
        "Domingo" -> 7
        else -> -1
    }
}

// 37.- Usando la expresión when, implementa una función que devuelva si
//un determinado carácter es una vocal o no.

fun isVocal(char: String): Boolean {
    return when(char.toCharArray()[0]) {
        'a', 'e', 'i', 'o', 'u' -> true
        else -> false
    }
}

// 38.- Usando la expresión when, implementa una función que acepte un
//número entero y muestre por pantalla “par” si este es par o “impar” en
//caso contrario

fun isPar(number: Int): Boolean {
    return when(number % 2 == 0 ) {
        true -> true
        else -> false
    }
}

// 39.- Usando la expresión when, implementa una función que reciba una
//nota numérica y la transforme en una palabra:
// Menor que 5 → “Suspenso”
// Mayor o igual a 5 y menor que 7 → “Aprobado”
// Mayor o igual que 7 y menor que 9 → “Notable”
// Mayor o igual que 9 → “Sobresaliente”

fun numericGradeToWord(numericGrade: Int): String{
    return when(numericGrade) {
        in 0..4 -> "Suspenso"
        in 5..6 -> "Aprobado"
        in 7..8 -> "Notable"
        in 9..10 -> "Sobresaliente"
        !in 0..10 -> "Nota inválida"
        else -> "La vida es una tómbola, tom tom tómbola"
    }
}