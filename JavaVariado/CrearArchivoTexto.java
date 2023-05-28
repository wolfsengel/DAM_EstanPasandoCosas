package JavaVariado;
import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivoTexto {
    public static void main(String[] args) {
        String contenido = "Este es el texto que quiero guardar en el archivo.";

        try {
            FileWriter archivo = new FileWriter("archivo.txt");
            archivo.write(contenido);
            archivo.close();
            System.out.println("El archivo se ha creado correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo.");
            e.printStackTrace();
        }
    }
}
