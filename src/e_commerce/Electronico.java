package e_commerce;

public class Electronico extends Producto {
    private final String marca; //Marca del producto
    private final int mesesGarantia; // Garantía del producto en meses

    // Constructor
    public Electronico(int idProducto,
                       String nombre,
                       String descripcion,
                       String tipo,
                       double precio,
                       int stock,
                       Vendedor vendedor,
                       String marca,
                       String modelo,
                       String categoria,
                       int mesesGarantia) {
        
        super(idProducto, nombre, descripcion, tipo, precio, stock, vendedor); //Llama constructor de la superclase
        //Asigna su marca y sus meses de garantía
        this.marca = marca;
        this.mesesGarantia = mesesGarantia;
    }

    //Se aplica el descuento
    @Override
    public double aplicarDescuento() {
        return getPrecio() * 0.95;
}

    //ToString() para mostrar datos en consola en el main
    @Override
    public String toString() {
        return super.toString() + " |Marca: " + marca + "\n" +
                                " |Garantia: " + mesesGarantia + "\n" +
                                " meses";
    }
}
