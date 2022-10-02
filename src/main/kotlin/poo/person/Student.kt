package poo.person

import poo.Address
import java.lang.IllegalArgumentException

import poo.enum.Grade

// 61.- En tu clase Alumno, pasa las propiedades al constructor principal
// 62.- Corrige la instanciación de tus alumnos en la función main.
// 63.- Haz que notas sea un parámetro opcional de tu constructor.

// 65.- Aunque el nombre, apellidos y teléfono de una persona puede
//      cambiar, vamos a considerar que en nuestro contexto no lo hará y por lo
//      tanto vamos a declarar todas las propiedades de nuestra clase Alumno
//      como inmutables para hacerla así más segura.

class Student (
    firstname: String,
    lastname: String,
    address: Address,
    phone: String,
    val grades: MutableList<Double>? = mutableListOf()): Person(firstname, lastname, address, phone){

    // 70.- Haz que tu clase Nota sea una clase anidada de Alumno
    enum class Grade {
        ERROR, D, C, B, A
    }

    // 64.- Tenemos los datos de algunos alumnos almacenados como String con
    //      el formato “Nombre-Apellido”. Crea un constructor secundario al que se le
    //      pueda pasar un String de este tipo para crear nuestro objeto de tipo
    //      Alumno.

    // Constructor secundario
    constructor(
        fullname: String,
        address: Address ,
        phone: String
    ) : this (
        fullname.substringBefore('-'),
        fullname.substringAfter('-'),
        address,
        phone
    )


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

    // Preguntar por el error en caso de no dejar el internal
    internal fun getGrades(): List<Grade>? {
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