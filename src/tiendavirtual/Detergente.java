package tiendavirtual;


public class Detergente extends Limpieza {
    private String ropa;
    private boolean lavadora;
    private String espuma;
    
        public Detergente (String nombre,
                           String codigo,
                           double precio,
                           int stock,
                           String ropa,
                           boolean lavadora,
                           String espuma,
                           double litros) {
            
        super(nombre, codigo, precio, stock, ropa, lavadora, litros );
        
       this.ropa = ropa;
       this.lavadora = lavadora;
       this.espuma = espuma;       
        }
        
    public String getRopa(){
        return ropa;
    }
    public void setRopa(String ropa){
        this.ropa = ropa;
    }
    public boolean getLavadora(){
        return lavadora;
    }
    public void setLavadora(boolean lavadora){
        this.lavadora = lavadora;
    }
    public String getEspuma(){
        return espuma;
    }
    public void setEspuma(String espuma){
        this.espuma = espuma;
    }
}
