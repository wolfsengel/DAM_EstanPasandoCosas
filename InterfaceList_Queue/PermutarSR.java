package InterfaceList_Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutarSR {
    public static void main(String[] args) {
        List<String> numeros = Arrays.asList("0", "1", "2");
        System.out.println(permutarSinRepeticion(3, numeros));
        System.out.println(permutarSinRepeticion(2, numeros));
        System.out.println(permutarSinRepeticion(4, numeros));
        System.out.println(permutarSinRepeticion(1, numeros));
        System.out.println(permutarSinRepeticion(0, numeros));
    }
    static List<String> permutarSinRepeticion(int longitud, List<String> numeros) {
        List<String> result = new ArrayList<>();
        if (longitud == 0) {
            result.add("");
            return result;
        }
        for (int i = 0; i < numeros.size(); i++) {
            List<String> sublista = permutarSinRepeticion(longitud - 1, numeros);
            for (String numeroCombinado : sublista) {
                if (!numeroCombinado.contains(numeros.get(i))) {
                    result.add(numeros.get(i) + numeroCombinado);
                }
            }
        }
        return result;
    }
    
}
