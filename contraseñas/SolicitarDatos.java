/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contraseñas;

/**
 *
 * @author Kratox
 */
import java.util.Scanner;

public class SolicitarDatos {
// Esta clase almacena los metodos utilizados por el main para la introduccion de datos del usuario

    public static Scanner tc = new Scanner(System.in);//La variable del teclado

    public static String nombre() {
        //Este metodo pide al usuario el nombre
        System.out.println("Introduce tu nombre:");
        String datos = tc.nextLine();
        // Elimina todos los espacios que haya podido introducir el usuario para el correcto funcionamiento del programa
        datos = datos.replaceAll(" ", "");
        return datos;
    }

    public static String apellido1() {
        //Este metodo pide al usuario el primer apellido
        System.out.println("Introduce tu primer apellido:");
        String datos = tc.nextLine();
        // Elimina todos los espacios que haya podido introducir el usuario para el correcto funcionamiento del programa
        datos = datos.replaceAll(" ", "");
        return datos;
    }

    public static String apellido2() {
        // Este metodo pide al usuario el segundo apellido
        System.out.println("Introduce tu segundo apellido:");
        String datos = tc.nextLine();
        // Elimina todos los espacios que haya podido introducir el usuario para el correcto funcionamiento del programa
        datos = datos.replaceAll(" ", "");
        return datos;
    }

    public static String dni() {
        //Este metodo pide al usuario el numero del dni, solo el numero
        System.out.println("Introduce tu DNI sin la letra:");
        String datos = tc.nextLine();
        return datos;
    }

    public static String fecha() {
        // Este metodo pide al usuario la fecha de su nacimiento.
        System.out.println("Introduce tu fecha de nacimiento en formato dd/MM/yyyy");
        String Dateinicio = tc.nextLine();
        Dateinicio = Dateinicio.replaceAll(" ", "");

        return Dateinicio;
    }
}
