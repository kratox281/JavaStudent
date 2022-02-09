package ServicioTelematico;

public class usuario1 extends usuario{
    public usuario1(int s,String dni,String nombre){
        super(s, dni, nombre);
    }
    @Override
    public void conexion(int s){
        this.tiempoConex= ofertas.oferta1(s);
    }
    public double importe(){
        double precio  = this.tiempoConex * 0.01;
        return precio;
    }
    public void reset(){
        
    }
    
}
