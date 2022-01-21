/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contraseñas;

/**
 *
 * @author Kratox
 */
public class Index {

    public static void main(String[] args) {
        //Es la clase en la que se va a ejecutar todo el programa
        boolean errorNom = true; //Define si hay algun error en la introduccion del nombre
        boolean errorDni = true; //Define si hay algun error en la introduccion del dni
        boolean errorFecha = true; //Define si hay algun error en la introducción de la fecha
        //Las variables en las que se van a guardar todos los datos necesarios para la ejecución del programa
        String nombre;
        String apellido1;
        String apellido2;
        String Dni;
        String fecha;
        //Llama a la funcion de solicitar el nombre hasta que el errorNom sea false
        do {
            nombre = SolicitarDatos.nombre();
            apellido1 = SolicitarDatos.apellido1();
            apellido2 = SolicitarDatos.apellido2();
            errorNom = Errores.errornombre(nombre, apellido1, apellido2); //Comprueba que la introduccion de datos ha sido correcta
        } while (errorNom == true);
        //Llama a la funcion de solicitar el DNI hasta que el errorDni sea false
        do {
            Dni = SolicitarDatos.dni();
            errorDni = Errores.errordni(Dni);//Comprueba que la introduccion de datos ha sido correcta
        } while (errorDni == true);
        //Llama a la funcion de solicitar la fecha hasta que el errorFecha sea false
        do{
            fecha = SolicitarDatos.fecha();
            errorFecha = Errores.errorfecha(fecha);//Comprueba que la introduccion de datos ha sido correcta
        } while (errorFecha == true);
        // Llama a la función para generar un nombre de usuario teniendo en cuenta los datos 
        // introducidos por el usuario
        String user = Generar.usuario(nombre, apellido1, apellido2);
        // Muestra al usuario el nombre de usuario generado por el programa
        System.out.println("Tu nombre de usuario es: " + user);
        
        int nDni = Integer.parseInt(Dni);//Convierte el String Dni a int para poder operar
        char letra = Generar.letradni(nDni);//Empleando el metodo letradni obtiene el caracter del dni
        //Gernera las contraseñas empleando los tres metodos distintos
        String mecanico = Generar.mecanico();
        String idea = Generar.idea(nombre, apellido1, apellido2, letra, Dni, fecha);
        String algoritmo = Generar.algoritmos();
        String gs;//Es la variable en la que se guarda el grado de seguridad de cada contraseña
        //Comprueba la seguridad de cada contraseña y le muestra al usuario cada contraseña junto a su grado de seguridad
        gs = ComprobacionSeguridad.seguridad(mecanico);
        System.out.println("La contraseña generada por un medio mecanico es: " + mecanico + " y " + gs);
        gs = ComprobacionSeguridad.seguridad(algoritmo);
        System.out.println("La contraseña generada por el algoritmo es: " + algoritmo + " y " + gs);
        gs = ComprobacionSeguridad.seguridad(idea);
        System.out.println("La contraseña generada por el metodo de Macarena es: " + idea + " y " + gs);

    }
}
