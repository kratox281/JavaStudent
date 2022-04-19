/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author casmarru
 */
public class Main2 {
    static Scanner tc = new Scanner(System.in);
    public static int elegirViejo(){
        String viejo;
        System.out.println("Introduce el número viejo");
        viejo=tc.nextLine();
        try{
        int numero = Integer.parseInt(viejo);
        return numero;
        }catch(Exception e){
            System.out.println("Error en los datos introducidos");
        }
        return 11;
        
    }
    public static int introducirNuevo(){
        String nuevo;
        System.out.println("Introduce el número nuevo");
        nuevo=tc.nextLine();
        try{
        int numero = Integer.parseInt(nuevo);
        return numero;
        }catch(Exception e){
            System.out.println("Error en los datos introducidos");
        }
        return 11;
        
    }
    static void mostrarPilas(LinkedList<Integer> inicial,String n) {
        LinkedList<Integer> imprimir = inicial;
        Iterator it = imprimir.iterator();
        System.out.println("La pila "+n+" es: ");
        System.out.println();
        while (it.hasNext()) {
            System.out.print(it.next());
         
        }
        System.out.println();
    }
    public static LinkedList<Integer> crearPilaInicial() {
        Random r = new Random();
        LinkedList<Integer> numeros = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            numeros.push(r.nextInt(10)+1);  
        }
        mostrarPilas(numeros, "inicial");
        return numeros;
    }
    public static void modificarLista(LinkedList<Integer> inicial,int nuevo,int viejo){
        LinkedList<Integer> modificada=new LinkedList<>();
        boolean contiene = false;
        for (int i = 0; i < 10; i++) {
           Integer temp = inicial.pop();
           if(temp==viejo){
               temp=nuevo;
               contiene=true;     
           }
    
           modificada.add(temp);
        }
        if(!contiene)System.out.println("La lista no contenía ese numero");
      mostrarPilas(modificada, "nueva");
    }
    
    public static void main(String[] args) {
        int nuevo = introducirNuevo();
        int viejo = elegirViejo();
        
        
        LinkedList<Integer> original = crearPilaInicial();
       
        modificarLista(original,nuevo,viejo);
       
       
    }
    
}
