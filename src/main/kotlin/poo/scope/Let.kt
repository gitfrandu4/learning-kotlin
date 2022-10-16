package poo.scope

class Let {

    var miPropiedad: String? = null

    var notNull: String? = null
    var neitherNull: String? = null

    fun miMetodo() {
        if (miPropiedad != null) {
            // miPropiedad.length
            /** Error porque nada nos asegura que después de comprobar que
             * no es null, haya podido modificarse en otro hilo y ahora sí lo sea (propiedad mutable) */
        }

        miPropiedad?.let {
            // En este caso si podemos acceder de forma segura a la propiedad, puesto que it toma una foto
            // de la variable en el momento que se le llama.
            it.length
        }

        // Es lo mismo que si hubieramos hecho:
        val miPropiedadValorActual = miPropiedad
        if (miPropiedadValorActual != null) {
            miPropiedadValorActual.length
        }
        // Pero de la otra manera queda más limpio
    }


    // 105.- Declara una variable que puede ser null. Con la ayuda de let, muestra
    //por pantalla el mensaje: “¡No es null, es x!” solo en caso de que la
    //variable no sea null. Siendo x el valor de la variable
    fun isNull(variable: String?) {
        notNull.let { println("No es null, es $it") }
    }

    // 106.- Declara otra variable que pueda ser null. Con la ayuda de let,
    //muestra por pantalla el mensaje “¡No son null, son x y y!” solo en el caso
    //de que ambas variables no sean null. Siendo x el valor de la primera
    //variable e y el de la siguiente.
    fun neverNull() {
        notNull?.let { var1 ->
            neitherNull?.let { var2 -> println("No son null, son $var1 y $var2") }
        }
    }
}

fun main() {
    var clase: Let = Let()

    clase.run {
        neverNull()

        notNull = "Ana"
        neitherNull = "Maria"

        neverNull()
    }

    // 107.- En el primer escenario, con una única variable y también haciendo
    //uso de let, muestra por pantalla el mensaje “¡Es null!” en el caso de que la
    //variable lo sea.
    val nombre: String? = null
    nombre?.let { } ?: run { println("¡Es Null!") }
}