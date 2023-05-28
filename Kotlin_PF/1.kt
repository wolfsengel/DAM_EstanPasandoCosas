fun <T> concatenar (lista: List<T>): String{
    var resultado = ""
    for(elemento in lista){
        resultado = resultado + elemento.toString()
    }
    return resultado
}
