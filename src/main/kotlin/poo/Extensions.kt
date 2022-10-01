package poo

//fun String.segundo() = this.get(1)
fun String.mySecondChar() = get(1) // Como get es una función de la clase string,

val String.tercero : Char
    get() = this.get(2)

fun Student2.hasD(): Boolean {
    return grades?.firstOrNull{grade -> grade < 5} != null
}

fun Student2.hasAllD(): Boolean? {
    return grades?.all{grades -> grades < 5}
}

fun Student2.hassAllA(): Boolean? {
    return grades?.all{ grade -> grade in 9.0..10.0}
}

fun List<Student2>.mejor(): Student2 {
    var mejor = this[0]
    for (alumno in this) {
        if(alumno.averageGrade() >= mejor.averageGrade()){
            mejor = alumno
        }
    }
    return mejor

    // more easy
    return this.maxBy { it.averageGrade() }
}