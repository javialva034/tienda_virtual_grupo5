package tiendavirtual;

public class Computadora extends Electronico {
    private String procesador;
    private int espacio;
    private int RAM;
    private boolean pantalla;
    
        public Computadora (String nombre,
                            String codigo,
                            double precio,
                            int stock,
                            String procesador,
                            int espacio,
                            int RAM,
                            boolean pantalla){
            
        super (nombre, codigo, precio, stock, procesador, espacio);   
            this.procesador = procesador;
            this.espacio = espacio;
            this.RAM = RAM;
            this.pantalla = pantalla;
        }
    
    public String getProcesador(){
        return procesador;
        
    }
    public void setProcesador(String procesador){
        this.procesador = procesador;
    }
    
    public int getEspacio (){
        return espacio;
    }
    public void setEspacio (int espacio){
        this.espacio = espacio;
    }    
    public int getRAM(){
        return RAM;
    }
    public void setRAM(int RAM){
        this.RAM = RAM;
    }
    public boolean getPantalla(){
        return pantalla = pantalla;
    }
    public void setPantalla(boolean pantalla){
        this.pantalla = pantalla;
    }
    
    @Override
    public String toString(){
        return super.toString() +
        "|La cantidad de alcohol que contiene es de: "+ procesador + "%"+ "\n"+ 
        "|Su edad para consumo es de: " + espacio + " anios" + "\n" + 
        "|Es proveniente de: " + RAM + pantalla ;
    }
}
