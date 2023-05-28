class Persona(val nombre:String){
    infix fun saludarA(persona2:Persona){
        print("Hola "+persona2.nombre+", soy "+this.nombre+".")
    }
}
