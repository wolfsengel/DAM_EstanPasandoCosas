package InterfaceList_Queue;

/*
 * Entrada
 * La entrada comenzará con un número que indicará cuántos casos de prueba hay
 * que procesar. A continuación, para cada uno de ellos recibiremos la lista con
 * los nombres de los peregrinos (que acabará con el nombre ficticio F), un
 * entero que nos dirá el número de camas disponibles y un entero mayor que cero
 * que nos dirá el número de palabras de la canción.
 * 
 * Ten en cuenta que en una compañía de peregrinos nunca viajan más de 50
 * personas. Además, ninguno de los nombres de los peregrinos contiene espacios,
 * ni supera las 25 letras.
 * 
 * Salida
 * Para cada caso de prueba escribiremos en una única línea el nombre o nombres
 * de las personas que duermen en cama separados por espacios; el orden de los
 * nombres será el mismo en el que están colocados en la entrada.
 * 
 * Si ninguno queda fuera, en vez de escribir todos los nombres se escribirá
 * TODOS TIENEN CAMA. Si, al contrario, no hay camas en la posada para los
 * peregrinos, se mostrará el mensaje NADIE TIENE CAMA.
 */

 import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = sc.nextInt();
        for (int i = 0; i < numCasos; ++i) {
            resuelveCaso(sc);
        }
        sc.close();
    }

    public static void resuelveCaso(Scanner sc) {
        String cad;
        int camas, palabras;
        cad = sc.next();
        Queue<String> cola = new LinkedList<>();
        while (!cad.equals("F")) {
            cola.add(cad);
            cad = sc.next();
        }
        camas = sc.nextInt();
        palabras = sc.nextInt();
        if (camas >= cola.size()) {
            System.out.println("TODOS TIENEN CAMA");
        } else if (camas == 0) {
            System.out.println("NADIE TIENE CAMA");
        } else {
            cerrarCola(cola);
            eliminaElementos(cola, camas, palabras, cola.size());
            abrirCola(cola);
            muestraContenido(cola);
        }
    }

    public static void cerrarCola(Queue<String> cola) {
        String last = cola.poll();
        cola.add(last);
    }

    public static void abrirCola(Queue<String> cola) {
        cola.remove();
    }

    public static void eliminaElementos(Queue<String> cola, int camas, int palabras, int totalPersonas) {
        for (int i = 0; i < totalPersonas - camas; ++i) {
            for (int j = 0; j < palabras - 1; ++j) {
                cola.add(cola.poll());
            }
            cola.remove();
        }
    }

    public static void muestraContenido(Queue<String> cola) {
        Iterator<String> iterator = cola.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext()) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
