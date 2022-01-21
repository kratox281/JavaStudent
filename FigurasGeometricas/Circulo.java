package FigurasGeometricas;

import java.util.*;

public class Circulo {
    static Scanner tc = new Scanner(System.in);
    private Double radio;
    private Punto centro;

    public Circulo() {
        System.out.println("Introduce el radio");
        this.radio = tc.nextDouble();
        this.centro = setCentroCirculo();
    }

    public Circulo(Double r) {
        this.radio = r;
    }

    public void setRadio(Double r) {
        this.radio = r;
    }

    public Double getRadio() {
        return this.radio;
    }

    @Override
    public String toString() {
        return ("El radio es:" + this.radio+" El centro es: "+ centro+" El area es: "+getArea()+" El perimetro es: "+getPerimetro());
    }

    public Double getArea(){
        Double area = Math.PI * Math.pow(this.radio, 2);
        return area;
    }

    public Double getPerimetro(){
        Double perimetro = 2 * Math.PI * this.radio;
        return perimetro;
    }

    public Punto setCentroCirculo(){
        Punto centroCirculo = new Punto();
        return centroCirculo;

    }

    public void moverCentro(Punto nuevo){
        this.centro.moverPunto(nuevo);
    }

    public void desplazarCentro(double x, double y){
        this.centro.sumarCoor(x, y);
    }
}
