package poo.inheritance

class Maths(teacher: Person, classRoom: String): Subject(teacher, classRoom) {
    override fun showSchedule() {
        println("El horario es de 16:00 a 20:00")
    }

}