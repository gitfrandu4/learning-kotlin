# Introducción POO

### Clase con propiedades con valor por defecto

```kotlin
class Animal {
    var nombre = "Toby"
    var numeroDePatas = "4"
    var color = "negro"
}
```

### Instanciación y acceso a propiedades

```kotlin
fun main() {
    
    var miAnimal = Animal() // Instancia
    
    println(miAnimal.nombre) // Muestra: Toby
    println(miAnimal.numeroDePatas) // Muestra: 4
    println(miAnimal.color) // Muestra: negro
}
```

### Constructor primario

```kotlin
class Animal(val nombre: String, val numeroDePatas: Int, val color: String)
```
```kotlin
fun main() {
    var miAnimal = Animal("Rocky", 4, "marrón") // Instancia
        
    println(miAnimal.nombre) // Muestra: Rocky
    println(miAnimal.numeroDePatas) // Muestra: 4
    println(miAnimal.color) // Muestra: marrón
}
```

### Funciones miembro

```kotlin
class Animal(val nombre: String, val numeroDePatas: Int, val color: String) {
    fun come() {
        // Implementación de función
    }
}
```

```kotlin
fun main() {
    var miAnimal = Animal("Rocky", 4, "marrón") // Instancia
    miAnimal.come() // Llamada a la función miembro
}
```

### Clases de datos

```kotlin
data class Animal(val nombre: String, val numeroDePatas: Int, val color: String)
```

### Enums

```kotlin
enum class Direccion {
    NORTE, SUR, ESTE, OESTE
}
```
