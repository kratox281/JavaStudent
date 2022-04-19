/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author casmarru
 */
public class Main3 {

    private static Scanner tc = new Scanner(System.in);
    private static Map<String, ArrayList> diccionario = new HashMap<String, ArrayList>();

    private static boolean comprobarExistencia(String palabra) {
        if (diccionario.containsKey(palabra)) {
            return true;
        }
        return false;
    }

    private static void addPalabra(String palabra, String significado) {
        if (!comprobarExistencia(palabra)) {
            ArrayList<String> Significadopalabra = new ArrayList<>();
            Significadopalabra.add(significado);
            diccionario.put(palabra, Significadopalabra);
        } else {
            ArrayList<String> vieja = diccionario.get(palabra);
            ArrayList<String> temp = diccionario.get(palabra);
            temp.add(significado);
            diccionario.replace(palabra, vieja, temp);
        }
    }

    private static void getSignificado(String palabra) {
        if(comprobarExistencia(palabra)){
            ArrayList<String> temporal = diccionario.get(palabra);
            System.out.println(palabra+": "+temporal.get(0));
        }else{
            System.out.println("La palabra no está en el diccionario");
        }
    }

    private static void getSignificados(String palabra) {
        if(comprobarExistencia(palabra)){
             ArrayList<String> temporal = diccionario.get(palabra);
             Iterator it = temporal.iterator();
            System.out.println(palabra+": ");
            while (it.hasNext()){
                System.out.println("    "+it.next());
            }
            
        }else{
            System.out.println("La palabra no está en el diccionario");
        }

    }

    private static void indice() {
        for (Map.Entry<String, ArrayList> entry : diccionario.entrySet()) {
            String palabra = entry.getKey();
            System.out.println(palabra+" ("+diccionario.get(palabra).size()+")");
            
        }

    }

    public static void main(String[] args) {
        boolean run = true;
        do {
            System.out.println("Que deseas hacer:");
            System.out.println("1:Añadir palabra || 2:Obetener 1 significado || 3:Obtener todos los significados || 4: Mostrar el indice");
            char opcion = tc.nextLine().charAt(0);
            switch (opcion) {
                case '1':
                    System.out.println("Introduce la palabra");
                    String palabra = tc.nextLine();
                    System.out.println("Introduce el significado");
                    String signi = tc.nextLine();
                    
                    addPalabra(palabra, signi);
                    break;
                case '2':
                    System.out.println("Introduce la palabra");
                    palabra = tc.nextLine();
                    getSignificado(palabra);
                    break;
                    case '3':
                    System.out.println("Introduce la palabra");
                    palabra = tc.nextLine();
                        getSignificados(palabra);
                  break;
                  case '4':
                      indice();
                  break;
                  default:
                      run = false;
                      break;
            }

        } while (run);
    }

}
