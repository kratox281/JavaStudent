package ServicioTelematico;

public class usuario2 extends usuario{
    public usuario2(int s,String dni,String nombre){
        super(s, dni, nombre);
    }
    
    public void conexion(int s){
       
    }
    @Override
    public double importe(){
        double precio  = this.tiempoConex * 0.01;
        precio = ofertas.oferta2(precio, d);
        return precio;
    }
    public void reset(){
        
    }
}
