package Colecciones;

class NodolistaE {
    int valor;
    NodolistaE siguiente;

    public NodolistaE(int valor) {
        this.valor = valor;
        siguiente = null;
    }
}

class ListaEnlazada {
    NodolistaE cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }

    // Insertar un nodo al inicio de la lista
    public void insertarAlInicio(int valor) {
        NodolistaE nuevoNodo = new NodolistaE(valor);
        nuevoNodo.siguiente = cabeza;
        cabeza = nuevoNodo;
    }

    // Insertar un nodo al final de la lista
    public void insertarAlFinal(int valor) {
        NodolistaE nuevoNodo = new NodolistaE(valor);
        
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodolistaE nodoActual = cabeza;
            while (nodoActual.siguiente != null) {
                nodoActual = nodoActual.siguiente;
            }
            nodoActual.siguiente = nuevoNodo;
        }
    }

    // Imprimir los elementos de la lista
    public void imprimirLista() {
        NodolistaE nodoActual = cabeza;
        while (nodoActual != null) {
            System.out.print(nodoActual.valor + " ");
            nodoActual = nodoActual.siguiente;
        }
        System.out.println();
    }
}

public class ListaE {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        // Insertar nodos en la lista
        lista.insertarAlInicio(30);
        lista.insertarAlInicio(20);
        lista.insertarAlFinal(40);
        lista.insertarAlFinal(50);

        // Imprimir los elementos de la lista
        System.out.println("Elementos de la lista:");
        lista.imprimirLista();
    }
}
