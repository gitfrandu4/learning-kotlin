//val name: String = null // Null can not be a value of a non-null type String

val name: String? = null
var lastname = "García"

name?.uppercase() ?: "Strange"
lastname.uppercase()

//El operador elvis
//101.- ¿Qué mostrará este código por pantalla?. Piénsalo y luego escríbelo
//para comprobarlo.

fun main(args: Array<String>) {
    val x: Int? = 2
    val y: Int = 3
    val sum = x ?: 0 + y
    println(sum)
}

main(arrayOf())

val word: String? = null
// val anotherWord: String = word!!  // Exception in thread "main" java.lang.NullPointerException
