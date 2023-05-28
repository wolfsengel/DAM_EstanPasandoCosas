package JavaVariado;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class ejemplo1 {
    public static void main(String[] args) {

        // Ordenar una lista de Strings de forma ascendente----------------------------------------------------------
        List<Integer> numeros = Arrays.asList(5, 2, 8, 1, 3);
        // Ordenar la lista utilizando una expresión lambda
        Collections.sort(numeros, (a, b) -> a.compareTo(b));
        System.out.println(numeros); // Resultado: [1, 2, 3, 5, 8]


        // Filtrar elementos de una lista--------------------------------------------------------------------------
        List<String> nombres = Arrays.asList("Juan", "María", "Pedro", "Ana", "Luisa");
        // Filtrar los nombres que tienen más de 4 caracteres utilizando una expresión
        // lambda
        List<String> nombresFiltrados = nombres.stream()
                .filter(nombre -> nombre.length() > 4)
                .collect(Collectors.toList());
        System.out.println(nombresFiltrados); // Resultado: [María, Pedro, Luisa]


        //Realizar operaciones con cada elemento de una lista---------------------------------------------------------
        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5);
        // Elevar cada número al cuadrado utilizando una expresión lambda
        List<Integer> numerosCuadrados = numeros2.stream()
                .map(numero -> numero * numero)
                .collect(Collectors.toList());
        System.out.println(numerosCuadrados); // Resultado: [1, 4, 9, 16, 25]

    }
}


// Crear una interfaz funcional-------------------------------------------------------------------------------------
@FunctionalInterface
interface Calculadora {
    int operacion(int a, int b);
}

class Main {
    public static void main(String[] args) {
        // Utilizar una expresión lambda para definir una función de suma
        Calculadora suma = (a, b) -> a + b;
        
        // Utilizar la función de suma definida anteriormente
        int resultado = suma.operacion(5, 3);
        System.out.println("El resultado de la suma es: " + resultado);  // Resultado: 8
    }
}
