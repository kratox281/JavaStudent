package LecturaEscritura;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Primer Ejemplo
public class Clase1 {
    //Vamos a trabajar con Java.io
    //Y vamos a utilizar la clase File
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String ruta="";
        try {
        do {
            System.out.println("Introduce la ruta");
            System.out.println("Enter para finalizar");
            ruta=tc.nextLine();

            if(!ruta.isBlank()){
                File f1 = new File(ruta);
                if(f1.isFile()){
                    System.out.println("Es un fichero");
                    System.out.println("De tamaño "+f1.length()+" bytes");
                }else if(f1.isDirectory()){
                    System.out.println("Es un directorio");
                    System.out.println("Con el siguiente contenido");
                    for(String objeto : f1.list()){
                        System.out.println( objeto);
                    }
                }
                else {
                    if(ruta.lastIndexOf(".")>0){
                        System.out.println(f1.createNewFile());
                    }
                    else{
                        f1.mkdir();
                    }

                }
            }else {

            }

        }while(!ruta.isEmpty());
    }catch (IOException e) {
        e.printStackTrace();
    }}
}

