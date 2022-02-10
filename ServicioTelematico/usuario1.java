package ServicioTelematico;

public class usuario1 extends usuario{
    public usuario1(int s,String dni,String nombre){
        super(s, dni, nombre);
    }
    @Override
    public void conexion(int s){
        this.tiempoConex= ofertas.oferta1(s);
    }
    
}
