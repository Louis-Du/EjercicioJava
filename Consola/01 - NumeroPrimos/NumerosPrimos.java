
import java.util.Scanner;

public class NumerosPrimos {

    // Función para verificar si un número es primo
    static boolean esPrimo(int n) 
    {
        if (n < 2) return false; // Se descartan los números menores que 2
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0) 
            {
                return false; // Si el resto de la divisiónes 0, no es primo
            }
        }  
        return true; // Si no se encontró ningún divisor, es primo
    }

    public static void main(String[] args) {  
        System.out.print("Ingresa la cantidad de números primos a generar: "); 
        Scanner sc = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario
        int cantidad = sc.nextInt(); // Lee y asigna la entrada del usuario a la variable cantidad

        int[] primos = new int[cantidad]; // Arreglo para almacenar los números primos
        int numero = 2, contador = 0; 

        while (contador < cantidad) // Crea un bucle hasta encontrar la cantidad solicitada de números primos
            if (esPrimo(numero)) primos[contador++] = numero++; // Si el número es primo, se almacena y se incrementa el contador
            else numero++; // Si no es primo, solo se incrementa el número

        System.out.print("Los primeros " + cantidad + " números primos son: ");
        for (int i = 0; i < cantidad; i++)
            System.out.print(primos[i] + (i < cantidad - 1 ? ", " : "\n")); // Imprime cada uno de los números almacenados en el arreglo, seguido de , si cantidad > 1 o un salto de línea si es el último
        }    
}
