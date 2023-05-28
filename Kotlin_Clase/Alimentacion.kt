class Alimento(s: String, i: Int) {
    var Nombre:String = s
    var Numero:Int = i
    operator fun plus(other: Alimento):String{
        if (Nombre == other.Nombre){
            val uwu=Numero+other.Numero
            return "Nombre,$uwu"
        } else{
            return "None"
        }
    }
}

fun main() {
    val a1=Alimento("Manzana",4)
    val a2=Alimento("Uva",3)
    val a3=Alimento("Manzana",2)
    print(a1+a2)
    print(a1+a3)
}