fun main() {
    // If-else
    val num = 10
    if (num > 0) {
        println("El número es positivo")
    } else if (num < 0) {
        println("El número es negativo")
    } else {
        println("El número es cero")
    }

    // When
    val day = 2
    val dayOfWeek = when (day) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miércoles"
        4 -> "Jueves"
        5 -> "Viernes"
        else -> "Fin de semana"
    }
    println("Hoy es $dayOfWeek")

    // For loop
    val numbers = listOf(1, 2, 3, 4, 5)
    for (number in numbers) {
        println(number)
    }

    // While loop
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }

    // Do-while loop
    var j = 0
    do {
        println(j)
        j++
    } while (j < 5)
}
