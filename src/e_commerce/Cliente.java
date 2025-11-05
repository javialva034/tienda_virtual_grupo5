package e_commerce;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

// Constructor
public class Cliente {
    private final int idCliente;
    private final String nombre;
    private final String correo;
    private final String telefono;
    private final String direccion;
    private final List<Pedido> historialPedidos; 

    public Cliente(int idCliente,
                   String nombre,
                   String correo,
                   String telefono,
                   String direccion) {
        
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.historialPedidos = new ArrayList<>(); // Inicializa la lista vacía de pedidos
    }

    // Método que agrega un pedido al historial del cliente
    public void agregarPedido(Pedido pedido) {
        historialPedidos.add(pedido);
    }

    // Devuelve la lista de pedidos del cliente
    public List<Pedido> getHistorialPedidos() { return historialPedidos; }

     // Devuelve el correo del cliente
    public String getCorreo(){
        return correo; 
    }
    
    // Devuelve el nombre del cliente
    public String getNombre(){
        return nombre; 
    }

    // Método que muestra el nombre y correo del cliente en formato corto
    @Override
    public String toString() {
        return nombre + " (" + correo + ")";
    }

     // Compara dos clientes basándose en su correo electrónico
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cliente c = (Cliente) obj;
        return correo.equalsIgnoreCase(c.correo);
    }

    // Genera un código hash basado en el correo del cliente
    @Override
    public int hashCode() {
        return Objects.hash(correo.toLowerCase());
    }
}
