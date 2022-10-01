package poo

class Game (var score: Int){

    // marcamos la clase como inner para poder acceder a las propiedades de la clase externa
    inner class ScoreBoard() {
        fun increase(points: Int) {
            score += points
        }
        fun decrease(points: Int) {
            score -= points
        }
    }
}