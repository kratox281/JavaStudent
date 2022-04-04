package LecturaEscritura;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Random;

public class Ficheros {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\casmarru\\pruebasps\\prueba.data");
        Random r =  new Random();
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        try {
             fos = new FileOutputStream(file, true);
             bos = new BufferedOutputStream(fos);
             dos = new DataOutputStream(bos);

            for (int i = 0; i <20; i++) {
                dos.writeDouble(10*r.nextDouble());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();

        }finally{
            try {
                dos.close();
            }catch (Exception ex){
                System.out.println("Error 2");
                ex.printStackTrace();
            }
        }
    }
}
