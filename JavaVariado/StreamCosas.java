package JavaVariado;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCosas {
    public static void main(String[] args) {
        /*
         * 1.
         * Creación de un Stream: Puedes crear un Stream a partir de una colección,
         * matriz o
         * una fuente de datos utilizando métodos de la clase Stream
         */
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = numeros.stream();

        /*
         * 2.
         * Operaciones intermedias: Los Stream admiten operaciones intermedias que
         * transforman o filtran los elementos del Stream
         * y devuelven un nuevo Stream. Algunas operaciones intermedias comunes son
         * filter, map y distinct
         */
        Stream<Integer> stream2 = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2);
        System.out.println(stream2);

        /*
         * 3.
         * Operaciones terminales: Las operaciones terminales en un Stream generan un
         * resultado o un valor final. Pueden ser operaciones de reducción, agregación,
         * búsqueda o iteración. Algunas operaciones terminales comunes son forEach,
         * collect, reduce y count
         */
        stream.forEach(System.out::println);

        int sum = numeros.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        long count = numeros.stream()
                .filter(n -> n > 3)
                .count();
        System.out.println(count);

        /*
         * 4.
         * Paralelismo: Una de las ventajas clave de Stream es la capacidad de realizar
         * operaciones en paralelo de forma transparente, lo que puede mejorar el
         * rendimiento en sistemas multiprocesador. Puedes convertir un Stream
         * secuencial en un Stream paralelo utilizando el método parallel()
         */
        Stream<Integer> parallelStream = numeros.parallelStream();
        System.out.println(parallelStream.isParallel());

        /*
         * 5.
         * Encadenamiento de operaciones: Puedes encadenar múltiples operaciones en un
         * solo flujo, lo que permite una sintaxis más concisa y legible.
         */
        int num = numeros.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * 2)
                .sum();
        System.out.println(num);

    }
}
