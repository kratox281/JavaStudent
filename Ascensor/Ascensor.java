package Ascensor;

import java.rmi.AccessException;
import java.util.InputMismatchException;
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
        setOcupacion(0);
        setPiso(0);
        setAlarma(false);
        setPuertas(false);
        
    }
    public Ascensor(){
        try{
        System.out.println("Introduce el numero de pisos que tiene el edificio");
        int np = tc.nextInt();
        System.out.println("Introduce la capacidad máxima del ascensor");
        double cap = tc.nextDouble();
       
        setPisos(np);
        setCapacidad(cap);
        setOcupacion(0);
        setPiso(0);
        setAlarma(false);
        setPuertas(false);
         }catch(InputMismatchException e){
            System.out.println("Error en los datos");
        }
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
        setPuertas(true);
    }
    public void cerrar() throws AscensorException{
        if(this.Puertas==false){
            throw new AscensorException("Ya estaban cerradas");
        }
        setPuertas(false);
    }
    public void entrar() throws AscensorException{
        if(this.Alarma){
            throw new AscensorException("La alarma está activada no se puede subir");
        }
        if(!this.Puertas){
            throw new AscensorException("No puedes entrar con la puerta cerrada, dale al botón de abrir");
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

    public void salir() throws AscensorException{
        if(this.Ocupacion==0){
            throw new AscensorException("COMO VAS A SALIR SI NO HAY NADIE");
        }
        if(!this.Puertas){
            throw new AscensorException("No puedes salir con las puertas cerradas");
        }
        if(this.Alarma){
            setAlarma(false);
        }
        setOcupacion(0);
    }

    public void activar() throws AscensorException{
        if(this.Alarma){
            throw new AscensorException("Ya estaba activada de antes");
        }
        setAlarma(true);
    }

    public void desactivar() throws AscensorException{
        if(!this.Alarma){
            throw new AscensorException("Ya estaba desactivada");
        }
        setAlarma(false);
    }

    public void mover() throws AscensorException, InterruptedException{
        if(this.Alarma){
            throw new AscensorException("Alarma activada no se puede mover el ascensor");
        }
        try{
        System.out.println("¿A qué piso quieres ir?");
         int  objetivo = tc.nextInt();
       
        if(objetivo<0){
            throw new AscensorException("No puedes bajar por debajo del 0");
        }
        if(objetivo>this.Pisos){
            throw new AscensorException("No existe ese piso");
        }
        if(objetivo == this.Piso){
            throw new AscensorException("Ya estás en el piso");
        }
        cerrar();
        if(objetivo>this.Piso){
            for(int i = this.Piso;i<objetivo;i++){
                Thread.sleep(500);
                this.Piso++;
                System.out.println(getPiso()+"º");
                System.out.println("*************************");
            }
        }else if(objetivo<this.Piso){
            for(int i = this.Piso;i>objetivo;i--){
                Thread.sleep(500);
                this.Piso--;
                System.out.println(getPiso()+"º");
                System.out.println("*************************");
        }
        }
        abrir(); 
        }catch(InputMismatchException e){
            System.out.println("Error en los datos");
        }
    }
}
