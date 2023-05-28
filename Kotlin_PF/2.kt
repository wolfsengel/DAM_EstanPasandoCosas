fun sumar(vararg numeros:Int):Int{
    var resultado=0
    for(numero in numeros){
        resultado+=numero
    }
    return resultado
}
