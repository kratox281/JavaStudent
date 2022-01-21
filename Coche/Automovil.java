package Coche;

import java.util.Scanner;

public class Automovil {
    static Scanner tc = new Scanner(System.in);
    private String Matrícula;
    private String Marca;
    private String Modelo;
    private int Potencia;
    private int Velocidad;
    private int VelocidadMaxima;
    private int Capacidad;
    private double Deposito;
    private double CapacidadDeposito;
    private int pasajeros;   
    private boolean Arrancado;


    public Automovil(String matricula, int capacidad, int vmax, double capmax){
        this.Matrícula = matricula;
        this.Capacidad = capacidad;
        this.VelocidadMaxima = vmax;
        this.CapacidadDeposito = capmax;
    }

    public Automovil(){
        System.out.println("Introduce la matricula");
        this.Matrícula = tc.nextLine();
        System.out.println("Introduce las personas que caben");
        this.Capacidad = tc.nextInt();
        System.out.println("Introduce la velocidad maxima");
        this.VelocidadMaxima = tc.nextInt();
        System.out.println("Introduce la capacidad del deposito");
        this.CapacidadDeposito = tc.nextDouble();
    }

    public void setMatricula(){
        this.Matrícula = tc.nextLine();
    }
    public void setMarca(){
        this.Marca = tc.nextLine();
    }
    public void setModelo(){
        this.Modelo = tc.nextLine();
    }
    public void setPotencia(){
        this.Potencia = tc.nextInt();
    }
    public void setVelocidad(){
        this.Velocidad = tc.nextInt();
    }
    public void setVelocidadMaxima(){
        this.VelocidadMaxima = tc.nextInt();
    }
    public void setCapacidad(){
        this.Capacidad = tc.nextInt();
    }
    public void setDeposito(){
        this.Deposito = tc.nextDouble();
    }
    public void setCapacidadDeposito(){
        this.CapacidadDeposito = tc.nextDouble();
    }
    public void setArrancado(){
        this.Arrancado = tc.nextBoolean();
    }

    public String getMatricula(){
        return this.Matrícula;
    }
    public String getMarca(){
        return this.Marca;
    }
    
    public String getModelo(){
        return this.Modelo;
    }
    public int getPotencia(){
        return this.Potencia;
    }
    public int getVelocidad(){
        return this.Velocidad;
    }
    public int getVelocidadMaxima(){
        return this.Velocidad;
    }
    public int getCapacidad(){
        return this.Capacidad;
    }
    public double getDeposito(){
        return this.Deposito;
    }
    public double getCapacidadDeposito(){
        return this.CapacidadDeposito;
    }
    public boolean getArrancado(){
       return this.Arrancado;
    }

    public void arrancar(){
        if(pasajeros == 0){
            System.out.println("Tiene que haber alguien en el coche");
        }
        else{
        this.Arrancado = true;
        }
    }

    public void detener(){
        this.Arrancado = false;
        this.Velocidad= 0;
    }

    public void repostar(){
        this.Deposito = this.CapacidadDeposito;
    }

    public void acelerar(){
        if(this.Arrancado){
        this.Velocidad += 10;
        this.Deposito -= 0.5;
        }
        else{
            System.out.println("Arranca el coche primero");
        }
    }

    public void decelerar(){
        if(Velocidad == 0){
            System.out.println("No puedes bajar más la velocidad");
        }
        else{
        this.Velocidad -=5;
        }
    }

    public void entrar(){
        if(pasajeros<this.Capacidad-1){
        this.pasajeros++;
        }
        else{
            System.out.println("No cabe más gente");
        }
    }

    public void salir(){
        this.pasajeros--;
    }
}
