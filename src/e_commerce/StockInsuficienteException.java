package e_commerce;

//Excepción en caso de stock insuficiente
public class StockInsuficienteException extends Exception {
    public StockInsuficienteException(String msg) {
        super(msg);
    }
}
