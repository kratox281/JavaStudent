package herencia;

public class programador extends empleado{
    public programador(){
        super();
        System.out.println("Especificamente un programador");
    }
    private double horas;
    private double precioHora;

    public void setHoras(){

    }

    public void setPrecioHora(){

    }
    public double getHoras(){
        return this.horas;
    }
    public double getPrecioHora(){
        return this.precioHora;
    }
}
