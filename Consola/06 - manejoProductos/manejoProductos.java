
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class manejoProductos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Producto> listaProductos = new ArrayList<>();
        
        ArrayList<Object[]> existencias = new ArrayList<>();
        
        boolean correrPrograma = true;
            
        System.out.println("========= Bienvenido al sistema de manejo de productos");
        System.out.println("Por favor, ingresa los datos de productos para guardarlo al sistema.");

        int iteracion = 0;
       
        do{
            System.out.println("----------------- \nProducto "+iteracion);
            
            String nombreProducto = "";
            int idProducto = 0;
            int serieProducto = 0;
            int valorProducto = 0;
            String provedorProducto = "";
            int cantidadProducto = 0;
            
            try{
                System.out.println("Escribe el nombre del producto: ");
                nombreProducto = entrada.next();

                System.out.println("Escribe la identificación del producto: ");
                idProducto = entrada.nextInt();

                System.out.println("Escribe el número de serie del producto: ");
                serieProducto = entrada.nextInt();

                System.out.println("Escribe el valor del producto: ");
                valorProducto = entrada.nextInt();

                System.out.println("Escribe el nombre del provedor: ");
                provedorProducto = entrada.next();

                System.out.println("Cantidad de "+nombreProducto);
                cantidadProducto = entrada.nextInt();

            }catch(InputMismatchException ex){
                System.out.println("¡ERROR!: Ingresa una entrada valida");
                entrada.next();
                continue;
            }

            Producto nuevoProducto = new Producto(nombreProducto, idProducto, serieProducto, valorProducto, provedorProducto);

            listaProductos.add(nuevoProducto);
            
            existencias.add(new Object[]{
                nombreProducto, 
                cantidadProducto
            });

            iteracion ++;
            
            System.out.println("¿Te gustaria ingresar otro producto? s/n");

            String condicion = entrada.next();

            if(condicion.equalsIgnoreCase("n")){
                correrPrograma = false;
            }
                
           
        }while(correrPrograma);
        
        do{
            
            System.out.println("¿Ahora qué te gustaria hacer? \n1 - Ver detalles de los productos \n2 - Ver cantidad de productos disponibles \n3 - finalizar el sistema");
            
            try{
                int seleccion = entrada.nextInt();

                switch(seleccion){
                    case 1:
                        for(Producto producto : listaProductos){

                            System.out.println(
                                "Nombre: " + producto.nombreProduct +
                                " | ID: " + producto.idProduct +
                                " | Serie: " + producto.numeroSerieProduct +
                                " | Valor: " + producto.valorProduct +
                                " | Proveedor: " + producto.nombreProvedorProduct
                            );

                        }
                        break;

                    case 2:
                        for (Object[] e : existencias) {
                            System.out.println("Producto: " + e[0] +" | Cantidad: " + e[1]);
                        }
                        break;

                    case 3:
                        System.out.println("Saliendo del sistema...");
                        correrPrograma = false;
                        break;

                    default:
                        System.out.println("Opción no válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Debes escribir un número.");
                entrada.next();
            }
            
        }while(correrPrograma);
        entrada.close();
    }
}
