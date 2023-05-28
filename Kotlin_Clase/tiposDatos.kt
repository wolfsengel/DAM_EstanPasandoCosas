fun main() {
    // Tipos de datos
    val entero: Int = 10
    val decimal: Double = 3.14
    val texto: String = "Hola, mundo!"
    val esVerdadero: Boolean = true

    println("Entero: $entero")
    println("Decimal: $decimal")
    println("Texto: $texto")
    println("Es Verdadero: $esVerdadero")

    // Listas
    val listaNumeros: List<Int> = listOf(1, 2, 3, 4, 5)
    val listaNombres: List<String> = listOf("Juan", "María", "Pedro")

    println("Lista de números: $listaNumeros")
    println("Lista de nombres: $listaNombres")

    // Arrays
    val arrayNumeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val arrayNombres: Array<String> = arrayOf("Juan", "María", "Pedro")

    println("Array de números: ${arrayNumeros.contentToString()}")
    println("Array de nombres: ${arrayNombres.contentToString()}")
}
