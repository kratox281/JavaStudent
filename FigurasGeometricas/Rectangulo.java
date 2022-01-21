package FigurasGeometricas;

import java.util.Scanner;

public class Rectangulo {
    private Double ancho;
    private Double alto;
    private Punto centro;
    static Scanner tc = new Scanner(System.in);
    public Rectangulo() {
        System.out.println("Introduce el ancho");
        this.ancho = tc.nextDouble();
        System.out.println("Introduce el alto");
        this.alto = tc.nextDouble();
        this.centro = setCentroRectangulo();
    }

    public Rectangulo(Double b, Double a) {
        this.ancho = b;
        this.alto = a;
    }

    public void setAncho(Double b) {
        this.ancho = b;
    }

    public Double getAncho() {
        return this.ancho;
    }

    public void setAlto(Double a) {
        this.alto = a;
    }

    public Double getAlto() {
        return this.alto;
    }

    @Override
    public String toString() {
        return ("EL ancho es: " + this.ancho + " y el alto es: " + this.alto+" El centro es: "+ centro+" El area es: "+getArea()+" El perimetro es: "+getPerimetro()+" La diagonal es: "+getDiagonal());
    }

    public Double getArea(){
        Double area = this.ancho*this.alto;
        return area;
    }

    public Double getPerimetro(){
        Double perimetro = (this.ancho*2)*(this.alto*2);
        return perimetro;
    }

    public Double getDiagonal(){
        Double diagonal = Math.sqrt((Math.pow(this.alto, 2))+(Math.pow(this.ancho, 2)));
        return diagonal;
    }

    public Punto setCentroRectangulo(){
        Punto centroRectangulo = new Punto();
        return centroRectangulo;

    }
    public void moverCentro(Punto nuevo){
        this.centro.moverPunto(nuevo);
    }
    public void desplazarCentro(double x, double y){
        this.centro.sumarCoor(x, y);
    }
}     
