/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contraseñas;

/**
 *
 * @author Kratox
 */
import java.security.SecureRandom;
import java.util.Random;

public class Generar {
//Esta clase almacena todos los metodos que emplea el main para generar elementos
    public static Random aleatorio = new Random();

    public static String usuario(String nombre, String apellido1, String apellido2) {
        //Genera el nombre de usuario basandose en el nombre y apellidos
        String usuario;
        usuario = "" + apellido1.toLowerCase().charAt(0)
                + apellido1.toLowerCase().charAt(1)
                + apellido2.toLowerCase().charAt(0)
                + apellido2.toLowerCase().charAt(1)
                + nombre.toLowerCase().charAt(0)
                + nombre.toLowerCase().charAt(1)
                + nombre.toLowerCase().charAt(2);
        return usuario;
    }

    public static String mecanico() {
        //Genera una contraseña en funcion del resultado de dos tiradas de dados y un lanzamiento de moneda
        String caracteres = "abcdefghijklmnopqrstuvwxyz0123456789";//Almacena los caracteres que emplea en caso de que la moneda sea cara
        String caracteresAlt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ=!@#$%&/()";//Almacena los caracteres que emplea en caso de que la moneda sea cruz
        String mecanico = "";
        int veces = aleatorio.nextInt(4) + 4;
        for (int i = 0; i <= veces; i++) {
            int d1 = aleatorio.nextInt(6) + 1;
            int d2 = aleatorio.nextInt(6) + 1;
            int moneda = aleatorio.nextInt(2);
            if (moneda == 0) {
                //d1 define la fila y d2 define la columna, por lo que escribe el caracter basandose en una tablas de 6x6
                mecanico += caracteres.charAt(((6 * (d1 - 1)) + (d2)) - 1);
            } else {
                mecanico += caracteresAlt.charAt(((d1 - 1) + (d2)));
            }
        }
        return mecanico;
    }

    public static String algoritmos() {
        SecureRandom sr = new SecureRandom();
        String algoritmos = "";
        int veces = sr.nextInt(4) + 4;
        //Basandose en un numero aleatorio escoge un caracter y lo repite un numero aleatorio de veces entre 4 y 8
 String caracteres = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ=!@#$%&/()";
        for (int i = 0; i <= veces; i++) {
            int select = sr.nextInt(72);
           
            algoritmos += caracteres.charAt(select);
        }

        return algoritmos;
    }

    public static String idea(String nombre, String apellido1, String apellido2, char letra, String Dni, String fecha) {
        String idea;
        //Crea una contraseña basandose en los datos personales introducidos por el usuario
        int veces = aleatorio.nextInt(5);
        idea = "" + nombre.toUpperCase().charAt(0)
                + apellido1.toLowerCase().charAt(apellido1.length() - 1)
                + Dni.charAt(6) + Dni.charAt(7);
        for (int i = 0; i <= veces; i++) {
            switch (i) {
                case 0 -> {
                }
                case 1 ->
                    idea += letra;
                case 2 ->
                    idea += fecha.charAt(fecha.length() - 2);
                case 3 ->
                    idea += fecha.charAt(fecha.length() - 1);
                case 4 -> {
                    int caractR = aleatorio.nextInt(10);
                    String especiales = "!@#$%&/()=";
                    idea += especiales.charAt(caractR);
                }
            }
        }
        return idea;
    }

    public static char letradni(int dni) {
        //Basandose en el numero del dni obtiene la letra del mismo
        char letra;
        int r = dni % 23;
        String letras = "trwagmyfpdxbnjzsqvhlcke";
        letra = letras.toUpperCase().charAt(r);
        return letra;
    }
}
