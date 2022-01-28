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
        try {
            System.out.println("introduce x");
            this.x = tc.nextDouble();
            System.out.println("Introduce y");
            this.y = tc.nextDouble();
            if(Math.abs(this.x)>((Toolkit.getDefaultToolkit().getScreenSize().getWidth()) / 2)){
                throw new PuntoException("Está fuera de la pantalla");
            }
            if(Math.abs(this.y)>((Toolkit.getDefaultToolkit().getScreenSize().getHeight()) / 2)){
                throw new PuntoException("Está fuera de la pantalla");
            }
        } catch (Exception e) {
            System.out.println("Error en la introduccion de datos");
        }
      

    }

    public void setX(int valor) {
        this.x = valor;try {
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
            if (Math.abs(valor) > ((Toolkit.getDefaultToolkit().getScreenSize().getHeight()) / 2)){
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

    public void sumarCoor(Double x2, Double y2) {
        try {
            if (Math.abs(this.x+x2) > ((Toolkit.getDefaultToolkit().getScreenSize().getWidth()) / 2)){
                throw new PuntoException("Suma invalida, el punto está fuera de la pantalla");
            }
            if (Math.abs(this.y+y2) > ((Toolkit.getDefaultToolkit().getScreenSize().getHeight()) / 2)){
                throw new PuntoException("Suma invalida ,el punto está fuera de la pantalla");
            }
        this.x += x2;
        this.y += y2;
        } catch (PuntoException e) {
            System.out.println(e.getMessage());
        }
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
        try{
        if (Math.abs(nuevo.getX()) >(int) ((Toolkit.getDefaultToolkit().getScreenSize().getWidth()) / 2)){
            throw new PuntoException("El punto nuevo está fuera de la pantalla");
        }
        if (Math.abs(nuevo.getY()) >(int) ((Toolkit.getDefaultToolkit().getScreenSize().getHeight()) / 2)){
            throw new PuntoException("El punto nuevo está fuera de la pantalla");
        }
        this.x = nuevo.getX();
        this.y = nuevo.getY();
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }

}  
