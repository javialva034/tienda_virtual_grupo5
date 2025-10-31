package tiendavirtual;


public class Electronico extends Producto {
    
    private String marca;
    private int cantidad;
    
    public Electronico (String nombre,
                    String codigo,
                    double precio,
                    int stock,
                    String marca,
                    int cantidad){
        
    super(nombre, codigo, precio, stock);
    
        this.marca = marca;
        this.cantidad = cantidad;
        
    }
    
    public String getMarca(){
        return marca;  
    }

    public int getCantidad(){
        return cantidad;
        
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
   
    
    public void setCantidad (int cantidad){
        this.cantidad = cantidad;
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
    return getPrecio() * 0.9;
}
    @Override
    public String toString() {
        return super.toString() + 
                " La marca: " + marca + "\n"
                + "con cantidad de: " + cantidad ;    }
}
