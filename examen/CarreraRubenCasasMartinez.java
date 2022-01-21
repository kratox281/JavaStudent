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

public class CarreraRubenCasasMartinez {

    public static void main(String[] args) throws InterruptedException {
        Scanner tc = new Scanner(System.in);
        Random r = new Random();
        String c1 = "";
        String c2 = "";
        String a1 = "1";
        String a2 = "2";
        int i=0;
        int meta = 0;
        System.out.println("Introduce los caracteres para la carrera");
        String caract = tc.next();
        for (int j = 0; j < caract.length(); j++) {
            meta = meta + (int) caract.charAt(j);
        }
        System.out.println("LA meta está en" + meta);
        while(i==0){
            Thread.sleep(500);
            int avance = r.nextInt(3) + 1;
            switch (avance) {
                case 1:
                    c1 = c1 + a1 + a1;
                    c2 = c2 + a2;
                    System.out.println(c1);
                    System.out.println(c2);
                    System.out.println("");
                    break;
                case 2:
                    c1 = c1 + a1;
                    c2 = c2 + a2 + a2;
                    System.out.println(c1);
                    System.out.println(c2);
                    System.out.println("");
                    break;
                default:
                    c1 = c1 + a1;
                    c2 = c2 + a2;
                    System.out.println(c1);
                    System.out.println(c2);
                    System.out.println("");
                    break;
            }
            if (c1.length() == meta || c2.length() == meta) {
                i++;
            }

        }
        if (c1.length() > c2.length()) {
            System.out.println("Ha ganado el Caballo 1");
        } else if (c2.length() > c1.length()) {
            System.out.println("Ha ganado el caballo 2");
        } else {
            System.out.println("Han empatado");
        }
    }

}
