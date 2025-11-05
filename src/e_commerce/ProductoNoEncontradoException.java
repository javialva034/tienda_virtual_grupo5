package e_commerce;

//Exepción en caso de no encontrar un producto
public class ProductoNoEncontradoException extends Exception {
    public ProductoNoEncontradoException(String msg) {
        super(msg);
    }
}
