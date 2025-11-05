package e_commerce;

public class ProductoLimpieza extends Producto {
    private final String aroma; //Tipo de aroma
    private final String presentacion; //Tipo de presentación
    private boolean biodegradable; 

    //Constructor
    public ProductoLimpieza(int idProducto, 
                            String nombre,
                            String descripcion,
                            String tipo,
                            double precio,
                            int stock, 
                            Vendedor vendedor,
                            String aroma,
                            String presentacion,
                            boolean biodegradable) {
        
        //Constructor
        super(idProducto, nombre, descripcion, tipo, precio, stock, vendedor); //Llama constructor de la superclase
        //Asigna el tipo de aroma, su presentación y si es biodegradable o no
        this.aroma = aroma;
        this.presentacion = presentacion;
        this.biodegradable = biodegradable;
    }

    //Aplicar Descuento
    @Override
    public double aplicarDescuento() {
        return getPrecio() * 0.93;
    }

    //ToString() para mostrar datos en consola en el main
    @Override
    public String toString() {
        return super.toString() + " |Aroma: " + aroma + "\n"
                + " |Presentacion: " + presentacion + "\n"
                + " |Biodegradable: " + biodegradable;
    }
}
