package Punto;

import java.awt.*;

public class Punto {
    private double x = 0;
    private double y = 0;

    public Punto() {

    }

    public void setX(int valor) {
        try {
            if (Math.abs(valor) >(int) ((Toolkit.getDefaultToolkit().getScreenSize().getWidth()) / 2)){
                throw new PuntoException("Valor invalido,está fuera de la pantalla");
            }
            this.x = valor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public double getX() {
        return this.x;
    }

    public void setY(int valor) {
        try {
            if (Math.abs(valor) >(int) ((Toolkit.getDefaultToolkit().getScreenSize().getHeight()) / 2)){
                throw new PuntoException("Valor invalido,está fuera de la pantalla");
            }
            this.y = valor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    public double getY() {
        return this.y;
    }

    @Override
    public String toString() {

        return ("Punto: " + "(" + x + "," + y + ")");
    }

    public void sumarCoor(int x2, int y2) {
        try {
            if (Math.abs(this.x+x2) >(int) ((Toolkit.getDefaultToolkit().getScreenSize().getWidth()) / 2)){
                throw new PuntoException("Suma invalida, el punto está fuera de la pantalla");
            }
            if (Math.abs(this.y+y2) >(int) ((Toolkit.getDefaultToolkit().getScreenSize().getHeight()) / 2)){
                throw new PuntoException("Suma invalida ,el punto está fuera de la pantalla");
            }
        this.x += x2;
        this.y += y2;
        } catch (PuntoException e) {
            System.out.println(e.getMessage());
        }
        
    }

    public void distanciaCoor(Double x2, Double y2) {
        try {
        double x1 = this.x;
        double y1 = this.y;
        double distancia = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("La distancia entre los dos puntos es: " + distancia);
        } catch (Exception e) {
            System.out.println("ERROR "+e.getMessage());
        }
        
    }

    public void setCentro() {
        try {
            this.x = (int) ((Toolkit.getDefaultToolkit().getScreenSize().getWidth()) / 2);
            this.y = (int) ((Toolkit.getDefaultToolkit().getScreenSize().getHeight()) / 2);
        } catch (Exception e) {
            System.out.println("ERROR "+e.getMessage());
        }
       

    }

}  
