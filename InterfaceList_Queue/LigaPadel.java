package InterfaceList_Queue;
import java.util.*;

public class LigaPadel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String categoria = sc.next();
        while (!categoria.equals("FIN")) {
            Map<String, Integer> puntos = new HashMap<>();
            Map<String, Integer> partidosJugados = new HashMap<>();
            int maxPuntos = 0;
            String ganador = "";
            boolean empate = false;
            String resultado = sc.next();
            while (!resultado.equals("FIN")) {
                String pareja1 = resultado;
                int sets1 = sc.nextInt();
                String pareja2 = sc.next();
                int sets2 = sc.nextInt();
                if (sets1 > sets2) {
                    puntos.put(pareja1, puntos.getOrDefault(pareja1, 0) + 2);
                    puntos.put(pareja2, puntos.getOrDefault(pareja2, 0) + 1);
                } else {
                    puntos.put(pareja2, puntos.getOrDefault(pareja2, 0) + 2);
                    puntos.put(pareja1, puntos.getOrDefault(pareja1, 0) + 1);
                }
                partidosJugados.put(pareja1, partidosJugados.getOrDefault(pareja1, 0) + 1);
                partidosJugados.put(pareja2, partidosJugados.getOrDefault(pareja2, 0) + 1);
                resultado = sc.next();
            }
            for (Map.Entry<String, Integer> entry : puntos.entrySet()) {
                String pareja = entry.getKey();
                int puntuacion = entry.getValue();
                if (puntuacion > maxPuntos) {
                    maxPuntos = puntuacion;
                    ganador = pareja;
                    empate = false;
                } else if (puntuacion == maxPuntos) {
                    empate = true;
                }
            }
            int numParejas = partidosJugados.size();
            int numPartidosJugados = 0;
            for (int partidos : partidosJugados.values()) {
                numPartidosJugados += partidos;
            }
            int numPartidosNoJugados = numParejas * (numParejas - 1) - numPartidosJugados / 2;
            System.out.print((empate ? "EMPATE" : ganador)+" ");
            System.out.print(numPartidosNoJugados);
            System.out.println(" ");
            categoria = sc.next();
        }
    }
}
