
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class manejoProductos {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        Inventarios Inventario = new Inventarios();

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

            Inventario.AgregarProducto(nuevoProducto);
            
            Inventario.AgregarExistencias(new Object[]{
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

        correrPrograma = true;
        
        do{
            
            System.out.println("¿Ahora qué te gustaria hacer? \n1 - Ver lista de productos \n2 - Eliminar producto \n3 - Modificar información de producto \n4 - Realizar venta \n5 - finalizar el sistema");
            
            try{
                int seleccion = entrada.nextInt();

                switch(seleccion){
                    case 1:
                        System.out.println("====== Lista de productos ======");
                        Inventario.VerListaProducto();
                        System.out.println("==============================");
                        break;

                    case 2:
                        System.out.println("====== Eliminar producto ====== \nIngresa el indice correspondiente al producto para eliminarlo");
                        
                        Inventario.VerListaProducto();

                        int indice = entrada.nextInt(); 
                        Inventario.EliminarProducto(indice);
                        break;

                    case 3:
                        System.out.println("====== Modificación de información de productos ====== \nEscribe el indice del producto a modificar");
                        Inventario.VerListaProducto();
                        
                        try{
                            int i = entrada.nextInt();
                        
                            System.out.println("Agrega el nuevo nombre del producto");
                            String nuevoNombre = entrada.next();

                            System.out.println("Agrega el nuevo ID");
                            int nuevoId = entrada.nextInt();

                            System.out.println("Agrega la nueva serie");
                            int nuevaSerie = entrada.nextInt();

                            System.out.println("Agrega el nuevo valor");
                            int nuevoValor = entrada.nextInt();

                            System.out.println("Agrega el nuevo nombre del provedor");
                            String nuevoNombreProvedor = entrada.next();

                            Inventario.ModificarInfoProducto(i,nuevoNombre, nuevoId, nuevaSerie, nuevoValor, nuevoNombreProvedor);

                        }catch(InputMismatchException ex){
                            System.out.println("¡ERROR!: Ingresa una entrada valida");
                            entrada.next();
                        }
                        break;

                    case 4:
                        System.out.println("====== Realizar ventas ====== \nIngresa el indice del producto a vender");
                        Inventario.VerListaProducto();

                        try{
                            int i = entrada.nextInt();

                            System.out.println("¿Cuantas unidades vas a vender?");
                            int unidadesVender = entrada.nextInt();

                            Inventario.RealizarVenta(i, unidadesVender);

                        }catch(InputMismatchException ex){
                            System.out.println("¡ERROR!: Ingresa una entrada valida");
                            entrada.next();
                        }
                        break;

                    case 5:
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
