package poo.shape

import java.lang.IllegalArgumentException

// Constructor primario de nuestra clase
class Rectangle (
    var width: Double,
    var height: Double,
    x: Int,
    y: Int
): Shape(x, y){

    // Constructor secundario
    constructor(rectangle: Rectangle) :
            this(rectangle.width, rectangle.height, rectangle.x, rectangle.y) {
                this.thickness = 2
    }

    // Bloque de inicialización: cuando queremos que cuando se construye un objeto de nuestra
    // clase se inicialicen cosas
    init {
        println("Inicializando un Rectángulo")

        // Podemos comprobar que los valores que le pasamos para inicialiar el objeto son válidos
        if(width < 0 || height < 0) {
            throw IllegalArgumentException("El ancho y el alto no pueden ser negativos")
        }

    }

    var thickness = 1
        set(value) {
            if(value <= 0) {
                throw IllegalArgumentException("El valor del grosor debe ser positivo")
            } else {
                // variable de backup que usa kotlin para guardar el valor de las propiedades de las clases
                field = value
            }
        }

    // Es una propiedad cuyo valor se calcula cada vez que la llamamos
    override fun getArea() = width * height

    override fun getPerimeter(): Double {
        return 2*width + 2*height
    }

    val isSquare: Boolean
        get() = height == width
}