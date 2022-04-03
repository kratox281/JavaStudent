package LecturaEscritura;

import java.io.File;
import java.io.IOException;

public class Ejemplo2 {
    public static void main(String[] args)  {
        File[]unidades = File.listRoots();
        //listar unidades disco Duro
        for(File unidad:unidades){
            System.out.println("\t"+unidad.toString());

        }
        //Crear ficheros Temporales
        try {
            File temporal = File.createTempFile("Prueba" ,"temp");
            temporal.deleteOnExit();


            if(temporal.exists()){
                System.out.println(temporal.getAbsolutePath());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
