package Ascensor;

    import java.util.Scanner;

public class Ascensor{
    static Scanner tc = new Scanner(System.in);
    private int Piso;
    private int Pisos;
    private boolean Puertas;
    private boolean Alarma;
    private double Capacidad;
    private double Ocupacion;   

    public Ascensor(int np,double cap){
        setPisos(np);
        setCapacidad(cap);
        this.Ocupacion=0;
    }

    public void setPisos(int n){
        this.Pisos = n;
    }
    public void setPiso(int n){
        this.Piso = n;
    }
    public void setPuertas(Boolean b){
        this.Puertas = b;
    }
    public void setAlarma(Boolean b){
        this.Alarma = b;
    }
    public void setCapacidad(double d){
        this.Capacidad = d;
    }
    public void setOcupacion(double d){
        this.Ocupacion = d;
    }

    public int getPisos(){
        return this.Pisos;
    }
    public int getPiso(){
        return this.Piso;
    }
    public boolean getPuertas(){
        return this.Puertas;
    }
    public boolean getAlarma(){
        return this.Alarma;
    }
    public double getCapacidad(){
        return this.Capacidad;
    }
    public double getOcupacion(){
        return this.Ocupacion;
    }
    @Override
    public String toString(){

        return "Estas en el piso "+getPiso()+", aun tiene capacidad para "+(getCapacidad()-getOcupacion())+"kg";
    }

    public void abrir() throws AscensorException{
        if(this.Puertas){
            throw new AscensorException("Ya estaban abiertas");
        }
        this.Puertas = true;
    }
    public void cerrar() throws AscensorException{
        if(this.Puertas==false){
            throw new AscensorException("Ya estaban cerradas");
        }
        this.Puertas = false;
    }
    public void entrar() throws AscensorException{
        if(Alarma){
            throw new AscensorException("La alarma está activada no se puede subir");
        }
        Persona pasajero  = new Persona();
        System.out.println("Cuanto pesa la nueva persona?");
        double peso = tc.nextDouble();
        pasajero.setPeso(peso);
        if(this.Ocupacion+pasajero.getPeso()>getCapacidad()){
            setAlarma(true);
        }
        this.Ocupacion+=pasajero.getPeso();
        
        
    }
}
