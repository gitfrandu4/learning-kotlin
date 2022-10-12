# Funciones de ámbito

Kotlin nos ofrece en su librería estándar una serie de funciones que pueden mejorar
la legibilidad de nuestro código que lo hace más conciso y mejora nuestra eficiencia,
y les llama **funciones de ámbito**. 

Todas estas funciones tienen como parámetro una función lambda que crea un ámbito en el
contexto de un objeto en el que podemos escribir nuestro código como si estuvieramos en el 
ámbito de una función del mismo objeto.

Existen cinco funciones de ámbito en la librería estándar de Kotlin

* `let`
* `run`
* `with`
* `apply`
* `also`

Algunas son muy similares entre sí y en ocasiones puede resultar difícil decantarse
por una de ellas. 

### Objeto del Contexto 
Una de las características que las diferencia unas de otras es la referencia que usamos para
referirnos al objeto del contexto que crea la expresión lambda. 

Tenemos dos opciones:

* Funciones que se refieren al objeto con `this`
  * Las funciones de ámbito que utilizan este tipo de referencia son:
    * `run`
    * `with`
    * `apply`
  * Una de sus ventajas es que esta referencia se puede omitir. Dando lugar a un código más 
  conciso (ojo: también puede dar lugar a código menos legible). 
  * Se recomienda usar estas funciones cuando en el cuerpo de la lambda solo haya llamadas 
  a las funciones del objeto o cambios en el valor de sus propiedades. 

* Funciones que se refieren al objeto con `it`
  * Las funciones de ámbito que utilizan este tipo de referencia son:
    * `let`
    * `also`
  * Una de sus ventajas es que esta referencia `it` puede sustituirse por otro identificador, mejorando
  así su legibilidad. 
  * Se recomienda usar estas funciones cuando el objeto es usado como argumento para llamar a otras funciones,
  y también cuando hay múltiples variables en el cuerpo de la lambda. 

<img src="../../images/objeto-contexto.png" width="600px"/>

### Valor devuelto 

Otra cosa que diferencia unas funciones de ámbito de otras es el valor devuelto por las mismas. 

Hay un grupo de funciones que devuelven el resultado de la lambda (`let`, `with` y `run` ), que podemos usar cuando
queremos obtener un objeto de una clase diferente que resulte de las operaciones con el objeto del contexto. Y hay otras 
que devuelven el objeto (`apply` y `also`) en sí, y son también muy útiles para encadenar diferentes llamadas a funciones 
del objeto y para añadir efectos colaterales.

<img src="../../images/valor-devuelto.png" width="600px"/>

2:07:00

## Let

```kotlin
val str: String? = "Hello"

val length = str?.let {
    println(it) // Solo se ejecuta si str no es null
}
```

## With

Es una función de ámbito que tiene dos parámetros: 

* Un objeto, que será el receptor 
* Una expresión lambda 

```kotlin
val numbers = mutableListOf("uno", "dos", "tres")

with(numbers) {
    println("'with' es llamado con el argumento $this")
    println("Contiene $size elementos")
}
```

```kotlin
usuario.moverA("Admin")
usuario.changePassword("admin")

// En su lugar:

with(user) {
    moverA("Admin")
    changePassword("admin")
}

// De esta forma queda más limpio
// La función with nos permite tener un código más ordenado y no tener que estar 
// repitiendo el nombre del objeto.
```

## Run

```kotlin
val servicio = MultiportService("https://example.kotlinlang.org", 80)
val resultado = servicio.run {
    port = 8080
    query(prepareRequest() + " to port $port")
}
```

## Apply

```kotlin
val adam = Persona("Adam").apply {
    edad = 32
    ciudad = "Madrid"
}

println(adam)
```

## Also

```kotlin
val numeros = mutableListOf("uno", "dos", "tres")

numeros
    .also { println("La lista de elementos hasta ahora: $it") }
    .add("cuatro")
```

## Take-if y take-unless

```kotlin
val numero = Random.nextInt(100)
val parONull = numero.takeIf { it % 2 == 0 }
val imparONull = numero.takeUnless { it % 2 == 0 }
```