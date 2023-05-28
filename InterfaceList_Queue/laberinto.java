package InterfaceList_Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class laberinto {
static int num=1;
    public static void main(String[] args) {
        int aux=0;
        while(true){
           //recibe un array char por teclado
        Scanner sc = new Scanner(System.in);
        int filas = sc.nextInt();
        int columnas = sc.nextInt();
        char[][] laberinto = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            String linea = sc.next();
            for (int j = 0; j < columnas; j++) {
                laberinto[i][j] = linea.charAt(j);
            }
        }
        try{imprimirCaminos(laberinto);}finally{}
        
        if(filas==columnas){
            break;
        }else{
            if(aux==3){
                break;
            }
            aux++;
        }
    }
        
    }

    public static void imprimirCaminos(char[][] laberinto) {
        int filas = laberinto.length;
        int columnas = laberinto[0].length;
        boolean[][] visitado = new boolean[filas][columnas];
        List<String> camino = new ArrayList<>();
        System.out.println("laberinto "+num+":");
        buscarQueso(laberinto, visitado, 0, 0, camino);
        num++;
    }

    public static void buscarQueso(char[][] laberinto, boolean[][] visitado, int fila, int columna, List<String> camino) {
        int filas = laberinto.length;
        int columnas = laberinto[0].length;
        if (fila < 0 || fila >= filas || columna < 0 || columna >= columnas || visitado[fila][columna] || laberinto[fila][columna] == '#') {
            return;
        }
        visitado[fila][columna] = true;
        camino.add("(" + fila + "," + columna + ")");
        if (laberinto[fila][columna] == 'Q') {
            System.out.println(String.join("", camino));
            visitado[fila][columna] = false;
            camino.remove(camino.size() - 1);
            return;
        }
        buscarQueso(laberinto, visitado, fila, columna + 1, camino);
        buscarQueso(laberinto, visitado, fila + 1, columna, camino);
        buscarQueso(laberinto, visitado, fila - 1,columna , camino);
        buscarQueso(laberinto, visitado,fila , columna - 1,camino);        
        visitado[fila][columna] = false;
        camino.remove(camino.size() - 1);
    }
}

