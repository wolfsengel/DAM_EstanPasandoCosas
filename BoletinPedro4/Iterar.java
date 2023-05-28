package BoletinPedro4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", teléfono=" + telefono;
    }
}

class Agenda implements Iterable<Contacto> {
    private String propietario;
    private List<Contacto> contactos;

    public Agenda(String propietario) {
        this.propietario = propietario;
        this.contactos = new ArrayList<>();
    }

    public void add(String nombre, String telefono) {
        Contacto contacto = new Contacto(nombre, telefono);
        contactos.add(contacto);
    }

    public String getPropietario() {
        return propietario;
    }

    @Override
    public Iterator<Contacto> iterator() {
        return contactos.iterator();
    }
}

public class Iterar {
    public static void main(String[] args) {
        Agenda agenda = new Agenda("Pedro");
        agenda.add("Juan", "123456789");
        agenda.add("Pepe", "987654321");
        agenda.add("Luis", "456789123");

        System.out.println("Contactos de " + agenda.getPropietario() + ":");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }
}