// variables mutables: var
var edad = 25
edad

// variables no mutables: val
// Cambia según la ejecución (por ejemplo el DNI en cada dispositivo es diferente)
val identificador = 123456

// Constante
//const val PI = 3.1416

// Tipos de variables
val miByte: Byte = 1 // Puede representar desde [-128 - 127]
miByte
Byte.MAX_VALUE // 127
Byte.MIN_VALUE // -128

val miShort: Short = 300 // 2 bytes
Short.MIN_VALUE // -32768
Short.MAX_VALUE // 32767

// por defecto cuando le damos un valor entero la variable es de tipo Int
val miInt = 72 // 4 bytes
Int.MAX_VALUE
Int.MIN_VALUE

val miLong = 1234
Long.MIN_VALUE
Long.MAX_VALUE

// si declaramos una variable muy grande, por defecto infiere que es un long
val x = 3000000000

// Desbordamiento
val a = 2_000_000_000
val b = 2_000_000_000
a + b // -294967296

a.toLong() + b // 4000000000
2_000_000_000L + 2_000_000_000 // 4000000000

// decimales
var miNumero = 2.0
var otroNumero: Double = 212.3421

val miFloat = 2.6f // los float ocupan menos que los double