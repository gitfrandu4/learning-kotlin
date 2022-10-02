package poo.encapsulation.package1

open class ClassB(protected var propertyXYZ: String) {

    /**
     * A una propiedad private solo puede accederse desde la misma clase
     *
     */
    private val secret: Int = 123

    /**
     * Solo se permite el acceso a los elementos protected desde la propia clase o desde
     * las subclases
     */
    protected fun hello(){
        println("This is a protected function")
    }

    /**
     * Un elemento marcado como internal solo será accesible desde el mismo módulo (el proyecto completo)
     *
     * Muy útil para hacer librerías
     */
    internal fun revealSecret(){
        println("El secreto no tan secreto: $secret")
    }
}

fun funcionDePrimerNivel(){
    val myObjectB = ClassB("titititi")

    // aquí tampoco podríamos acceder a las propiedades protected
    // myObjectB.hello() // Cannot access 'hello': it is protected in 'ClassB'


}