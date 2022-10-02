package poo

import poo.person.Student
import poo.animal.Animal
import poo.animal.Cat
import poo.animal.Dog
import poo.enum.AnimalType
import poo.person.Person

fun mainInheritance() {
    val animal = Animal(5, AnimalType.VERTEBRADO)
    animal.eat()

    val cat = Cat(7)
    cat.eat()

    val dog = Dog(3)
    dog.eat()
    dog.bar()

    val person: Person = Person(
        "Fran",
        "López",
        Address("Calle Soto Mayor", 2, 35600),
        "622333444"
    )

    println(person.address)
    person.showPostalCode()

    val student: Student = Student(
        "Pedro",
        "Pérez Reyes",
        Address("Calle la esperanza", 2, 35617),
        "622741666",
    )

    student.showPostalCode()
}

interface Engine {
    fun start()
    fun speedUp()
}