package tiendavirtual;

public class Suavizante extends Limpieza {
    private String intensidad;
    private String paraRopa;
    private double ph;
    private boolean protegeColor;
    
    public Suavizante (String nombre,
                       String codigo,
                       double precio,
                       int stock,
                       String intensidad,
                       String paraRopa,
                       double ph,
                       boolean protegeColor){ 
        
    super(nombre, codigo, precio, stock, intensidad, protegeColor, ph);
    
    this.intensidad = intensidad;
    this.paraRopa = paraRopa;
    this.ph = ph;
    this.protegeColor = protegeColor;
    
    }
    
    public String getIntensidad(){
        return intensidad;
    }
    public void setIntensidad(String intensidad){
        this.intensidad = intensidad;
    }
    
    public String getParaRopa(){
        return paraRopa;
    }
    public void setParaRopa(String paraRopa){
        this.paraRopa = paraRopa;
    }
    
    public double getPh(){
        return ph;
    }
    public void setPh(double ph){
        this.ph = ph;
    }
    
    public boolean getProtegeColor(){
        return protegeColor;
    }
    public void setProtegeColor(boolean protegeColor){
        this.protegeColor = protegeColor;
    }
                     
}
