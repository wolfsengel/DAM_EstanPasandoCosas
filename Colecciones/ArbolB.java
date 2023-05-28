package Colecciones;

class Nodo {
    int valor;
    Nodo izquierdo;
    Nodo derecho;
  
    public Nodo(int valor) {
        this.valor = valor;
        izquierdo = null;
        derecho = null;
    }
}

class ArbolBinario {
    Nodo raiz;
  
    public ArbolBinario() {
        raiz = null;
    }
  
    // Insertar un nodo en el árbol
    public void insertar(int valor) {
        raiz = insertarNodo(raiz, valor);
    }
  
    private Nodo insertarNodo(Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
            return nodo;
        }
  
        if (valor < nodo.valor) {
            nodo.izquierdo = insertarNodo(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarNodo(nodo.derecho, valor);
        }
  
        return nodo;
    }
  
    // Realizar un recorrido en orden (izquierdo, raíz, derecho)
    public void recorridoEnOrden() {
        recorridoEnOrden(raiz);
    }
  
    private void recorridoEnOrden(Nodo nodo) {
        if (nodo != null) {
            recorridoEnOrden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            recorridoEnOrden(nodo.derecho);
        }
    }
}

public class ArbolB {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        
        // Insertar nodos en el árbol
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(80);
  
        // Realizar un recorrido en orden e imprimir los valores
        System.out.println("Recorrido en Orden:");
        arbol.recorridoEnOrden();
    }
}
