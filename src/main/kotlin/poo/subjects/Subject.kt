package poo.subjects

import poo.persons.Person

// 90.- Crear la clase abstracta Asignatura, esta tendrá dos propiedades:
//      profesor, de tipo Persona y aula de tipo String.

abstract class Subject(val teacher: Person, val aula: String) {

    // 91.- Añadir a la clase Asignatura una función abstracta, mostrarHorario,
    //      que muestre por pantalla el horario de la asignatura
    abstract fun showSchedule()

    // 92.- Añadir a la clase Asignatura una función con implementación por
    //      defecto llamado mostrarInformacion que muestre por pantalla “Esta
    //      asignatura se imparte en el aula x por parte de y” siendo x el aula e y el
    //      nombre del profesor.
    fun showInfo() {
        println("Esta asignatura se imparte en el aula $aula por parte de ${teacher.firstname} ${teacher.lastname}")
    }



}