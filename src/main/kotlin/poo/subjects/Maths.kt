package poo.subjects

import poo.persons.Person

// 93.- Crear una clase llamada Matematicas que extienda Asignatura e
//      implementar su función abstracta.
class Maths(teacher: Person, classRoom: String): Subject(teacher, classRoom) {
    override fun showSchedule() {
        println("El horario es de 16:00 a 20:00")
    }

}