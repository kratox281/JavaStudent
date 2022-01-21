/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mias;

/**
 *
 * @author casmarru
 */
public class Hasteunporro {

    static int hazte = 1;
    static int un = 1;
    static int porros = 1;
    static String haz = "Hazte un porro";
    static String unq = "¿Un qué?";
    static String unporro = "Un porro";
    static String green = "\033[32m";
    static String reset = "\u001B[0m";
    static String porrazo ="<";

    public static void main(String[] args) throws InterruptedException {

        int cont = 0;
        for (int l = 0; l < 1000; l++) {
            Thread.sleep(1500);
            switch (cont) {
                case 0:
                    System.out.println(haz);
                    System.out.println(unq);
                    System.out.println(unporro);
                    porrazo+="=";
                    System.out.println(green + porrazo + reset);
                    hazte++;
                    cont++;
                    break;
                case 1:
                    for (int j = 0; j < hazte; j++) {
                        System.out.println(haz);
                    }
                    hazte++;
                    System.out.println(unq);
                    System.out.println(unporro);
                    un++;
                    porrazo+="=";
                    System.out.println(green +porrazo + reset);
                    cont++;
                    
                    break;
                case 2:
                    for (int j = 0; j < hazte; j++) {
                        System.out.println(haz);
                    }
                    hazte++;
                    for (int j = 0; j < un; j++) {
                        System.out.println(unq);
                    }
                    un++;
                    System.out.println(unporro);
                    porros++;
                    porrazo+="=";
                    System.out.println(green + porrazo + reset);
                    cont++;
                    break;
                default:
                    for (int j = 0; j < hazte; j++) {
                        System.out.println(haz);
                    }
                    hazte++;
                    for (int j = 0; j < un; j++) {
                        System.out.println(unq);
                    }
                    un++;
                    for (int j = 0; j < porros; j++) {
                        System.out.println(unporro);
                    }
                    porros++;
                    porrazo+="=";
                    System.out.println(green + porrazo + reset);
                    break;
            }

        }
    }

}
