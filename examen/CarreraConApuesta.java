/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author casmarru
 */
import java.util.Scanner;
import java.util.Random;

public class CarreraConApuesta {

    public static void main(String[] args) throws InterruptedException {
        Scanner tc = new Scanner(System.in);
        Random r = new Random();
        String c1 = "";
        String c2 = "";
        String a1 = "1";
        String a2 = "2";
        String camino = "-";
        String fll = "|||";
        int apuesta;
        int i = 0;
        int meta = 0;
        int ganador;
        int fl;
        int recorrido;
        System.out.println("Introduce los caracteres para la carrera");
        String caract = tc.next();
        for (int j = 0; j < caract.length(); j++) {
            meta = meta + (int) caract.charAt(j);
        }
        System.out.println("LA meta está en" + meta);
        System.out.println("¿Quien crees que va a ganar?");
        System.out.println("1)Caballo 1");
        System.out.println("2)Caballo 2");
        System.out.println("3)Empatan");
        System.out.println("Introduzca su apuesta: ");
        apuesta = tc.nextInt();

        while (i == 0) {
            Thread.sleep(250);
            int avance = r.nextInt(3) + 1;
            switch (avance) {
                case 1:
                    c1 = c1 + a1 + a1;
                    c2 = c2 + a2;
                    System.out.print(c1);
                    for (recorrido = c1.length(); recorrido <= meta - 3; recorrido++) {
                        System.out.print(camino);
                    }
                    System.out.println("");
                    System.out.print(c2);
                    for (recorrido = c2.length(); recorrido <= meta - 3; recorrido++) {
                        System.out.print(camino);
                    }
                    System.out.println("");
                    System.out.println("");
                    break;
                case 2:
                    c1 = c1 + a1;
                    c2 = c2 + a2 + a2;
                    System.out.print(c1);
                    for (recorrido = c1.length(); recorrido <= meta - 3; recorrido++) {
                        System.out.print(camino);
                    }
                    System.out.println("");
                    System.out.print(c2);
                    for (recorrido = c2.length(); recorrido <= meta - 3; recorrido++) {
                        System.out.print(camino);
                    }
                    System.out.println("");
                    System.out.println("");
                    break;
                default:
                    c1 = c1 + a1;
                    c2 = c2 + a2;
                    System.out.print(c1);
                    for (recorrido = c1.length(); recorrido <= meta - 3; recorrido++) {
                        System.out.print(camino);
                    }
                    System.out.println("");
                    System.out.print(c2);
                    for (recorrido = c2.length(); recorrido <= meta - 3; recorrido++) {
                        System.out.print(camino);
                    } 
                    System.out.println("");
                    System.out.println("");
                    break;
            }
            if (c1.length() >= meta || c2.length() >= meta) {
                i++;
            }

        }
        if (c1.length() > c2.length()) {
            System.out.println("Ha ganado el Caballo 1");
            ganador = 1;
        } else if (c2.length() > c1.length()) {
            System.out.println("Ha ganado el caballo 2");
            ganador = 2;
        } else {
            System.out.println("Han empatado");
            ganador = 3;
        }
        if (apuesta == ganador) {
            System.out.println("Enhorabuena ha acertado");
        } else {
            System.out.println("Usted ha perdido la apuesta");
        }
    }

}
