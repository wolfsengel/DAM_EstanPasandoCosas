import java.util.Arrays;
import java.util.stream.Stream;

class Persona {
    String nombre;
    Integer edad;

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }
}

public class streamME {
    public static void main(String[] args) {
        Persona[] amigos = { new Persona("chuly", 23), new Persona("zoko", 77), new Persona("popu", 44),
                new Persona("xaca", 15), };
        Stream<Persona> amigosStream = Arrays.stream(amigos);
        int mayorEdad = amigosStream
                .mapToInt(persona -> persona.getEdad())
                .max()
                .getAsInt();
        System.out.println(mayorEdad);
    }
}