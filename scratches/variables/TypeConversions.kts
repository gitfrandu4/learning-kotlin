// conversiones

val miShort: Short = 5
val miInt: Int = miShort.toInt()
miInt // 5

val miLong = 3_000_000_000
val miOtroInt: Int = miLong.toInt()
miOtroInt // -1294967296

val miDoble = 5.2
val miOtroShort: Short = miDoble.toInt().toShort()
miOtroShort // 5

val edad = "28"
edad.toInt() // 28

val verdadero = "true"
verdadero.toBoolean() // true