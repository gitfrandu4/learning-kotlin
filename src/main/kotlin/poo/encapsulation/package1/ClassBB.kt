package poo.encapsulation.package1

class ClassBB(propertyXYZ: String): ClassB(propertyXYZ) {
    // Desde esta clase si podemos acceder a las propiedades/funciones protected de ClassB

    init {
        this.hello()
        // println(this.secret) // Cannot access 'secret': it is invisible (private in a supertype) in 'ClassBB'
    }
}