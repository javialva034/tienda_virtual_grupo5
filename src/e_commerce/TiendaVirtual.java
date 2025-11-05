package e_commerce;

import java.util.*;

public class TiendaVirtual {

    private final List<Producto> productos;
    private final List<Cliente> clientes;
    private final List<Pedido> pedidos;
    private final List<Vendedor> vendedores;
    private final Map<String, Pedido> carritoPorCliente; 

    public TiendaVirtual() {
        productos = new ArrayList<>();
        clientes = new ArrayList<>();
        pedidos = new ArrayList<>();
        vendedores = new ArrayList<>();
        carritoPorCliente = new HashMap<>();
    }

    // Registro de entidades
  
    public void registrarProducto(Producto p) throws ProductoDuplicadoException {
        if (productos.contains(p)) {
            throw new ProductoDuplicadoException("Producto ya registrado: " + p.getNombre());
        }
        productos.add(p);
    }

    public void registrarCliente(Cliente c) {
        clientes.add(c);
    }

    public void registrarVendedor(Vendedor v) {
        vendedores.add(v);
    }

    public void registrarVenta(Pedido pedido) {
        pedidos.add(pedido);
        pedido.getCliente().agregarPedido(pedido);
    }

    // Búsquedas

    public Producto buscarProducto(String nombre) throws ProductoNoEncontradoException {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        throw new ProductoNoEncontradoException("Producto no encontrado: " + nombre);
    }

    public List<Producto> buscarProducto(String tipo, boolean porTipo) {
        List<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getTipo().equalsIgnoreCase(tipo)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public Cliente buscarClientePorCorreo(String correo) throws ClienteNoRegistradoException {
        for (Cliente c : clientes) {
            if (c.getCorreo().equalsIgnoreCase(correo)) {
                return c;
            }
        }
        throw new ClienteNoRegistradoException("Cliente no registrado con el correo: " + correo);
    }


    // Carrito por cliente

    public Pedido obtenerCarrito(Cliente cliente) {
        if (!carritoPorCliente.containsKey(cliente.getCorreo())) {
            carritoPorCliente.put(cliente.getCorreo(), new Pedido(hashCode(), cliente, "Efectivo"));
        }
        return carritoPorCliente.get(cliente.getCorreo());
    }

    public void vaciarCarrito(Cliente cliente) {
        carritoPorCliente.remove(cliente.getCorreo());
    }


    // Reportes

    public void listarProductos() {
        System.out.println("\n=== LISTADO DE PRODUCTOS ===");
        if (productos.isEmpty()) System.out.println("No hay productos registrados.");
        else productos.forEach(System.out::println);
    }

    public void listarPedidos() {
        System.out.println("\n=== PEDIDOS REALIZADOS ===");
        if (pedidos.isEmpty()) System.out.println("Aun no se han registrado pedidos.");
        else pedidos.forEach(System.out::println);
    }

    public void generarReporteVentas() {
        System.out.println("\n=== REPORTE DE VENTAS ===");
        if (pedidos.isEmpty()) {
            System.out.println("No se han realizado ventas todavia.");
            return;
            
        }
        
        double totalGeneral = 0;
        for (Pedido pedido : pedidos) {
            double total = pedido.calcularTotal();
            totalGeneral += total;
            System.out.println(pedido);
        }
        System.out.println("--------------------------------------");
        System.out.println("TOTAL GENERAL DE VENTAS: $" + totalGeneral);
    }
    
    
    public void mostrarProductosMasVendidos() {
        System.out.println("\n=== PRODUCTOS MAS VENDIDOS ===");
        if (pedidos.isEmpty()) {
        System.out.println("Aun no hay ventas registradas.");
            return;
    }
        

        Map<String, Integer> contador = new HashMap<>();
        for (Pedido pedido : pedidos) {
            for (DetallePedido detalle : pedido.getDetalles()) {
                String nombre = detalle.getProducto().getNombre();
                contador.put(nombre, contador.getOrDefault(nombre, 0) + detalle.getCantidad());
        }
    }

        List<Map.Entry<String, Integer>> lista = new ArrayList<>(contador.entrySet());
        Collections.sort(lista, (a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<String, Integer> e : lista) {
            System.out.println(e.getKey() + ": " + e.getValue() + " unidades");
    }
} 


    public void mostrarHistorialCompras(String correoCliente) {
        System.out.println("\n=== HISTORIAL DE COMPRAS ===");
        boolean encontrado = false;
        for (Pedido p : pedidos) {
            if (p.getCliente().getCorreo().equalsIgnoreCase(correoCliente)) {
                System.out.println(p);
                encontrado = true;
        }
    }
    if (!encontrado) System.out.println("No hay compras registradas para ese cliente.");
}

    public void mostrarStockActual() {
        System.out.println("\n=== STOCK ACTUAL ===");
        for (Producto p : productos) {
            System.out.printf("%s - Stock restante: %d", p.getNombre(), p.getStock());
        }
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }
}
