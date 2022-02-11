package Productos;

public class Producto {
    protected String nombre;
    protected String id;
    protected double precio;
    public Producto(String n,String id,double pr){
        setId(id);
        setNombre(n);
        setPrecio(pr);
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    @Override
    public String toString() {
        return "El producto con id "+getId()+" "+getNombre()+" tiene un coste de "+getPrecio()+"€" ;
    }
}
