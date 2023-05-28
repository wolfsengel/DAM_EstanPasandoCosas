tailrec fun multiplicar(a:Int,b:Int,acc:Int=0):Int{
    return if(b==0) acc else multiplicar(a, b-1, acc+a)
}
