package poo

import poo.data.Address
import poo.enum.Color
import poo.enum.WeekDay

fun mainPoo() {
//    val miRectangle = Rectangle()
//
//    miRectangle.width = 10.0
//    miRectangle.height = 5.5

    println()
//    println("El área de mi rectángulo es: ${miRectangle.getArea()}")

    // 58.- En tu función main, crea un objeto de tipo Alumno e inicializa su
    //nombre y apellido, añade algunas notas a su lista y calcula la media.

    val myStudent = Student("Dennys", "Bonilla Bonilla")

    myStudent.insertGrade(7.9)
    myStudent.insertGrade(4.0)
    myStudent.insertGrade(9.01)

    println("El estudiante ${myStudent.firstName} ${myStudent.lastName} tiene una nota media de: ${myStudent.averageGrade()}")

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
    val miRectangle = Rectangle2(5.00, 5.00)
    println("miRectangle es cuadrado: ${miRectangle.esCuadrado}")
    val miRectangle2 = Rectangle2(5.02, 5.00)
    println("miRectangle2 es cuadrado: ${miRectangle2.esCuadrado}")

    // getters
//    miRectangle.grosor = -1 // Exception in thread "main" java.lang.IllegalArgumentException: El valor del grosor debe ser positivo
    miRectangle.grosor = 1

    println("===================================================")
    println("================= DATA CLASS  =====================")
    println("===================================================")

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

//    val student: Student2 = Student2("Pedro", "Jota", address = address4)

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

    val student4: Student2 = Student2("Fran", "Lopez", "232323", address1)
    student4.insertGrade(2.33)
    student4.insertGrade(5.64)
    student4.insertGrade(9.54)
    student4.insertGrade(8.44)

    println(student4.getGrades())

    println("===================================================")
    println("=============== CLASES ANIDADAS  ==================")
    println("===================================================")

    val miProcesador = Laptop.Processor(4, 2.5)
    miProcesador.mostrarEspecificaciones()

    // val myScoreBoardError = Game.ScoreBoard() // Constructor of inner class ScoreBoard can be called only with receiver of containing class
    // Solución:

    val myGame = Game(0)
    val myScoreBoard = myGame.ScoreBoard()
    myScoreBoard.increase(12)
    myScoreBoard.decrease(23)

    println(myGame.score)

    println("===================================================")
    println("============= FUNCIONES de EXTENSIÓN ==============")
    println("===================================================")

    val name = "Felipe Juan Froilán"
    val firstChar = name.first()
    val secondChar = name.mySecondChar() // nuestra función extendida de la clase string
    val tercerChar = name.tercero

    print("$firstChar $secondChar $tercerChar")
}