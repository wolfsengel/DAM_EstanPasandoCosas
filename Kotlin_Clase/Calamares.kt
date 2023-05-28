class Punto(var x: Int, var y: Int) {

    override fun toString(): String {
        return "($x,$y)"
    }
}

class Rectangulo(v1: Punto, v2: Punto) {
    private val vertice1 = Punto(v1.x, v1.y)
    private val vertice2 = Punto(v2.x, v2.y)
    var v1:Punto=v1
    var v2:Punto=v2


    override fun toString(): String {
        return "$vertice1,$vertice2"
    }
}


fun main() {

    val p=Producto("Calamares PescaNueva",33)
    println(p.descrip)
    println(p.cantidad)
    println(p)
}


class Producto(descripcion: String, cantidad: Int) {

    private var _descrip: String = descripcion
    val descrip: String
        get() = _descrip.uppercase()
    var cantidad: Int = if (cantidad >= 0) cantidad else 0
        set(value) {
            field = if (value >= 0) value else 0
        }

    override fun toString(): String {
        return "$_descrip $cantidad"
    }
}

class Persona(nombre:String, edad:Int){
    val nombre:String=nombre
    val edad:Int=edad

    constructor(p:Persona): this(p.nombre,p.edad)

    override fun toString():String {
        return "nombre:$nombre edad:$edad"
    }
}
class Coordenadas(){
    var x:Int= 0
    var y:Int= 0

    fun sumarCoordenadas(): Int {
        return x+y
    }
    fun dividirCoordenadas(): Any {
        if (y<=0){ return 0} else {return x.toFloat()/y.toFloat()}
    }
}