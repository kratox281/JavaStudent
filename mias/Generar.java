/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mias;

/**
 *
 * @author casmarru
 */
import java.util.Random;

public class Generar {

    static Random r = new Random();
    static String tabla[][] = 
   {{"a", "b", "c", "d", "e", "f"},
    {"g", "h", "i", "j", "k", "l"},
    {"m", "n", "o", "p", "q", "r"},
    {"s", "t", "u", "v", "w", "x"},
    {"y", "z", "0", "1", "2", "3"},
    {"4", "5", "6", "7", "8", "9"}};
    static String tablaAlt[][] = 
   {{"A", "B", "C", "D", "E", "F"},
    {"G", "H", "I", "J", "K", "L"},
    {"M", "N", "O", "P", "Q", "R"},
    {"S", "T", "U", "V", "W", "X"},
    {"Y", "Z", "=", "!", "@", "#"},
    {"$", "%", "&", "/", "(", ")"}};

    public static String contraseña() {
        int caracteres = r.nextInt(8) + 2;
        String contraseña = "";
        for (int i = 0; i <= caracteres; i++) {
            int d1 = r.nextInt(6);
            int d2 = r.nextInt(6);
            int mon = r.nextInt(2);
            if (mon == 1) {
                contraseña += tablaAlt[d1][d2];
            } else {
                contraseña += tabla[d1][d2];
            }

        }

        return contraseña;
    }

    public static void main(String[] args) {
        System.out.println(contraseña());
    }
}
