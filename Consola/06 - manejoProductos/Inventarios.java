import java.util.ArrayList;

public class Inventarios{

    ArrayList<Producto> listaProductos = new ArrayList<>();    
    ArrayList<Object[]> existencias = new ArrayList<>();

    public void AgregarProducto(Producto p){
        listaProductos.add(p);
    }

    public void AgregarExistencias(Object[] e){
        existencias.add(e);
    }

    public void VerListaProducto(){
        int indice = 0;

        for(int i = 0; i < existencias.size(); i ++){
            Producto producto = listaProductos.get(i);
            Object[] existencia = existencias.get(i);

            System.out.println(indice +
                " - Nombre: " + producto.nombreProduct +
                " | ID: " + producto.idProduct +
                " | Cantidad: " + existencia[1]
            );
            indice ++;
        }
    }

    public void EliminarProducto(int indice){

        if(indice >= 0 && indice < listaProductos.size()){

            listaProductos.remove(indice);
            existencias.remove(indice);

            System.out.println("Producto eliminado");
        }

        else{
            System.out.println("Ingresa un indice valido");
        }
    }

    public void ModificarInfoProducto(int indice, String nuevoNombreProduct, int nuevoIdProduct, int nuevoNumeroSerieProduct, int nuevoValorProduct, String nuevoNombreProvedorProduct){
        if(indice >= 0 && indice < listaProductos.size()){
            Producto producto = listaProductos.get(indice);
            
            producto.nombreProduct = nuevoNombreProduct;
            producto.idProduct = nuevoIdProduct;
            producto.numeroSerieProduct = nuevoNumeroSerieProduct;
            producto.valorProduct = nuevoValorProduct;
            producto.nombreProvedorProduct = nuevoNombreProvedorProduct;

            Object[] existencia = existencias.get(indice);
            
            existencia[0] = nuevoNombreProduct;

            System.out.println("Producto modificado con exito");
        }

        else{
            System.out.println("Ingresa un indice valido");
        }
    }

    public void RealizarVenta(int indice, int unidadesVender){
        if(indice>=0 && indice<existencias.size()){
            Object[] existencia = existencias.get(indice);
            Producto producto = listaProductos.get(indice);

            int cantidadActual = (int) existencia[1]; 

            if (cantidadActual >= unidadesVender) {
                existencia[1] = cantidadActual - unidadesVender;
                System.out.println("Venta exitosa. Quedan " + existencia[1] + " unidades de " + producto.nombreProduct);
            } 
            else {
                System.out.println("No hay suficiente unidades. Solo quedan: " + cantidadActual);
            }
        } 
        else {
            System.out.println("Índice de producto no válido.");
        }
    }
}
