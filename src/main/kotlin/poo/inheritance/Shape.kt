package poo.inheritance

abstract class Shape(var x: Int, var y: Int) {

    abstract fun getArea(): Double
    abstract fun getPerimeter(): Double

    fun trasladar(moveX: Int, moveY: Int) {
        x = x + moveX
        y = y + moveY
    }
}