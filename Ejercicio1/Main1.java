/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author casmarru
 */
public class Main1 {
    
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
           if(i%2==0){
               filaPar();
               System.out.println();
           }
           else{
               filaImpar();
               System.out.println("");
           }
        }
    }
    public static void filaPar(){
        char b ='B';
        char n = 'N';
         for (int j = 0; j < 8; j++) {
             if(j%2==0) System.out.print(b+" ");
              else System.out.print(n+" ");
                
            }
    }
     public static void filaImpar(){
        char b ='B';
        char n = 'N';
         for (int j = 0; j < 8; j++) {
               if(j%2==0) System.out.print(n+" ");
              else System.out.print(b+" ");
            }
    }
}
