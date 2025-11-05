package e_commerce;

//Excepción en caso de que el producot este duplicado
public class ProductoDuplicadoException extends Exception {
    public ProductoDuplicadoException(String msg) {
        super(msg);
    }
}
