package poo

import poo.animal.Animal
import poo.animal.Cat
import poo.animal.Dog
import poo.enums.AnimalType
import poo.enums.Color
import poo.enums.WeekDay
import poo.persons.Person
import poo.vehicles.Car
import poo.shapes.Rectangle
import poo.subjects.Maths
import java.lang.IllegalArgumentException
import poo.persons.Student as Student2 // Student with inheritance from Person Class

fun mainPoo() {

    println("\n========================================================")
    println("========== Programación Orientada a Objetos ==============")
    println("========================================================\n")

    val rectangleA = Rectangle(2.0, 4.0, 0, 0) // there's no 'new' keyword in Kotlin

    rectangleA.width = 10.0
    rectangleA.height = 5.5

    rectangleA.trasladar(2, 2)

    println("El área de mi rectángulo es: ${rectangleA.getArea()}")
    println("La posición de mi rectángulo es [${rectangleA.x}, ${rectangleA.y}]")
    println("¿Mi rectángulo es cuadado? => ${rectangleA.isSquare}")


    // 58.- En tu función main, crea un objeto de tipo Alumno e inicializa su
    //nombre y apellido, añade algunas notas a su lista y calcula la media.

    val myStudent = Student("Dennys", "Bonilla Bonilla")
    println("El estudiante ${myStudent.firstName} ${myStudent.lastName} tiene una nota media de: ${myStudent.averageGrade()}")
    myStudent.insertGrade(7.9)
    myStudent.insertGrade(4.0)
    myStudent.insertGrade(9.01)
    println("El estudiante ${myStudent.firstName} ${myStudent.lastName} tiene una nota media de: ${myStudent.averageGrade()}")

    // Utilizamos el constructor secundario al que le pasamos el nombre completo separado por '-'
    val myOtherStudent = Student2("Juan - López Iturriaga", Address("Calle Rue 13 Percebe", 12345, 35600), "6227741741")
    println(myOtherStudent.firstname)
    println(myOtherStudent.lastname)


    // 59.- En tu función main, crea una lista de alumnos (List<Alumno>) y
    //ordénalos alfabéticamente por apellido.
    val listStudent = listOf<Student>(
        Student("Laureano", "Cardozo"),
        Student("Pedro", "Del Olmo"),
        Student("María", "De la O"),
        Student("Sofía", "Pérez Romanov"),
        Student("Hulk", "Banner")
    )

    listStudent.sortedBy {
        it.lastName
    }.forEach(){
        println("${it.lastName}, ${it.firstName}")
    }

    // setters
    val miRectangle = Rectangle(5.00, 5.00, 0, 0)
    println("miRectangle es cuadrado: ${miRectangle.isSquare}")
    val miRectangle2 = Rectangle(5.02, 5.00, 0, 0)
    println("miRectangle2 es cuadrado: ${miRectangle2.isSquare}")

    // getters
    try {
        // Exception in thread "main" java.lang.IllegalArgumentException: El valor del grosor debe ser positivo
        miRectangle.thickness = -1
    } catch (e: IllegalArgumentException) {
        println("No se han podido modificar las propiedades de objeto: $e")
    }
    miRectangle.thickness = 1





    println("\n===================================================")
    println("=============== CLASES ANIDADAS  ==================")
    println("===================================================\n")

    val miProcesador = Laptop.Processor(4, 2.5)
    miProcesador.mostrarEspecificaciones()

    // val myScoreBoardError = Game.ScoreBoard() // Constructor of inner class ScoreBoard can be called only with receiver of containing class
    // Solución:

    val myGame = Game(0)
    val myScoreBoard = myGame.ScoreBoard()
    myScoreBoard.increase(12)
    myScoreBoard.decrease(23)

    println(myGame.score)





    println("\n===================================================")
    println("======== Practicing Inheritance in Kotlin  ==========")
    println("===================================================\n")

    val animal = Animal(5, AnimalType.VERTEBRADO)
    animal.eat()

    val cat = Cat(7)
    cat.eat()

    val dog = Dog(3)
    dog.eat()
    dog.bark()

    val person: Person = Person(
        "Fran",
        "López",
        Address("Calle Soto Mayor", 2, 35600),
        "622333444"
    )
//    println(person.address) address is private
    person.showPostalCode()
    person.showAddress()

    val student: poo.persons.Student = poo.persons.Student(
        "Pedro",
        "Pérez Reyes",
        Address("Calle la esperanza", 2, 35617),
        "622741666",
    )

    // 88.- Crear un objeto de tipo Alumno y usa el método que muestra la
    //      dirección por pantalla.
    student.showPostalCode()
    student.showAddress()

    // 94.- Crear un objeto de tipo Matematicas y llamar a sus dos funciones
    val maths: Maths = Maths(student, "Aula 1982")
    maths.showInfo()
    maths.showSchedule()





    println("\n===================================================")
    println("================= DATA CLASS  =====================")
    println("===================================================\n")

    val myAddressA = Address("Calle Fuencarral", 78, 234555)
    val myAddressB = Address("Calle Lomo Blanco", 77, 234785)
    val myAddressC = Address("Calle Lomo Blanco", 77, 234785)

    myAddressA.population = "AAAAA"
    myAddressB.population = "BBBBB"
    myAddressC.population = "AAAAA"

    println(myAddressA) // Implementa la función toString
    println(myAddressB)
    println(myAddressC)

    println(myAddressA == myAddressB) // Implementa un comparador
    println(myAddressC == myAddressB)

    val myAddressD = myAddressA.copy() // Implementa una función para copiar el objeto
    val myAddressE = myAddressA.copy(number = 2345)

    println(myAddressD)
    println(myAddressE)




    println("===================================================")
    println("=================== ENUM  =========================")
    println("===================================================")

    val thursday: WeekDay = WeekDay.THURSDAY
    print(thursday)
    val monday: WeekDay = WeekDay.MONDAY
    println(monday)
    println("La posición de Lunes es: ${WeekDay.MONDAY.ordinal}")
    println("El nombre de Lunes es: ${WeekDay.MONDAY.name}")

    for (dia in WeekDay.values()) {
        println(dia.name)
    }

    println(WeekDay.valueOf("MONDAY"))
    // println(WeekDays.valueOf("SHITDAY")) Exception in thread "main" java.lang.IllegalArgumentException: No enums constant poo.enums.WeekDays.SHITDAY

    println(WeekDay.MONDAY < WeekDay.SUNDAY)

    val colorSalmon = Color.SALMON.hex
    println(colorSalmon)

    println(myOtherStudent.averageGrade())

    val student4: Student2 = Student2("Fran", "Lopez", myAddressA, "232323")
    student4.insertGrade(2.33)
    student4.insertGrade(5.64)
    student4.insertGrade(9.54)
    student4.insertGrade(8.44)

    println(student4.getGrades())

    val student5: Student2 = Student2("Joan", "Del Mar", myAddressA, "32333")
    student5.insertGrade(8.44)




    println("\n===================================================")
    println("============= FUNCIONES de EXTENSIÓN ==============")
    println("===================================================\n")

    val name = "Felipe Juan Froilán"
    val firstChar = name.first()
    val secondChar = name.mySecondChar() // nuestra función extendida de la clase string
    val tercerChar = name.tercero

    println("$firstChar $secondChar $tercerChar")
    println("${student4.firstname} tiene suspensos: ${student4.hasD()}")
    println("${student4.firstname} tiene sobresalientes: ${student4.hasA()}")

    val listOfStudents: List<Student2> = listOf(student4, student5, myOtherStudent)
    val bestStudent = listOfStudents.mejor()
    println("El mejor estudiante es: ${bestStudent.firstname} con la nota media: ${bestStudent.averageGrade()}")




    println("\n===================================================")
    println("===================== INTERFACES ====================")
    println("===================================================\n")

    val myCar = Car()

    myCar.startEngine()
    myCar.speedUp(19)
    myCar.slowDown(9)
    myCar.slowDown(111)
    myCar.speedUp(11)
    myCar.stopEngine()

    // 97.- Llamar a alguno de los anteriores métodos en un objeto de tipo
    //      Alumno.
    student.call()
    student.writeLetter(
        "¿Qué tal?\n" +
                "Dicen que te han visto por ahí\n" +
                "Dando tumbos por todo Madrid\n" +
                "Yo ya no comprendo\n" +
                "Te he visto sonriendo al fin"
    )
}