/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contraseñas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author casmarru
 */
public class Errores {
//En esta clase se encuentran todos los metodos que comprueban si ha habido algun error en la introduccion de datos 
//    y se lo comunica al usuario

   static String red = "\033[31m";
   static String reset = "\u001B[0m";

    public static boolean errornombre(String a, String b, String c) {
        //Comprueba si ha ocurrido algun error en la introduccin del nombre y los apellidos
        boolean error = true;
        if (a.length() < 3 || b.length() < 2 || c.length() < 2) {
            //En caso de que los datos no sean validos muestra este mensaje
            System.out.println(red+"========================================================================");
            System.out.println("Ha habido un error con los datos introducidos");
            System.out.println("Pruebe a rellenar con numeros hasta cumplimentar con la longitud minima"
                    + " o utilizar otros datos");
            System.out.println("Nombre:3 caracteres || Apellidos: 2 caracteres");
            System.out.println("========================================================================"+reset);
        } else {
            error = false;
        }
        return error;
    }

    public static boolean errordni(String a) {
        //Comprueba si ha ocurrido algun error en la introduccin del DNI
        boolean error;
        if (a.length() < 8 || a.length() >= 9) {
            //En caso de que los datos no sean validos muestra este mensaje
            System.out.println(red+"=================================================");
            System.out.println("Ha habido un error con los datos introducidos");
            System.out.println("Pruebe a introducir correctamente el Dni");
            System.out.println("El DNI  tiene que tener exactamente 8 dígitos");
            System.out.println("================================================="+reset);
            error = true;
        } else {
            error = false;
        }
        try {//Comprueba que el usuario no haya introducido ningun caracter no permitido
            Integer.parseInt(a);
        } catch (NumberFormatException exception) {
            error = true;
        }
        return error;
    }

    public static boolean errorfecha(String fecha) {
        //Comprueba si ha ocurrido algun error en la introduccin de la fecha
        boolean error = false;
        try {//Intenta hacer un parse, en caso de error se pide de nuevo la fecha
            SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
            date.setLenient(false);
            Date fechaInicio = date.parse(fecha);
            Date fechaminima= new Date(1900);
            Date fechaActual = new Date(System.currentTimeMillis());
            if (fechaInicio.after(fechaActual) || fechaInicio.equals(fechaActual)) {// Comprueba que la fecha no sea posterior a la de hoy
                error = true;
            }
            if (fechaInicio.before(fechaminima) || fechaInicio.equals(fechaminima)) {//Comprueba que la fecha no sea anterior al 1900
                error = true;
            }

        } catch (ParseException ex) {
            error = true;

        }
        if (error == true) {
            //En caso de que los datos no sean validos muestra este mensaje
            System.out.println(red+"=================================================");
            System.out.println("Ha habido un error con los datos introducidos");
            System.out.println("Pruebe a introducir una fecha valida");
            System.out.println("================================================="+reset);
        }

        return error;

    }
}
