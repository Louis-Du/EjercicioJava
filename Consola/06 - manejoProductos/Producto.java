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

    public void setNombreProducto(String nombre){
        this.nombreProduct = nombre;
    }
    public void setIdProduct(int id){
        this.idProduct = id;
    }
    public void setNumeroSerieProduct(int numeroSerie){
        this.numeroSerieProduct = numeroSerie;
    }
    public void setValorProduct(int valor){
        this.valorProduct = valor;
    }
    public void setNombreProvedorProduct(String nombreProvedor){
        this.nombreProvedorProduct = nombreProvedor;
    }
}
