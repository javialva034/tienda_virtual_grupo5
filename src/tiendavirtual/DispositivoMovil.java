package tiendavirtual;


public class DispositivoMovil extends Electronico {
    private String modelo;
    private int capacidad;
    
        public DispositivoMovil (String nombre,
                                 String codigo,
                                 double precio,
                                 int stock,
                                 String modelo,
                                 int capacidad) {
        
        super (nombre, codigo, precio, stock, modelo, capacidad);
            this.modelo = modelo;
            this.capacidad = capacidad;
        }
    public String getModelo(){
        return modelo;
    }
    public void setModelo (String modelo){
        this.modelo = modelo;
        
    }

    public int getCapacidad (){
        return capacidad;
    }
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }
    
    @Override
    public String toString(){
        return super.toString() +
        "|La cantidad de alcohol que contiene es de: "+ modelo + "%"+ "\n"+ 
        "|Su edad para consumo es de: "  + " anios" + "\n" + 
        "|Es proveniente de: " + capacidad ;
        
    }
}
