public class Producto{

    public String nombreProduct;
    public int idProduct;
    public int numeroSerieProduct;
    public int valorProduct;
    public String nombreProvedorProduct;

    public Producto(String nombreProduct, int idProduct, int numeroSerieProduct, int valorProduct, String nombreProvedorProduct){
    this.nombreProduct = nombreProduct;
    this.idProduct = idProduct;
    this.numeroSerieProduct = numeroSerieProduct;
    this.valorProduct = valorProduct;
    this.nombreProvedorProduct = nombreProvedorProduct;
    }
    
    public String getNombreProducto(){
        return nombreProduct;
    }
    public int getIdProduct(){
        return idProduct;
    }
    public int getNumeroSerieProduct(){
        return numeroSerieProduct;
    }
    public int getValorProduct(){
        return valorProduct;
    }
    public String getNombreProvedorProduct(){
        return nombreProvedorProduct;
    }
}