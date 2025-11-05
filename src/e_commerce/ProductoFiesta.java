package e_commerce;

public class ProductoFiesta extends Producto {
    private final String ocasion; // Tipo de evento (cumpleaños, boda, etc.)
    private final String material; // Material del producto (látex, papel, etc.)

    // Constructor
    public ProductoFiesta(int idProducto,
                          String nombre,
                          String descripcion,
                          String tipo,
                          double precio,
                          int stock,
                          Vendedor vendedor,
                          String ocasion,
                          boolean luminoso,
                          String material) {
        
        super(idProducto, nombre, descripcion, tipo, precio, stock, vendedor); //Llama constructor de la superclase
        //Asigna el tipo de ocasión 
        this.ocasion = ocasion; 
        this.material = material;
    }

    //Se aplica descuento 
    @Override
    public double aplicarDescuento() {
        return getPrecio() * 0.92;
    }

    //ToString() para mostrar datos en consola en el main
    @Override
    public String toString() {
        return super.toString() + " |Ocasion: " + ocasion + "\n" +
                                  " |Material: " + material;
    }
}
