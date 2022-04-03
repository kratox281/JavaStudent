package LecturaEscritura;

import javax.swing.*;
import java.io.File;
import java.util.Date;

public class Ejercicio2 {


    public static void mostrarContenidoCarpeta(File[] f,String indent){
        String espacios = indent+"  ";
        for (File arch : f){
            if(arch.isDirectory()){
                System.out.println(espacios+arch.getName());
                mostrarContenidoCarpeta(arch.listFiles(),espacios);
            }
            if(arch.isFile()){

                System.out.println(espacios+arch.getName());
            }
        }

    }

    public static void main(String[] args) {

        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int resp = jfc.showSaveDialog(null);
        File[] archivos = jfc.getSelectedFile().listFiles();

        mostrarContenidoCarpeta(archivos,"  ");
    }
}
