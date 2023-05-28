class Articulo(var codigo: String, var pvp: Double)

fun main(args: Array<String>) {
    val articulos = arrayOf(
        Articulo("A1", 10.0),
        Articulo("A2", 30.5),
        Articulo("B1", 30.0),
        Articulo("B2", 100.0),
        Articulo("C1", 66.5)
    )
    
    val listaArticulos = articulos.asList()

    // calcular total basándose en sequence
    val total = listaArticulos.asSequence()
        .filter { it.codigo.startsWith("B", ignoreCase = true) }
        .sumByDouble { it.pvp }

    println(total)
}
