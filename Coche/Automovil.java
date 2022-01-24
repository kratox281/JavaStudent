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
    private int Capacidad; //gente que cabe en el coche
    private double Deposito;
    private double CapacidadDeposito;
    private int pasajeros;
    private boolean Arrancado;

    public Automovil(String matricula, int capacidad, int vmax, double capmax) {
        this.Matrícula = matricula;
        this.Capacidad = capacidad;
        this.VelocidadMaxima = vmax;
        this.CapacidadDeposito = capmax;
    }

    public Automovil() {
        System.out.println("Introduce la marca");
        this.Marca  = tc.nextLine();
        System.out.println("Introduce el modelo");
        this.Modelo  = tc.nextLine();
        System.out.println("Introduce la matricula");
        this.Matrícula = tc.nextLine();
        System.out.println("Introduce las personas que caben");
        this.Capacidad = tc.nextInt();
        System.out.println("Introduce la velocidad maxima");
        this.VelocidadMaxima = tc.nextInt();
        System.out.println("Introduce la capacidad del deposito");
        this.CapacidadDeposito = tc.nextDouble();
        this.Velocidad = 0;
        this.pasajeros = 0;
        this.Deposito = this.CapacidadDeposito;
        this.Arrancado = false;
        
    }

    public void setMatricula() {
        this.Matrícula = tc.nextLine();
    }

    public void setMarca() {
        this.Marca = tc.nextLine();
    }

    public void setModelo() {
        this.Modelo = tc.nextLine();
    }

    public void setPotencia() {
        this.Potencia = tc.nextInt();
    }

    public void setVelocidad() {
        this.Velocidad = tc.nextInt();
    }

    public void setVelocidadMaxima() {
        this.VelocidadMaxima = tc.nextInt();
    }

    public void setCapacidad() {
        this.Capacidad = tc.nextInt();
    }

    public void setDeposito() {
        this.Deposito = tc.nextDouble();
    }

    public void setCapacidadDeposito() {
        this.CapacidadDeposito = tc.nextDouble();
    }

    public void setArrancado() {
        this.Arrancado = tc.nextBoolean();
    }

    public String getMatricula() {
        return this.Matrícula;
    }

    public String getMarca() {
        return this.Marca;
    }

    public String getModelo() {
        return this.Modelo;
    }

    public int getPotencia() {
        return this.Potencia;
    }

    public int getVelocidad() {
        return this.Velocidad;
    }

    public int getVelocidadMaxima() {
        return this.VelocidadMaxima;
    }

    public int getCapacidad() {
        return this.Capacidad;
    }

    public double getDeposito() {
        return this.Deposito;
    }

    public double getCapacidadDeposito() {
        return this.CapacidadDeposito;
    }

    public boolean getArrancado() {
        return this.Arrancado;
    }
    public int getPasajeros(){
        return this.pasajeros;
    }

    @Override
    public String toString(){
        String estado = "La velocidad es: "+this.Velocidad+" y la velocidad maxima es: "+this.VelocidadMaxima+
        ", los pasajeros maximos son: "+this.Capacidad+" y hay: "+this.pasajeros+
        ", el deposito es de: "+this.CapacidadDeposito+"L y quedan "+this.Deposito+"L "  ;
        return estado;
    }
    public void arrancar() {
        if (pasajeros == 0) {
            System.out.println("Tiene que haber alguien en el coche");
        } else {
            Detallitos.surprise();
            this.Arrancado = true;
            System.out.println("El coche ya está arrancado");
            System.out.println(this.toString());
        }
    }

    public void detener() {
        if (this.Velocidad > 0) {
            System.out.println("Frena antes hasta 0");
        } else {
            this.Arrancado = false;
            this.Velocidad = 0;
            System.out.println(this.toString());
        }
    }

    public void repostar() {
        if (Arrancado) {
            Detallitos.surprise();
            System.out.println("Apaga el coche antes");
        } else {
            if (Deposito == CapacidadDeposito) {
                System.out.println("El deposito está lleno");
            }else{
            this.Deposito = this.CapacidadDeposito;
            System.out.println(this.toString());
        }
        }
    }

    public void acelerar() {
        if (this.Arrancado) {
            if(this.Deposito > 0.5 && this.Velocidad+10 < this.VelocidadMaxima){
                Detallitos.surprise();
            this.Velocidad += 10;
            this.Deposito -= 0.5;
            System.out.println(this.toString());
            Detallitos.acelerador();
            }else{
                System.out.println("No se puede acelerar más");
            }
    }else {
        System.out.println("Arranca el coche primero");
    }
    }

    public void decelerar() {
        if (Velocidad == 0) {
            System.out.println("No puedes bajar más la velocidad");
        } else {
            this.Velocidad -= 5;
            System.out.println(this.toString());
        }
    }

    public void entrar() {
        if (pasajeros < this.Capacidad) {
            this.pasajeros++;
            System.out.println(this.toString());
        } else {
            System.out.println("No cabe más gente");
        }
    }

    public void salir() {
        if (pasajeros < 1){
            System.out.println("No hay nadie para salir");
        }else{
            this.pasajeros--;
            System.out.println(this.toString());
        }
        
    }
}
