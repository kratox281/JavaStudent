/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioDir;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;



/**
 *
 * @author casmarru Muestra el file chooser
 *
 */
//Default, /Og, /On, /OGN, /S, /B
public class Principal {

    public static void main(String[] args) {

        NewJFrame1 ventana = new NewJFrame1();

        ventana.setVisible(true);

    }

     static int directorios = 0;
     static int archivos = 0;
    public static void defecto(File[] directorio) {
        directorios = 0;
        archivos = 0;
          for(File f : directorio){
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

    }

    public static void og(File[] directorio) {
        directorios = 0;
        archivos = 0;
       File[] imprimir = ordenarDirectorios(directorio);
        for(File f : imprimir){
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
          
    }

    public static void on(File[] directorio) {
        directorios = 0;
        archivos = 0;
         File[] imprimir = ordenarAlfabeticamente(directorio);
        for(File f : imprimir){
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
        

    }

    public static void ogn(File[] directorio) {
        directorios = 0;
        archivos = 0;
        File[] imprimir = ordenarAlfabeticamente(directorio);
        imprimir = ordenarDirectorios(imprimir);
        for(File f : imprimir){
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

    }

    public static void s(File[] directorio) {
        directorios = 0;
        archivos = 0;
         for(File f : directorio){
                if(f.isDirectory()){
                    Date modi =new Date(f.lastModified()) ;
                    System.out.println(modi+" <DIR> "+"     "+f.getName());
                    mostrarSubdirectorios(f.listFiles());
                directorios++;
                }
                if(f.isFile()){
                    Date modi =new Date(f.lastModified()) ;
                    System.out.println(modi+"     "+f.length()+" "+f.getName());
                archivos++;
                }
            }

    }

    public static void b(File[] directorio) {
        directorios = 0;
        archivos = 0;
        for(File f : directorio){
                if(f.isDirectory()){
               
                    System.out.println(" <DIR> "+"     "+f.getName());
                directorios++;
                }
                if(f.isFile()){
                    
                    System.out.println("     "+"     "+f.getName());
                archivos++;
                }
            }
            System.out.println("Directorios: "+directorios);
            System.out.println("Archivos: "+archivos);

    }
    
    public static File[] ordenarDirectorios(File[]original){
        int posicion = 0;
        File[]organizada = new File[original.length];
        for(File f : original){
                if(f.isDirectory()){
                   organizada[posicion] = f;
                   posicion++;
                }
            }
        for(File f : original){
                if(f.isFile()){
                   organizada[posicion] = f;
                   posicion++;
                }
            }
        return organizada;
    }
    
    public static File[] ordenarAlfabeticamente(File[]original){
        File[]organizada = new File[original.length];
        ArrayList<File>colocar = new ArrayList<>();
        colocar.addAll(Arrays.asList(original));
        Collections.sort(colocar);
        for(int i = 0;i < colocar.size();i++){
            organizada[i] = colocar.get(i);
        }
        return organizada;
    }
     public static void mostrarSubdirectorios(File[] f){
        for (File arch : f){
            if(arch.isDirectory()){
                Date modi =new Date(arch.lastModified()) ;
                System.out.println(modi+" Sub DIR "+arch.getName());
                mostrarSubdirectorios(arch.listFiles());
            }
        }
     }
}
