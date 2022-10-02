package poo

import poo.enum.Color
import poo.enum.WeekDay
import poo.shape.Rectangle
import java.lang.IllegalArgumentException
import poo.person.Student as Student2 // Student with inheritance from Person Class

fun mainPoo() {

    println("\n========================================================")
    println("========== Programación Orientada a Objetos ==============")
    println("========================================================\n")

    val rectangleA = Rectangle(2.0, 4.0, 0, 0)

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
    println("================= DATA CLASS  =====================")
    println("===================================================\n")

    val address1 = Address("Mayor", 28, 92345)
    val address2 = Address("Menor", 24, 23856)

    println(address1.toString())
    println(address2.toString())
    println(address1 == address2)

    val address3 = address1.copy()
    println(address1 == address3)

    val address4 = address1.copy(number = 23)
    println(address1 == address4)

    println(address4.population.toString())
    address4.population = "Madrid"
    println(address4.toString())
    println(address4.population.toString())

    println("===================================================")
    println("=================== ENUM  =========================")
    println("===================================================")

    val thursday: WeekDay = WeekDay.THURSDAY
    val monday: WeekDay = WeekDay.MONDAY
    println("La posición de Lunes es: ${WeekDay.MONDAY.ordinal}")
    println("El nombre de Lunes es: ${WeekDay.MONDAY.name}")

    for(dia in WeekDay.values()){
        println(dia.name)
    }

    println(WeekDay.valueOf("MONDAY"))
    // println(WeekDays.valueOf("SHITDAY")) Exception in thread "main" java.lang.IllegalArgumentException: No enum constant poo.enum.WeekDays.SHITDAY

    println(WeekDay.MONDAY < WeekDay.SUNDAY)

    val colorSalmon = Color.SALMON.hex

    val student4: Student2 = Student2("Fran", "Lopez", address1, "232323")
    student4.insertGrade(2.33)
    student4.insertGrade(5.64)
    student4.insertGrade(9.54)
    student4.insertGrade(8.44)

    println(student4.getGrades())

    val student5: Student2 = Student2("Joan", "Del Mar", address1, "32333")
    student5.insertGrade(8.44)

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
    println("============= FUNCIONES de EXTENSIÓN ==============")
    println("===================================================\n")

    val name = "Felipe Juan Froilán"
    val firstChar = name.first()
    val secondChar = name.mySecondChar() // nuestra función extendida de la clase string
    val tercerChar = name.tercero

    print("$firstChar $secondChar $tercerChar")
    println("${student4.firstname} tiene suspensos: ${student4.hasD()}")
    println("${student4.firstname} tiene sobresalientes: ${student4.hasA()}")

    val listOfStudents: List<Student2> = listOf(student4, student5, myOtherStudent)
    val bestStudent = listOfStudents.mejor()
    println("El mejor estudiante es: ${bestStudent.firstname} con la nota media: ${bestStudent.averageGrade()}")
}