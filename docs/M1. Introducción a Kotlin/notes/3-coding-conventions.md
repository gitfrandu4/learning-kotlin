# Convención de nombres

## Paquetes

* Minúsculas y sin guiones bajos
* Como estos nombres deben ser únicos, se recomienda empezar con tu dominio de internet, en orden reverso: `com.frandu4`
* Seguido iría el nombre que identifica la finalidad del paquete
  * ``com.mparrastia.conexion``
* Se recomienda no usar más de una palabra, y si no queda más remedio se recomienda utilizar camel case: `com.mparrastia.miProyecto`

## Clases y objetos

* Para los nombres utilizamos: UpperCamelCase
  * `open class ProcesadorDeDeclaraciones { ... } `
  * `object ProcesadorDeDeclaracionesVacio: ProcesadorDeDeclaraciones() { ... }`

## Funciones y variables locales

* lowerCamelCase
* Sin guiones bajos
  * `fun procesarDeclaraciones(){ ... } `

## Propiedades

* Constantes: `const val NUMERO_MAXIMO = 8`
* `val coleccionMutable: MutableSet<String> = HashSet()`
    * Un objeto de tipo singleton es un objeto que es único para todo el proyecto, y podemos utilizar la misma convención que para los objetos. 
* En caso de implementar un singleton podemos usar UpperCase: 
    * `val ComparadorDePersonas: Comparator<Person> = /* ... */`

## Buenos nombres

* Nombres de las clases: nombres que explican lo que la clase es: Lista, LectorDePdf
* Nombres de funciones: verbos/frases que explican lo que la función hace
* Si utilizamos acrónimos: IOStream
* LectorDePdf (más de tres letras)