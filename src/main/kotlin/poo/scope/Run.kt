package poo.scope

class Run {
    // 109.- Haciendo uso de run, declara una variable de tipo String?. Solo en
    //caso de que no sea null, muestra por pantalla su número de caracteres.
    fun getStringLength(word: String?) {
//        var nChar = word?.run {
//            length
//        } ?: 0
//        println("La variable tiene $nChar caracteres")

        word?.let {  } ?: run { println(word?.length) }
    }
}

fun main() {
    val run: Run = Run()

    run.getStringLength("Hola mundo!")
    run.getStringLength(null)
}
