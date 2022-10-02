package poo

import poo.persons.Student

//fun String.segundo() = this.get(1)
fun String.mySecondChar() = get(1) // Como get es una función de la clase string,

val String.tercero : Char
    get() = this.get(2)

// 80.- Una extensión que te diga si tiene algún suspenso
fun Student.hasD(): Boolean {
    return grades?.firstOrNull{grade -> grade < 5} != null
}

// 81.- Una extensión que te diga si tiene algún sobresaliente.
fun Student.hasA(): Boolean {
    return grades?.firstOrNull{grade -> grade >= 9} != null
}

// 82.- Una extensión que te diga si tiene todo suspensos
fun Student.hasAllD(): Boolean? {
    return grades?.all{grades -> grades < 5}
}

// 83.- Una extensión que te diga si tiene todo sobresalientes
fun Student.hassAllA(): Boolean? {
    return grades?.all{ grade -> grade in 9.0..10.0}
}

// 84.- Una extensión de List<Alumno> que te diga cual tiene la mejor nota media.
fun List<Student>.mejor(): Student {
    var mejor = this[0]
    for (alumno in this) {
        if (alumno.averageGrade() >= mejor.averageGrade()) {
            mejor = alumno
        }
    }
    return mejor
}

fun List<Student>.bestStudent(): Student = this.maxBy { it.averageGrade() }
