package poo.person

import poo.Address
import java.lang.IllegalArgumentException

//import poo.enum.Grade

class Student (
    firstname: String,
    lastname: String,
    phone: String,
    address: Address,
    val grades: MutableList<Double>? = mutableListOf()): Person(firstname, lastname, address, phone){

    enum class Grade {
        ERROR, D, C, B, A
    }

    val isApproved: Boolean
        get() {
            val average = grades?.average() ?: 0.00
            return average >= 5
        }

    fun averageGrade(): Double {
        return grades?.average() ?: 0.0
    }

    fun insertGrade(grade: Double){
        if(grade<0 || grade>10) throw IllegalArgumentException("La nota debe estar comprendida entre 0 y 10")
        grades?.add(grade)
    }

    @JvmName("getGrades1")
    fun getGrades(): List<Grade>? {
        return grades?.map{nota ->
            when {
                nota < 0 || nota > 10 -> Grade.ERROR
                nota < 5 -> Grade.D
                nota < 7 -> Grade.C
                nota < 9 -> Grade.B
                else -> Grade.A
            }
        }
    }

    override fun showPostalCode() {
        println("Esta información es sensible")
    }
}