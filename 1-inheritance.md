# Herencia en Kotlin

### Clase derivada sin constructor

```kotlin
open class Vehiculo // La clase Vehículo permite ser extendida

class Coche : Vehiculo() // Coche extiende Vehiculo
```

### Clase derivada con constructor primario

```kotlin
// Clase abierta con constructor primario
open class Vehiculo(numeroDeRuedas: Int) 
```

* Si la clase derivada tiene constructor primario debemos llamar al constructor de la clase base en la declaración: 

```kotlin
class Coche(numeroDeRuedas: Int) : Vehiculo(numeroDeRuedas)
```

### Sobreescritura

```kotlin
open class Forma {
    // La función dibujar está abierta
    open fun dibujar() { /*...*/ } 
    
    fun fill() { /*...*/ }
}

class Circulo() : Forma() {
    // En Circulo la sobreescribimos
    override fun dibujar() { /*...*/ } 
}
```

### Clases abstractas

```kotlin
// Una clase abstracta no se puede instanciar
abstract class Poligono { 
    
    // Una función abstracta se debe sobreescribir
    abstract fun dibujar() 
}
```
```kotlin
class Rectangle : Poligono() {
    override fun dibujar() { /*...*/ }
}
```

### Interfaces

```kotlin
interface ManagerDeUsuario {
    fun cambiarContrasena()
    
    // Las funciones se pueden implementar por defecto
    fun obtenerNombreDeUsuario() { /*...*/ }
}
```

## Modificadores de visibilidad para miembros de una clase

* `private`: significa que es visible dentro de esta clase
* `protected`: significa que es visible dentro de la clase y de las subclases. 
* `internal`: significa que cualquiera dentro del módulo de su misma clase puede verlo.
* `public`: significa visible por cualquiera.