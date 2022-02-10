package ServicioTelematico;

public class usuario implements operaciones{
    protected String dni;
    protected String nombre;
    protected int tiempoConex;
    public usuario(int s,String dni,String nombre){
        this.tiempoConex = s;
        this.dni = dni;
        this.nombre = nombre;

    }
    public void conexion(int s){

    }
    public double importe(){
        double precio  = this.tiempoConex * 0.01;
        return precio;
    }
    public void reset(){
        this.tiempoConex = 0;
    }
}
