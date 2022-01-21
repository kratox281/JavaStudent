/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contraseñas;

/**
 *
 * @author casmarru
 */
public class ComprobacionSeguridad {
//Esta clase almacena el metodo que comprueba la seguridad de las contraseñas

    public static String seguridad(String contraseña) {
        boolean mayus = false;
        boolean caract = false;
        String red = "\033[31m";
        String green = "\033[32m";
        String yellow = "\033[33m";
        String reset = "\u001B[0m";
        String grado = "";
        if (contraseña.length() > 6) {//En funcion de la longitud determina si es poco segura o entra a valorar si es muy segura
            for (int i = 0; i < contraseña.length(); i++) {//Comprueba si tiene alguna mayuscula
                char compru = contraseña.charAt(i);
                Character ch = compru;
                if (Character.isUpperCase(ch)) {
                    mayus = true;
                }
            }
            for (int i = 0; i < contraseña.length(); i++) {//Comprueba si contiene algún caracter especial.
                char compru = contraseña.charAt(i);
                Character ch = compru;
                if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {

                } else {
                    caract = true;
                }
            }

        } else {
            grado = red + "Es debil" + reset;
        }
        //En funcion de las condiciones que se cumplan determina la seguridad
        if (mayus == true) {
            grado = yellow + "Es segura" + reset;
        }
        if (mayus == true && caract == true) {
            grado = green + "Es muy segura" + reset;
        }
        return grado;
    }

}
