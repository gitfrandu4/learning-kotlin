val a = 8
val b = 10
val ab = a + b // val ab: Int
ab // 18

val c: Long = 10
val ac = a + c // val ac: Long

val byte1: Byte = 2
val byte2: Byte = 3
val resultado = byte1 + byte2 // val resultado: Int (siempre pasa a Int)

val double: Double = 2.5
val g = double + a // val g: Double

"Hola" + " me " + "llamo"

val a_ = 1
val b_: Long = 2
val div = a_ / b_
div // 0 => solo la parte entera

val div_ = a_ / b_.toDouble()
div_ /// => 0.5

val mod = 5 % 2 // val mod: Int
mod // 2

// =========== Operadores Relacionales ===========

8 > 7// true
8 < 7// false
7 < 7// false

7 < 7.7// true
7 <= 7// true

8 == 8// true

// 8.5 == 7 // Operator '==' cannot be applied to 'Double' and 'Int'
8.5 == 7.toDouble() // false

8 != 7 // true
8 != 8 // false

(8 == 8).not() // equivalente a 8 != 8

// =========== Operadores Lógicos ===========

true && true // true
true && false // false
false && true // false
false && false // false

true || true // true
true || false // true
false || true // true
false || false // false

!true
!false

true.not()
false.not()