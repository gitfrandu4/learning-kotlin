package poo

class Laptop (val ramGB: Double, val procesador: Processor) {
    class Processor(val cores: Int, val frequencyGHz: Double) {
        fun mostrarEspecificaciones() {
            println("Numero de núcleos: $cores, Frecuencia: $frequencyGHz")
        }
    }
}