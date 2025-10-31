package tiendavirtual;

public class cuidado_personal extends Producto {
    private String nombre;
   private double precio;
   private int stock;
   //2. Constructor: Tiene el mismo nombre de la clase.
   //Se sobrecarga
   //Los parametros deben ser los atributos
   //Recibo parametro y los guardo en mis variables( son mis atributos)
   public cuidado_personal(String nombre,
                           String codigo,
                           double precio,
                           int stock){
       
       super(nombre,codigo,precio, stock);
        this.nombre= nombre;
        this.precio= precio;
        this.stock= stock;
    }
    
    
 @Override  
   public String getNombre(){
       return nombre;
   }
 @Override    
   public void setNombre(String nombre){
       this.nombre= nombre;
   }
    @Override 
    public double getPrecio(){
       return precio;
   }
    @Override 
   public void setPrecio( double precio){
       this.precio=precio; 
   }
    @Override 
   public int getStock(){
       return stock;
   }
    @Override 
   public void setStock( int stock){
       this.stock=stock; 
   }
   
@Override
   public String toString(){
       return 
       "|El nombre del producto: "+ nombre + "\n"+
       "|Tiene un precio: $" + precio + "\n"+
       "|Hay " +stock + " cantidades en stock";
   }
}
