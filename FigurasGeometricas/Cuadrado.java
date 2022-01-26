package FigurasGeometricas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cuadrado {
    private Double lado;
    private Punto centro;
    static Scanner tc = new Scanner(System.in);
    public Cuadrado() {
        try {
            System.out.println("Introduce el lado");
            this.lado = tc.nextDouble();
            this.centro = setCentroCuadrado();
        } catch (InputMismatchException e) {
            System.out.println("Error en la introducción de datos");
        }
      
    }

    public Cuadrado(Double l) {
        this.lado = l;
    }

    public void setLado(Double l) {
        this.lado = l;
    }

    public Double getLado() {
        return this.lado;
    }

    @Override
    public String toString() {
        return ("Los lados del cuadrado miden " + this.lado+" El centro es: "+ centro+" El area es: "+getArea()+" El perimetro es: "+getPerimetro()+" La diagonal es: "+getDiagonal());
    }

    public Double getArea() {
        Double area = Math.pow(this.lado, 2);
        return area;
    }

    public Double getPerimetro() {
        Double perimetro = this.lado * 4;
        return perimetro;
    }

    public Double getDiagonal() {
        Double diagonal = Math.sqrt((Math.pow(this.lado, 2) + (Math.pow(this.lado, 2))));
        return diagonal;
    }

    public Punto setCentroCuadrado(){
        Punto centroCuadrado = new Punto();
        return centroCuadrado;

    }
    public void moverCentro(Punto nuevo){
        this.centro.moverPunto(nuevo);
    }
    public void desplazarCentro(double x, double y){
        this.centro.sumarCoor(x, y);
    }
}