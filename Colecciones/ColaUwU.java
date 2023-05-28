package Colecciones;

class NodoCola {
    int valor;
    NodoCola siguiente;

    public NodoCola(int valor) {
        this.valor = valor;
        siguiente = null;
    }
}

class Cola {
    NodoCola frente;
    NodoCola fin;

    public Cola() {
        frente = null;
        fin = null;
    }

    // Insertar un elemento al final de la cola
    public void enqueue(int valor) {
        NodoCola nuevoNodo = new NodoCola(valor);
        
        if (frente == null) {
            frente = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo;
        }
    }

    // Eliminar y retornar el elemento al frente de la cola
    public int dequeue() {
        if (frente == null) {
            throw new IllegalStateException("La cola está vacía");
        }
        int valorFrente = frente.valor;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        return valorFrente;
    }

    // Verificar si la cola está vacía
    public boolean estaVacia() {
        return frente == null;
    }
}

public class ColaUwU {
    public static void main(String[] args) {
        Cola cola = new Cola();

        // Insertar elementos en la cola
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);

        // Eliminar elementos de la cola y mostrarlos
        while (!cola.estaVacia()) {
            int elemento = cola.dequeue();
            System.out.println("Elemento eliminado: " + elemento);
        }
    }
}
