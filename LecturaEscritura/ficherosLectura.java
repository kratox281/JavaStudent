package LecturaEscritura;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class ficherosLectura {
   /* public static void main(String[] args) {
        File file = new File("C:\\Users\\casmarru\\pruebasps");
        boolean eof = false;
        //FileInputStream fis = null;
        //BufferedInputStream bis = null;
        //DataInputStream dis = null;º
        try {
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
            dis.readDouble();

            int dato;
            while (!eof){
                dato=(int) dis.readDouble();
                System.out.println(dato);
            }
        }catch (Exception e){

        }finally {

        }
    }*/
   public static void main(String[] args) {
       File file = new File("C:\\Users\\casmarru\\pruebasps");
       boolean eof = false;
       try {
           DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
           dis.readDouble();

           int dato;
           while (!eof){
               dato=(int) dis.readDouble();
               System.out.println(dato);
           }
       }catch (Exception e){

       }finally {

       }
   }
}
