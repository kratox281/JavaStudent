import java.util.*;
public class ejernumeros {
    static Random r = new Random();
    
    public static void imprimirNumeros(int[]numeros){
        for(int i = 0; i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }
    public static void main(String[] args) {
        int[] numeros = new int[10];
        boolean val  =false;
        Arrays.fill(numeros,0);
        for(int i = 0; i<numeros.length;i++){
            
            int nuevoValor= r.nextInt(10);
            for(int j = 0; j<numeros.length;j++){
                if(numeros[j]==nuevoValor){
                    val=true;
                }
            }
            if(!val){
                numeros[i] = nuevoValor;
            }
            val=false;
    }
    imprimirNumeros(numeros);
}}
