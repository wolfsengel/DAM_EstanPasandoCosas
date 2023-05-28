import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

public class ReceptorIOSOCKET {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
        List<String> palabras;
        try (ServerSocket ss = new ServerSocket(4444);
                Socket s = ss.accept();
                ObjectInputStream ois = new ObjectInputStream(s.getInputStream());) {
            palabras = (List<String>) ois.readObject();
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("milista.dat"))) {
            oos.writeObject(palabras);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("milista.dat"))) {
            palabras = (List<String>) ois.readObject();
            System.out.println(palabras);
        }
    }
}
