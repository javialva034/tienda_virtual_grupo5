package e_commerce;

//Excepción en caso de que no haya un cliente registrado
public class ClienteNoRegistradoException extends Exception {
    public ClienteNoRegistradoException(String msg) {
        super(msg);
    }
}
