package poo.vehicles

import poo.interfaces.Engine
import poo.interfaces.Player

class Car(private var speed: Int = 0): Engine, Player {

    override fun startEngine() {
        this.speed = 1
    }

    override fun speedUp(units: Int) {
        this.speed += units
    }

    override fun slowDown(units: Int) {
        if(this.speed - units < 0) stopEngine()
        else this.speed -= units
    }

    override fun stopEngine() {
        this.speed = 0
    }

    fun showSpeed(){
        println("Velocidad del coche: $speed")
    }

    override fun playerOff() {
        println("Reproductor apagado")
    }

    override fun playerStop() {
        println("Reproductor pausado")
    }
}