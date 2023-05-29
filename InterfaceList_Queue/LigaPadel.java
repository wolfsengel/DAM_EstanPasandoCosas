package InterfaceList_Queue;

import java.util.*;

public class LigaPadel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String categoria = sc.next(); // Read the first category
        while (!categoria.equals("FIN")) { // Keep reading categories until "FIN" is read
            Map<String, Integer> puntos = new HashMap<>(); // Map to store the points for each pair
            Map<String, Integer> partidosJugados = new HashMap<>(); // Map to store the number of matches played by each
                                                                    // pair
            int maxPuntos = 0; // Variable to store the maximum points
            String ganador = ""; // Variable to store the winner
            boolean empate = false; // Flag to indicate if there is a tie
            String resultado = sc.next(); // Read the first result for the current category
            while (!resultado.equals("FIN")) { // Keep reading results until "FIN" is read
                String pareja1 = resultado; // Read the first pair
                int sets1 = sc.nextInt(); // Read the sets won by the first pair
                String pareja2 = sc.next(); // Read the second pair
                int sets2 = sc.nextInt(); // Read the sets won by the second pair

                if (sets1 > sets2) { // If the first pair won
                    puntos.put(pareja1, puntos.getOrDefault(pareja1, 0) + 2); // Add 2 points to the first pair
                    puntos.put(pareja2, puntos.getOrDefault(pareja2, 0) + 1); // Add 1 point to the second pair
                } else { // If the second pair won
                    puntos.put(pareja2, puntos.getOrDefault(pareja2, 0) + 2); // Add 2 points to the second pair
                    puntos.put(pareja1, puntos.getOrDefault(pareja1, 0) + 1); // Add 1 point to the first pair
                }
                
                partidosJugados.put(pareja1, partidosJugados.getOrDefault(pareja1, 0) + 1); // Increment the number of
                                                                                            // matches played by the
                                                                                            // first pair
                partidosJugados.put(pareja2, partidosJugados.getOrDefault(pareja2, 0) + 1); // Increment the number of
                                                                                            // matches played by the
                                                                                            // second pair
                resultado = sc.next(); // Read the next result for the current category
            }
            for (Map.Entry<String, Integer> entry : puntos.entrySet()) { // Iterate over the points map to find the
                                                                         // winner
                String pareja = entry.getKey();
                int puntuacion = entry.getValue();
                if (puntuacion > maxPuntos) { // If this pair has more points than maxPuntos
                    maxPuntos = puntuacion; // Update maxPuntos with this pair's points
                    ganador = pareja; // Set this pair as the winner
                    empate = false; // Reset empate flag to false because we found a new winner with more points
                                    // than previous winners
                } else if (puntuacion == maxPuntos) { // If this pair has same points as maxPuntos
                    empate = true; // Set empate flag to true because there is a tie between this pair and previous
                                   // winners with same points as maxPuntos
                }
            }
            int numParejas = partidosJugados.size(); // Calculate number of pairs in this category using partidosJugados
                                                     // map size
            int numPartidosJugados = 0;
            for (int partidos : partidosJugados.values()) {
                numPartidosJugados += partidos;
            }
            int numPartidosNoJugados = numParejas * (numParejas - 1) - numPartidosJugados / 2;
            System.out.print((empate ? "EMPATE" : ganador) + " ");
            System.out.print(numPartidosNoJugados);
            System.out.println(" ");
            categoria = sc.next();
        }
    }
}
