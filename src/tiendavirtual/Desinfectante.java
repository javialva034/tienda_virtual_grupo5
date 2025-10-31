package tiendavirtual;


public class Desinfectante extends Limpieza {
    private String areaUso;
    private double gradosAlcohol;
    private boolean eliminaBacterias;
    
    public Desinfectante (String nombre,
                          String codigo,
                          double precio,
                          int stock,
                          String areaUso,
                          double gradosAlcohol,
                          boolean eliminaBacterias){
        super(nombre, codigo, precio, stock, areaUso, eliminaBacterias, gradosAlcohol);
        this.areaUso = areaUso;
        this.gradosAlcohol = gradosAlcohol;
        this.eliminaBacterias = eliminaBacterias;
    }
    public String getAreaUso(){
        return areaUso;
        }
    public void setAreaUso(String areaUso){
        this.areaUso = areaUso;
    }
    public double getGradosAlcohol(){
        return gradosAlcohol;
    }
    public void setGradosAlcohol(double gradosAlcohol){
        this.gradosAlcohol = gradosAlcohol;
    }
    public boolean getEliminaBacterias(){
        return eliminaBacterias;
    }
    public void setEliminaBacterias(boolean eliminaBacterias){
        this.eliminaBacterias = eliminaBacterias;
    }
}
