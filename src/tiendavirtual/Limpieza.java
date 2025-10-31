package tiendavirtual;


public class Limpieza extends Producto {
    private String fragancia;
    private boolean biodegradable;
    private double litros;
    
    public Limpieza (String nombre,
                     String codigo,
                     double precio,
                     int stock,
                     String fragancia,
                     boolean biodegradable,
                     double litros){
        
        super(nombre, codigo, precio, stock);
        
        this.fragancia = fragancia;
        this.biodegradable = biodegradable;
        this.litros = litros;
    }
    public String getFragancia(){
        return fragancia;
    }
    public void setFragancia (String fragancia){
        this.fragancia = fragancia;
    }
    
    public boolean getBiodegradable(){
        return biodegradable;
        
    }
    public void setBiodegradable(boolean biodegradable){
        this.biodegradable = biodegradable;
    }
    
    public double getLitros(){
        return litros;
    }
    public void setLitros(double litros){
        this.litros = litros;
    }
}
