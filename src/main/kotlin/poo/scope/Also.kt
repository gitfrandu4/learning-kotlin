package poo.scope

import poo.Address
import poo.persons.Person

class Also {
}

fun main() {
    val usuarios = mutableListOf<Person>()
    val newUser = Person("Ana Belén", "López Iturriaga", Address("Calle Lomo Verdejo", 2, 350018), "788455777")
        .also { usuarios.add(it) }
        .also { println("Se ha añadido el usuario ${it.firstname}") }
}