package Patrones_ISCO.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Mochila implements Iterable<String> {

  private List<String> zonas;

  public Mochila() {
    zonas = new ArrayList<>();
  }

  public void addZona(String zona) {
    zonas.add(zona);
  }

  @Override
  public Iterator<String> iterator() {
    return new Iterator<String>() {
      private int posicion = 0;

      @Override
      public boolean hasNext() {
        return posicion < zonas.size();
      }

      @Override
      public String next() {
        if (hasNext()) {
          return zonas.get(posicion++);
        }
        throw new IndexOutOfBoundsException();
      }
    };
  }
}

public class iterator {
  public static void main(String[] args) {
    Mochila m = new Mochila();
    m.addZona("navaja");
    m.addZona("bocadillo");
    m.addZona("agua");
    m.addZona("telefono");

    Iterator<String> it = m.iterator();

    while (it.hasNext()) {
      System.out.println(it.next());
    }

    // Iteración adicional
    it = m.iterator(); // Crear un nuevo iterador

    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
