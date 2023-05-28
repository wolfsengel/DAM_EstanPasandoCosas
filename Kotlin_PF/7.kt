//clase articulos con id, nombre, precio, cantidad
class Articulo(var id: Int, var nombre: String, var precio: Double, var cantidad: Int) {

    //toString para mostrar los datos del articulo
    override fun toString(): String {
        return "ID: $id, Nombre: $nombre, Precio: $precio, Cantidad: $cantidad"
    }

}

fun main() {
    //crear e incializar lista inmutable de articulos
    val lista = listOf(
        Articulo(1, "Coca Cola", 1.5, 10),
        Articulo(2, "Fanta", 1.0, 11),
        Articulo(3, "Sprite", 3.0, 15),
        Articulo(4, "Agua", 2.5, 10),
        Articulo(5, "Cerveza", 1.5, 10),
        Articulo(6, "Vino", 1.0, 11),
        Articulo(7, "Whisky", 1.0, 5),
        Articulo(8, "Ron", 3.0, 15),
        Articulo(9, "Ginebra", 1.5, 13),
        Articulo(10, "Vodka", 1.5, 14)
    )
    
    // ordenar por tres campos: precio, cantidad y nombre
    val listaOrdenada = lista.sortedWith(compareBy(Articulo::precio, Articulo::cantidad, Articulo::nombre))

    //mostrar lista ordenada con foreach
    listaOrdenada.forEach { println(it) }
}

