# La encapsulación

**¿Qué es la encapsulación?**

* Agrupar datos con métodos que operan sobre ellos
  * En Kotlin esto lo conseguimos con las clases. Las clases siempre son 
  datos y funciones para operar con esos datos

* Blindar datos y códigos del exterior

**¿Por qué usamos encapsulación?**

Po un lado nos interna esconder los detalles de la representación interna de
nuestros objetos

La idea es que hacia afuera la clase sea lo más abstracta/enigmática posible

Por ejemplo podemos tener almacenada una lista de amigos, pero cuando otras clases
llaman a nuestros métodos no saben si la lista está implementada con un array o con
una estructura de árbol.

Hay más razones, como que solo nosotros conocemos las restricciones que hacen que 
nuestra clase funcione correctamente. 

````kotlin
class Rectange(var width: Double, var height: Double)
````

```kotlin

import java.awt.Rectangle

fun main() {
  val myRectangle = Rectangle(2.5, 2.6)
  myRectangle.height = -2.4 // mal
}
```

### Blindaje

<img src="../../images/blindaje.png" title="blindaje" width="400px"/>

### Caja negra

<img src="../../images/caja-negra.png" title="caja negra" width="400px"/>


