package e_commerce;

import java.util.Objects;

// Implementa la interfaz Descuento, por lo que debe tener el método aplicarDescuento()
public abstract class Producto implements Descuento {
    
    private int idProducto; // Identificador único del producto
    private String nombre; // Nombre del producto
    private String descripcion; //Pequeña descripción
    private String categoria; //Categoria del producto
    private String tipo; //Tipo de producto dentro de su categoria
    private double precio; //Precio del producto
    private int stock; // Cantidad de stock disponible
    private Vendedor vendedor; //Vendedor asocidado la

    //Constructor
    public Producto(int idProducto,
                    String nombre,
                    String descripcion,
                    String tipo,
                    double precio,
                    int stock,
                    Vendedor vendedor) {
        
        if (precio <= 0 || stock < 0) {
            throw new IllegalArgumentException("Precio y stock deben ser positivos.");
        }
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
        this.stock = stock;
        this.vendedor = vendedor;
    }

    public String getNombre(){
        return nombre; 
    }
    public String getTipo(){
        return tipo; 
    }
    public double getPrecio(){
        return precio; 
    }
    public int getStock(){
        return stock; 
    }
    public void setStock(int stock){
        this.stock = stock; 
    }

    public void reducirStock(int cantidad) throws StockInsuficienteException {
        if (cantidad > stock) {
            throw new StockInsuficienteException("Stock insuficiente para el producto: " + nombre);
        }
        stock -= cantidad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto p = (Producto) obj;
        return nombre.equalsIgnoreCase(p.nombre) && tipo.equalsIgnoreCase(p.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase(), tipo.toLowerCase());
    }

    //ToString() para mostrar datos en consola en el main
    @Override
    public String toString() {
        return "ID: " + idProducto + "\n" +
           " |Nombre: " + nombre + "\n" +
           " |Descripción: " + descripcion + "\n" +
           " |Categoría: " + categoria + "\n" +
           " |Precio: $" + precio + "\n" +
           " |Stock: " + stock + "\n" +
           " |Vendedor: " + (vendedor != null ? vendedor.getNombre() : "Sin asignar")+
           "\n";
}

}
