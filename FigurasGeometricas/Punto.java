package FigurasGeometricas;

import java.awt.*;
import java.util.*;

public class Punto {
    static Scanner tc = new Scanner(System.in);
    private double x = 0;
    private double y = 0;

    public Punto(Double x,Double y) {

    }

    public Punto(){
        System.out.println("introduce x");
        this.x = tc.nextDouble();
        System.out.println("Introduce y");
        this.y = tc.nextDouble();

    }

    public void setX(int valor) {
        this.x = valor;
    }

    public double getX() {
        return this.x;
    }

    public void setY(int valor) {
        this.y = valor;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public String toString() {

        return ("Punto: " + "(" + x + "," + y + ")");
    }

    public void sumarCoor(Double x2, Double y2) {
        this.x += x2;
        this.y += y2;
    }

    public void distanciaCoor(Double x2, Double y2) {

        double x1 = this.x;
        double y1 = this.y;
        double distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("La distancia entre los dos puntos es: " + distancia);
    }

    public void setCentro() {
        this.x = (int) ((Toolkit.getDefaultToolkit().getScreenSize().getWidth()) / 2);
        this.y = (int) ((Toolkit.getDefaultToolkit().getScreenSize().getHeight()) / 2);

    }

    public void moverPunto (Punto nuevo){
        this.x = nuevo.getX();
        this.y = nuevo.getY();
    }

}  
