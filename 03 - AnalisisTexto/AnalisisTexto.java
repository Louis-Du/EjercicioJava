
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnalisisTexto {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in); // Objeto Scanner para leer entrada del usuario

        System.out.print("¡Análisis de Texto! \nIngresa un texto para analizar: ");
        
        String texto = entrada.nextLine(); // Leer la línea completa de texto

        String[] palabras = texto.trim().split("\\s+"); // trim() elimina espacios al inicio y final, split() divide el texto en palabras usando espacios como delimitadores y \\s+ maneja múltiples espacios
        int totalPalabras = palabras.length;  // length cuenta el número de palabras en el array

        int totalCaracteres = texto.length(); // length cuenta el número de caracteres en el texto, incluyendo espacios
        int totalCaracteresSinEspacios = texto.replace(" ", "").length(); // Reemplaza espacios con cadena vacía y luego cuenta los caracteres

        String palabraMasLarga = ""; // Variable para almacenar la palabra más larga
        for (String i : palabras) 
        {
            if (i.length() > palabraMasLarga.length()) // Compara la longitud de cada palabra con la palabra más larga encontrada hasta ahora
            {
                palabraMasLarga = i;
            }
        }

        // Contar frecuencia de palabras
        Map<String, Integer> frecuencia = new HashMap<>(); // map() sirve para almacenar la frecuencia de cada palabra, HashMap() almacena pares clave-valor  
        for (String i : palabras) 
        {
            frecuencia.merge(i, 1, Integer::sum); // merge() añade la palabra al mapa con valor 1 si no existe, o incrementa su valor en 1 si ya existe
        }
        System.out.println("Análisis Completo: \nTotal de palabras: " + totalPalabras + "\nTotal de caracteres (con espacios): " + totalCaracteres + "\nTotal de caracteres (sin espacios): " + totalCaracteresSinEspacios + "\nPalabra más larga: " + palabraMasLarga + "\nFrecuencia de palabras: " + frecuencia);
        entrada.close();
    } 
}
