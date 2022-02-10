package ServicioTelematico;

public class usuario2 extends usuario{
    protected double descuento;
    public usuario2(int s,String dni,String nombre,double d){
        super(s, dni, nombre);
        this.descuento = d;
    }
    
    public double porcentajeDescuento(){
        return this.descuento/100;
    }
    @Override
    public double importe(){
        double precio  = this.tiempoConex * 0.01;
        precio = ofertas.oferta2(precio, porcentajeDescuento());
        return precio;
    }
}
