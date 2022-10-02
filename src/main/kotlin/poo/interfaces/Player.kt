package poo.interfaces

interface Player {

    // Las clases que implementen esta interfaz pueden optar por sobreescribirla o dejar esta implementación por defecto
    fun playerOn(song: String) {
        println("Reproduciendo $song")
    }
    fun playerOff()

    fun playerStop()
}