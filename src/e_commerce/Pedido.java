package e_commerce;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Constructor
public class Pedido {
    private final int idPedido;
    private final Cliente cliente;
    private final LocalDate fecha;
    private final List<DetallePedido> detalles;
    private double total;

    // Constructor
    public Pedido(int idPedido, Cliente cliente, String metodoPago) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.fecha = LocalDate.now();
        this.detalles = new ArrayList<>();
        this.total = 0;
    }

    // Agrega un producto al pedido con la cantidad indicada
    public void agregarProducto(Producto prod, int cantidad) throws StockInsuficienteException {
        prod.reducirStock(cantidad);
        double precioFinal = prod.aplicarDescuento();
        detalles.add(new DetallePedido(prod, cantidad, precioFinal));
    }

    // Calcula el total del pedido sumando los subtotales de cada producto
    public double calcularTotal() {
        total = 0;
        for (DetallePedido d : detalles) {
            total += d.calcularSubtotal();
        }
        return (total);
    }

    // Confirma el pedido, lanzando excepción si no tiene productos
    public void confirmarPedido() throws PedidoVacioException {
        if (detalles.isEmpty()) {
            throw new PedidoVacioException("El pedido no tiene productos.");
        }
        calcularTotal();
        cliente.agregarPedido(this);
    }

    // Devuelve la lista de productos en el pedido
    public List<DetallePedido> getDetalles() {
        return detalles;
    }

     // Devuelve el cliente que hizo el pedido
    public Cliente getCliente() {
        return cliente;
    }

    //ToString() para mostrar datos en consola en el main
    @Override
    public String toString() {
        return "Pedido #" + idPedido + " | Cliente: " + cliente.getNombre() +
               " | Total: $" + total + " | Fecha: " + fecha + " | Detalles " + detalles ;
    }
}
