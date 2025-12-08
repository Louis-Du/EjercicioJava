
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class informeVenta {
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        List <String> nombres = new ArrayList<>();     

        boolean inicio = true;

        System.out.println("------Bienvenido al sistema de informe para ventas \nPor favor, registre un nombre: ");

        do{
            
            String nombre = entrada.next();
            nombres.add(nombre);

            System.out.println("Has registrado los nombres: " +nombres);
            System.out.println("Escribe 'continue' para seguir registrando nombres o escribe 'exit' para finalizar.");
            
            String condicion = entrada.next();
            if(condicion.equalsIgnoreCase("exit")){
                inicio = false;
            } 

        }while(inicio);

        int[][] ventas = new int[nombres.size()][4];

        for(int i = 0; i < nombres.size(); i ++){
            System.out.println("Ingrese las ventas hechas por " + nombres.get(i) + " en cada trimestre");
            
            System.out.println("Venta del primer trimestre");
            ventas[i][0] = entrada.nextInt();

            System.out.println("Venta del segundo trimestre");            
            ventas[i][1] = entrada.nextInt();

            System.out.println("Venta del tercer trimestre");            
            ventas[i][2] = entrada.nextInt();        
            
            System.out.println("Venta del cuarto trimestre");            
            ventas[i][3] = entrada.nextInt();           

        }

        System.out.println("----Informe de ventas por vendedores----");

        for(int i = 0; i < nombres.size(); i ++){

            System.out.println(nombres.get(i)+ " ha hecho las siguientes ventas: " + Arrays.toString(ventas[i]));
            
            
            int suma = 0;

            for(int j = 0; j < ventas[i].length; j ++){
                suma += ventas[i][j];
            }
            double promedio = (double) suma / 4;

            System.out.println("El promedio de ventas hecha por "+nombres.get(i)+" es de "+promedio);
        }

        int suma = 0;
        int totalElements = 0;

        for(int i = 0; i < ventas.length; i ++){
        
            for(int j = 0; j < ventas[i].length; j ++){

                suma += ventas[i][j];
                totalElements ++;
            }
            
        }
        double promedioTotal = (double) suma / totalElements;
        System.out.println("El promedio total de ventas hechas por los vendedores es de: " +promedioTotal);
    }

}