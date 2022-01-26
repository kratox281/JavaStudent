package Punto;

import java.util.*;

class AppPunto {
    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Punto puntin = new Punto();
        System.out.println("Introduce x");
        puntin.setX(tc.nextInt());
        System.out.println("Introduce y");
        puntin.setY(tc.nextInt());

        System.out.println(puntin.toString());
        System.out.println("Cuanto quieres sumar a x?");
        int sumax = tc.nextInt();
        System.out.println("Cuanto quieres sumar a y?");
        int sumay = tc.nextInt();
        puntin.sumarCoor(sumax, sumay);
        System.out.println("Ahora punto es " + puntin.toString());
        System.out.println("Introduce otro punto para calcular la distancia");
        System.out.println("Introduce el x del segundo punto");
        double x2 = tc.nextInt();
        System.out.println("Introduce el y del segundo punto");
        double y2 = tc.nextInt();
        puntin.distanciaCoor(x2, y2);
        puntin.setCentro();
        System.out.println("El punto esta centrado y es " + puntin.toString());
        } catch (InputMismatchException e) {
            System.out.println("Error en la introducción de Datos");
        }
        
    }
 
} 
