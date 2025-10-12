
import java.util.Random;
import java.util.Scanner;

class AdivinarNumero 
{
    public static void main(String[] args)
    {
        Random aleatorio = new Random(); // Crea un objeto Random para generar números aleatorios
        Scanner entrada = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

        int numeroSecreto = aleatorio.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        int intentos = 0;

        System.out.println("¡Adivina el Número!");

        while (true) // Bucle infinito hasta que el usuario adivine el número o decida salir
        {
            System.out.print("Adivina el número entre 1 y 100 para ganar. \nIngresa un número: ");

            if (!entrada.hasNextInt()) // Verifica si la entrada es un entero
            {
                System.out.println("Entrada no válida. Por favor, ingresa un número.");
                entrada.next(); // Limpiar la entrada no válida
                continue;
            }

            int numero = entrada.nextInt(); // Lee el número ingresado por el usuario

            if (numero < 1 || numero > 100) // Si el número está fuera del rango de 1 a 100
            {
                System.out.println("Número no válido. Por favor, ingresa un número entre 1 y 100.");
                continue;
            }

            if (numero < numeroSecreto) // Si el número es menor que el número secreto
            {
                intentos++;
                System.out.println("¡Fallaste!: El número es mayor. \nIntento: " + intentos + "\nInténtalo de nuevo.");
            }
            else if (numero > numeroSecreto) // Si el número es mayor que el número secreto
            {
                intentos++;
                System.out.println("¡Fallaste!: El número es menor. \nIntento: " + intentos + "\nInténtalo de nuevo.");
            }
            else // Si el número es igual al número secreto
            {
                System.out.println("¡Felicidades! ¡Has adivinado el número! \n¿Quieres jugar de nuevo? (s/n)");

                String respuesta = entrada.next();

                if (respuesta.equalsIgnoreCase("s")) // Si el usuario quiere jugar de nuevo
                {
                    intentos = 0;
                    numeroSecreto = aleatorio.nextInt(100) + 1; // Genera un nuevo número secreto
                }
                else if (respuesta.equalsIgnoreCase("n")) // Si el usuario no quiere jugar de nuevo
                {
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    break; // Sale del bucle y termina el programa
                }
                else // Si la respuesta no es válida
                {
                    System.out.println("Respuesta no válida.");
                }
            }
        }

        entrada.close();
    }
}
