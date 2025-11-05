package e_commerce;

public class Ropa extends Producto {
    private final String talla; //Talla de la prenda
    private final String color; //Color de la prenda

    //Constructor
    public Ropa(int idProducto,
                String nombre,
                String descripcion,
                String tipo,
                double precio, 
                int stock,
                Vendedor vendedor,
                String talla,
                String color,
                String genero) {
        
        super(idProducto, nombre, descripcion, tipo, precio, stock, vendedor); //Llama al constructor de la superclase
        //Asigna la talla y color
        this.talla = talla;
        this.color = color;
    }

    //Aplicar descuento
    @Override
    public double aplicarDescuento() {
        return getPrecio() * 0.90;
    }

    //ToString() para mostrar datos en consola en el main
    @Override
    public String toString() {
        return super.toString() + " |Talla: " + talla + "\n" +
                                " |Color: " + color;
    }
}
