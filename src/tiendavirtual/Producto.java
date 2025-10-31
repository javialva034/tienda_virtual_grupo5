package tiendavirtual;


import java.util.Objects;

public class Producto implements Descontable {
    private String nombre;
    private String codigo;
    private double precio;
    private int stock;

    public Producto(String nombre,
                    String codigo,
                    double precio,
                    int stock) {
        
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre; 
    }
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    
    public String getCodigo() {
        return codigo; 
    }
    
    public void setCodigo(String codigo) { 
        this.codigo = codigo; 
    }

    public double getPrecio() {
        return precio; 
    }
    
    public void setPrecio(double precio) {
        this.precio = precio; 
    }

    public int getStock() { 
        return stock; 
    }
    
    public void setStock(int stock) {
        this.stock = stock; 
    }

    // Implementación de Descontable
    @Override
    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }

    // toString
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

    // equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return Double.compare(producto.precio, precio) == 0 &&
               Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }
}

