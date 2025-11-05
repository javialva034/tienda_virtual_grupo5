package e_commerce;

import java.util.Scanner;

public class Main {
    //Clase que se maneja gracias a todo lo trabajado y ejecuta el programa
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in) // Scanner para leer datos desde consola
        ) {
            TiendaVirtual tienda = new TiendaVirtual(); // Crea una instancia de la tienda
            Vendedor v1 = new Vendedor(1, "Juan Perez", "juan@correo.com", "0999999999", "Guayaquil");
            Cliente c1 = new Cliente(1, "Maria López", "maria@correo.com", "0988888888", "Mapasingue Este");
            Cliente c2 = new Cliente(2, "Carlos Perez", "carlos@correo.com", "0977777777", "Centro");
            tienda.registrarVendedor(v1); //Se registra vendedor
            tienda.registrarCliente(c1); //Se registra cliente
            tienda.registrarCliente(c2);
            //Mostramos un ejemplo de registro de productos usando Try/Catch
            try {
                tienda.registrarProducto(new Electronico(1, "Laptop HP", "Computadora portatil", "Electronico", 800, 5, v1,
                        "HP", "Pavilion", "Electrodomestico", 12));
                tienda.registrarProducto(new Ropa(2, "Camiseta", "Camiseta algodon", "Ropa", 20, 10, v1,
                        "M", "Azul", "Unisex"));
                tienda.registrarProducto(new ProductoLimpieza(3, "Jabon liquido", "Aroma a lavanda", "Limpieza", 3.5, 30, v1,
                        "Lavanda", "Botella 1L", true));
                tienda.registrarProducto(new ProductoFiesta(4, "Globos de colores", "Paquete de 50 globos", "Fiesta", 2.5, 50, v1,
                        "Cumpleanios", false, "Latex"));
            }
            
            catch (ProductoDuplicadoException e) {
                System.out.println(e.getMessage());
            }
            int opcion = 0; // Variable para almacenar la opción del menú
            //Menú principal
            do {
                System.out.println("\n----------------------------------");
                System.out.println("       TIENDA VIRTUAL - MENU      ");
                System.out.println("----------------------------------");
                System.out.println("1. Registrar producto");
                System.out.println("2. Registrar cliente");
                System.out.println("3. Listar productos");
                System.out.println("4. Buscar producto por nombre o tipo");
                System.out.println("5. Agregar producto al carrito");
                System.out.println("6. Confirmar pedido (realizar venta)");
                System.out.println("7. Mostrar historial de compras");
                System.out.println("8. Listar pedidos");
                System.out.println("9. Reporte de ventas totales");
                System.out.println("10. Productos más vendidos");
                System.out.println("11. Salir");
                System.out.print("Seleccione una opcion: ");
                
                try {
                    opcion = Integer.parseInt(sc.nextLine()); //Se encarga de leer el número que eligió el usuario
                } catch (NumberFormatException e) {
                    System.out.println("Opcion invalida, intente nuevamente.");
                    continue;
                }
                
                //Registro de productos
                try {
                    switch (opcion) {
                        
                        case 1 -> {
                            System.out.println("\n--- REGISTRO DE PRODUCTO ---");
                            System.out.println("Tipos disponibles:");
                            System.out.println("1. Electronico");
                            System.out.println("2. Ropa");
                            System.out.println("3. Limpieza");
                            System.out.println("4. Fiesta");
                            System.out.print("Seleccione tipo: ");
                            int tipo = Integer.parseInt(sc.nextLine());
                            
                            // Solicita los datos básicos del producto
                            System.out.print("ID: ");
                            int id = Integer.parseInt(sc.nextLine());
                            System.out.print("Nombre: ");
                            String nombre = sc.nextLine();
                            System.out.print("Descripcion: ");
                            String descripcion = sc.nextLine();
                            System.out.print("Categoria: ");
                            String categoria = sc.nextLine();
                            System.out.print("Precio: ");
                            double precio = Double.parseDouble(sc.nextLine());
                            System.out.print("Stock: ");
                            int stock = Integer.parseInt(sc.nextLine());
                            
                            //Tomara al primer vendedor registrado
                            Vendedor vendedor = tienda.getVendedores().get(0);
                            
                            
                            // Crea el producto según el tipo seleccionado
                            switch (tipo) {
                                case 1 -> {
                                    System.out.print("Marca: ");
                                    String marca = sc.nextLine();
                                    System.out.print("Modelo: ");
                                    String modelo = sc.nextLine();
                                    System.out.print("Tipo: ");
                                    String tipoE = sc.nextLine();
                                    System.out.print("Meses de garantía: ");
                                    int garantia = Integer.parseInt(sc.nextLine());
                                    tienda.registrarProducto(new Electronico(id, nombre, descripcion, categoria, precio, stock, vendedor,
                                            marca, modelo, tipoE, garantia));
                                }
                                case 2 -> {
                                    System.out.print("Talla: ");
                                    String talla = sc.nextLine();
                                    System.out.print("Color: ");
                                    String color = sc.nextLine();
                                    System.out.print("Genero: ");
                                    String genero = sc.nextLine();
                                    tienda.registrarProducto(new Ropa(id, nombre, descripcion, categoria, precio, stock, vendedor,
                                            talla, color, genero));
                                }
                                case 3 -> {
                                    System.out.print("Aroma: ");
                                    String aroma = sc.nextLine();
                                    System.out.print("Presentacion: ");
                                    String presentacion = sc.nextLine();
                                    System.out.print("¿Es biodegradable? (true/false): ");
                                    boolean bio = Boolean.parseBoolean(sc.nextLine());
                                    tienda.registrarProducto(new ProductoLimpieza(id, nombre, descripcion, categoria, precio, stock, vendedor,
                                            aroma, presentacion, bio));
                                }
                                case 4 -> {
                                    System.out.print("Evento: ");
                                    String evento = sc.nextLine();
                                    System.out.print("¿Incluye decoracion? (true/false): ");
                                    boolean deco = Boolean.parseBoolean(sc.nextLine());
                                    System.out.print("Material: ");
                                    String material = sc.nextLine();
                                    tienda.registrarProducto(new ProductoFiesta(id, nombre, descripcion, categoria, precio, stock, vendedor,
                                            evento, deco, material));
                                }
                                default -> System.out.println("Tipo invalido.");
                            }
                            System.out.println(" Producto registrado correctamente.");
                        }
                        
                        //Registro de Cliente
                        case 2 -> {
                            System.out.print("ID: ");
                            int id = Integer.parseInt(sc.nextLine());
                            System.out.print("Nombre: ");
                            String nombre = sc.nextLine();
                            System.out.print("Correo: ");
                            String correo = sc.nextLine();
                            System.out.print("Telefono: ");
                            String telefono = sc.nextLine();
                            System.out.print("Direccion: ");
                            String direccion = sc.nextLine();
                            
                            // Crea un nuevo cliente y lo registra
                            tienda.registrarCliente(new Cliente(id, nombre, correo, telefono, direccion));
                            System.out.println("Cliente registrado correctamente.");
                        }
                        
                        //Listar productos
                        case 3 -> tienda.listarProductos();
                        
                        
                        //Buscar Productos
                        case 4 -> {
                            System.out.print("Buscar por (1 = Nombre, 2 = Tipo): ");
                            int tipo = Integer.parseInt(sc.nextLine());
                            if (tipo == 1) {
                                System.out.print("Nombre: ");
                                String n = sc.nextLine();
                                System.out.println(tienda.buscarProducto(n));
                            } else {
                                System.out.print("Tipo: ");
                                String t = sc.nextLine();
                                tienda.buscarProducto(t, true).forEach(System.out::println);
                            }
                        }
                        
                        //Agregar productos al carrito
                        case 5 -> {
                            System.out.print("Correo del cliente: ");
                            String correo = sc.nextLine();
                            Cliente cli = tienda.buscarClientePorCorreo(correo);
                            
                            Pedido pedido = tienda.obtenerCarrito(cli);
                            System.out.print("Producto: ");
                            Producto p = tienda.buscarProducto(sc.nextLine());
                            System.out.print("Cantidad: ");
                            int cant = Integer.parseInt(sc.nextLine());
                            
                            pedido.agregarProducto(p, cant);
                            System.out.println("Producto agregado al carrito de " + cli.getNombre());
                        }
                        
                        //Confirmación de pedido
                        case 6 -> {
                            System.out.print("Correo del cliente: ");
                            String correo = sc.nextLine();
                            Cliente cli = tienda.buscarClientePorCorreo(correo);
                            
                            Pedido pedido = tienda.obtenerCarrito(cli);
                            pedido.confirmarPedido();
                            tienda.registrarVenta(pedido);
                            tienda.vaciarCarrito(cli);
                            System.out.println("Pedido confirmado.");
                            System.out.println(pedido);
                            
                        }
                        
                        //Mostrar el historial
                        case 7 -> {
                            System.out.print("Correo del cliente: ");
                            tienda.mostrarHistorialCompras(sc.nextLine());
                        }
                        
                        //Listar pedidos
                        case 8 -> tienda.listarPedidos();
                        //Reporte de Ventas
                        case 9 -> tienda.generarReporteVentas();
                        //Producto más vendido
                        case 10 -> tienda.mostrarProductosMasVendidos();
                        //Cierra el programa (Salir)
                        case 11 -> System.out.println("Programa finalizado correctamente.");
                        //En caso de no haber opción no disponible
                        default -> System.out.println("️Opción no válida.");
                    }
                    
                    //Todas las excepciones
                } catch (ClienteNoRegistradoException | PedidoVacioException | ProductoDuplicadoException | ProductoNoEncontradoException | StockInsuficienteException | NumberFormatException e) {
                    System.out.println("Error: " + e.getMessage()); //Mensaje de cada Excepción
                }
            } while (opcion != 11); // Repite el menú hasta que el usuario salga
            // Cierra el scanner
        } // Crea una instancia de la tienda
    }
}
