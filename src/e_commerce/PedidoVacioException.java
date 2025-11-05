package e_commerce;

//Excepción en caso de que haya algún pedido vacio
public class PedidoVacioException extends Exception {
    public PedidoVacioException(String msg) {
        super(msg);
    }
}
