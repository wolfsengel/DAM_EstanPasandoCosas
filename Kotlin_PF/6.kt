fun exagerar(s:String): String = "eres super" + s

fun describir(): (String)->String {  // para devolver una funcion
    return ::exagerar
}

fun main(){
    val tu= describir()
    
    println(tu(" guapo"))
}
