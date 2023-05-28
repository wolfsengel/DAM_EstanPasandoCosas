package Colecciones;

class Nodo {
    int valor;
    Nodo siguiente;

    public Nodo(int valor) {
        this.valor = valor;
        siguiente = null;
    }
}

class Pila {
    Nodo cima;

    public Pila() {
        cima = null;
    }

    // Insertar un elemento en la cima de la pila
    public void push(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }

    // Eliminar y retornar el elemento en la cima de la pila
    public int pop() {
        if (cima == null) {
            throw new IllegalStateException("La pila está vacía");
        }
        int valorCima = cima.valor;
        cima = cima.siguiente;
        return valorCima;
    }

    // Verificar si la pila está vacía
    public boolean estaVacia() {
        return cima == null;
    }
}

public class Pilaa {
    public static void main(String[] args) {
        Pila pila = new Pila();

        // Insertar elementos en la pila
        pila.push(10);
        pila.push(20);
        pila.push(30);

        // Eliminar elementos de la pila y mostrarlos
        while (!pila.estaVacia()) {
            int elemento = pila.pop();
            System.out.println("Elemento eliminado: " + elemento);
        }
    }
}
