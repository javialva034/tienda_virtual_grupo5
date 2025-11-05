package e_commerce;


public class DetallePedido {
    // Clase que representa un detalle dentro de un pedido (producto, cantidad y precio final)
    private final Producto producto;
    private final int cantidad;
    private final double precioFinal;

    // Constructor
    public DetallePedido(Producto producto,
                         int cantidad,
                         double precioFinal) {
        
        this.producto = producto;
        this.cantidad = cantidad;
        producto.getPrecio();
        this.precioFinal = precioFinal;
    }

    //Codigo que devuelve datos para usarse en el main
    public double calcularSubtotal() {
        return precioFinal * cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    //ToString() para mostrar datos en consola en el main
    @Override
    public String toString() {
        return producto.getNombre() + " x" + cantidad + " = $" + calcularSubtotal();
    }
}
