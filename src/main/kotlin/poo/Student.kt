package poo

// 57.- Crea una clase llamada Alumno que tenga 3 propiedades: nombre y
//      apellido de tipo String y notas de tipo MutableList<Double>. Haz que
//      tenga también dos funciones, una función que devuelva la media de sus
//      notas y otra que añada una nota a la lista.

class Student {
    var firstName = ""
    var lastName = ""
    var grades = mutableListOf<Double>()

    constructor(firstName: String, lastName: String) {
        this.firstName = firstName
        this.lastName = lastName
    }

//    fun averageGrade(): Double {
//        var total = 0.00
//        grades.forEach(){
//            total+=it
//        }
//        return total/grades.count()
//    }

    fun averageGrade(): Double = grades.average()


    fun insertGrade(grade: Double){
        grades.add(grade)
    }
}