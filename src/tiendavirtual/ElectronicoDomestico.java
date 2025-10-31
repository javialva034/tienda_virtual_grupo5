package tiendavirtual;

public class ElectronicoDomestico extends Electronico {
    private String uso;
    private int aniofabricacion;
    private String modelo;
    
        public ElectronicoDomestico (String nombre,
                                 String codigo,
                                 double precio,
                                 int stock,
                                 String uso,
                                 int aniofabricacion,
                                 String modelo){
            
        super (nombre, codigo, precio, stock, uso, aniofabricacion);
        
        this.uso = uso;
        this.aniofabricacion = aniofabricacion;
        this.modelo = modelo;
        }        
                
    public String getUso() {
    return uso;
    }

    public void setUso(String uso){
        this.uso = uso;
    }
    
    public int getAniofabricacion(){
        return aniofabricacion;
    }
    public void setAniofabricacion(int aniofabricacion){
        this.aniofabricacion = aniofabricacion;
    }
    
    public String getModelo (){
        return modelo;
        
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }    
@Override
    public String toString(){
        return super.toString() +
        "|La cantidad de alcohol que contiene es de: "+ uso + "%"+ "\n"+ 
        "|Su edad para consumo es de: " + aniofabricacion + " anios" + "\n" + 
        "|Es proveniente de: " + modelo ;
    }
    
}
