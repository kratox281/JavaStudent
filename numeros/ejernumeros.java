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
        boolean ocupado;
        Arrays.fill(numeros,0);
        for(int i = 1; i<numeros.length;i++){
            ocupado = true;
            while(ocupado){
                int nuevoValor= r.nextInt(10);
                if(numeros[nuevoValor]==0){
                    ocupado =false;
                }
                if(!ocupado){
                      numeros[nuevoValor]=i;
            }
                }
              
            
        
            
    }
    imprimirNumeros(numeros);
}}
