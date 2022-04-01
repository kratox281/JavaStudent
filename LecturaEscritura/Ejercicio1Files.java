package LecturaEscritura;

import javax.security.sasl.SaslClient;
import javax.swing.*;
import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio1Files {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int directorios  =0;
        int archivos  = 0;
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int resp = jfc.showSaveDialog(null);
        if(resp == JFileChooser.APPROVE_OPTION){

            for(File f : jfc.getSelectedFile().listFiles()){
                if(f.isDirectory()){
                    Date modi =new Date(f.lastModified()) ;
                    System.out.println(modi+" <DIR> "+"     "+f.getName());
                directorios++;
                }
                if(f.isFile()){
                    Date modi =new Date(f.lastModified()) ;
                    System.out.println(modi+"     "+f.length()+" "+f.getName());
                archivos++;
                }
            }
            System.out.println("Directorios: "+directorios);
            System.out.println("Archivos: "+archivos);
        }else{
            System.out.println("no se ha seleccionado nada");
        }
    }
}
