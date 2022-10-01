package poo.inheritance

import poo.Student2
import poo.data.Address
import poo.enum.AnimalType

fun mainHerency() {
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

    val student: Student2 = Student2(
        "Pedro",
        "Pérez Reyes",
        "622741666",
        Address("Calle la esperanza", 2, 35617))

    student.showPostalCode()
}

interface Engine {
    fun start()
    fun speedUp()
}