package e_commerce;

public class Vendedor {
    private final int idVendedor; // Identificador único del vendedor
    private final String nombre; // Nombre completo del vendedor
    private final String correo; // Correo electrónico del vendedor
    private final String telefono; // Número de contacto
    private final String ciudad; // Dirección del vendedor o zona

    //Constructor
    public Vendedor(int idVendedor,
                    String nombre,
                    String correo,
                    String telefono,
                    String ciudad) {
        
        //Asigna el id, nombre, correo, telefono y ciudad
        this.idVendedor = idVendedor;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    //Devuelve el nombre
    public String getNombre() {
        return nombre;
    }

    //Devuelve el correo
    public String getCorreo() {
        return correo;
    }
    
    //ToString() para mostrar datos en consola en el main
    @Override
    public String toString() {
        return nombre + "\n" + 
                " (" + correo + ")";
    }
}
