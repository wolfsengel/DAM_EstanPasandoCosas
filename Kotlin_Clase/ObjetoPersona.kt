class Persona(val nombre: String, val edad: Int) {
    fun saludar() {
        println("Hola, mi nombre es $nombre y tengo $edad años.")
    }
    
    fun esMayorDeEdad(): Boolean {
        return edad >= 18
    }
}

fun main() {
    val persona1 = Persona("Juan", 25)
    val persona2 = Persona("María", 17)
    
    persona1.saludar() // Salida: Hola, mi nombre es Juan y tengo 25 años.
    persona2.saludar() // Salida: Hola, mi nombre es María y tengo 17 años.
    
    println(persona1.esMayorDeEdad()) // Salida: true
    println(persona2.esMayorDeEdad()) // Salida: false
}
