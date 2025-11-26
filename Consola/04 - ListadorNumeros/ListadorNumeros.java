import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 * Programa que filtra números ingresados por el usuario.
 * Termina cuando se ingresa 's'.
 */

public class FiltradorNumeros {

    public static void main(String[] args){

        // Se crea un objeto de scanner para leer las entradas del usuario. 
        
        Scanner entrada = new Scanner(System.in);
        
        // Lista para almacenar los números que introduzca el usuario.
        
        List<Double> numerosGuardados = new ArrayList<>();

        System.out.println("¡BIENVENIDO AL SISTEMA DE FILTRACIÓN DE NÚMEROS!");
        
        System.out.println("Por favor, ingresa los números a guardar y luego escribe 's'.");

        boolean jugando = true;

        while(jugando){
            String entradaIngresada = entrada.next();
            
            // Con esta condicional verificamos si la entrada es una "s" para finalizar e programa, si no lo es sigue con el siguiente bloque.
            if (entradaIngresada.equalsIgnoreCase("s")){
                jugando = false;
            }

            else{

                // Aquí se evalua si la entrda es un número y luego se guarda en la lista.
                
                if (entradaIngresada.matches("-?\\d+(\\.\\d+)?")){
                    
                    double numeroIngresado = Double.parseDouble(entradaIngresada);
                    numerosGuardados.add(numeroIngresado);

                    System.out.println("Número guardado con exito. Lista de números guardados: ");

                    System.out.println(numerosGuardados);
                    
                    System.out.println("Ingresa otro número o escribe una s para finalizar.");
                                    
                }

                // Si no cumple las condiciones muestra un mensaje de error.
                else{

                    System.out.println("¡ERROR! Ingresa solo números.");
                    
                }
            }
        }
        entrada.close();
    }

}