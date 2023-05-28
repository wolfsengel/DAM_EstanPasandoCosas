fun esPrimo(numero:Int):Boolean{
	if (numero<=1){
		return false
	}
	for(i in 2..numero/2){
		if(numero % i ==0){
			return false
		}
	}
	return true
}
fun numerosPrimos(lista:List<Int>):List<Int>{
	val primos= mutableListOf<Int>()
	for(numero in lista){
		if(esPrimo(numero)==true){
			primos.add(numero)
		}
	}
	return primos
}
