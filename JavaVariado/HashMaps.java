package JavaVariado;

import java.util.HashMap;
import java.util.Map;


//Asociar nombres de productos con sus precios
class CatalogoProductos {
    public static void main(String[] args) {
        // Crear un mapa para almacenar el catálogo de productos
        Map<String, Double> productCatalog = new HashMap<>();
        
        // Agregar productos y sus precios al catálogo
        productCatalog.put("Camiseta", 19.99);
        productCatalog.put("Pantalón", 39.99);
        productCatalog.put("Zapatos", 59.99);
        
        // Obtener el precio de un producto específico
        double price = productCatalog.get("Pantalón");
        System.out.println("El precio del pantalón es: " + price);
        
        // Verificar si un producto existe en el catálogo
        boolean exists = productCatalog.containsKey("Camiseta");
        System.out.println("¿La camiseta está en el catálogo? " + exists);
        
        // Imprimir todo el catálogo de productos
        for (Map.Entry<String, Double> entry : productCatalog.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


//Contar frecuencia de palabras
class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet consectetur adipiscing elit";
        
        // Crear un mapa para almacenar la frecuencia de palabras
        Map<String, Integer> wordFrequency = new HashMap<>();
        
        // Dividir el texto en palabras
        String[] words = text.split(" ");
        
        // Contar la frecuencia de cada palabra
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        
        // Imprimir la frecuencia de palabras
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

