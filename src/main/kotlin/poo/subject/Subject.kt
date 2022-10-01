package poo.subject

import poo.person.Person

abstract class Subject(val teacher: Person, val aula: String) {

    abstract fun showSchedule()

    fun showInfo() {
        println("Esta asignatura se imparte en el aula $aula por parte de ${teacher.firstname} ${teacher.lastname}")
    }
}