package FigurasGeometricas;

import java.util.Scanner;

public class Triangulo {
    private Double base;
    private Double altura;
    private Punto centro;
    static Scanner tc = new Scanner(System.in);
    public Triangulo() {
        System.out.println("Introduce la base");
        this.base = tc.nextDouble();
        System.out.println("Introduce la altura");
        this.altura = tc.nextDouble();
        this.centro = setCentroTriangulo();
    }

    public Triangulo(Double b, Double a) {
        this.base = b;
        this.altura = a;
    }

    public void setBase(Double b) {
        this.base = b;
    }

    public Double getBase() {
        return this.base;
    }

    public void setAltura(Double a) {
        this.altura = a;
    }

    public Double getAltura() {
        return this.altura;
    }

    @Override
    public String toString() {
        return ("La base es: " + this.base + " y la altura es: " + this.altura+" El centro es: "+ centro+" El area es: "+getArea()+" El perimetro es: "+getPerimetro());
    }

    public Double getArea() {
        Double area = ((this.altura * this.base) / 2);
        return area;
    }

    public Double getLado() {

        Double lado = Math.sqrt((Math.pow(this.altura, 2)) + (Math.pow(this.base, 2) / 4));
        return lado;

    }

    public Double getPerimetro() {
        Double lado = getLado();
        Double perimetro = (lado * 2) + this.base;
        return perimetro;
    }

    public Punto setCentroTriangulo(){
        Punto centroTriangulo = new Punto();
        return centroTriangulo;

    }
    public void moverCentro(Punto nuevo){
        this.centro.moverPunto(nuevo);
    }
    public void desplazarCentro(double x, double y){
        this.centro.sumarCoor(x, y);
    }

}
