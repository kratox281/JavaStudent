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
        boolean repe=true;
        Arrays.fill(numeros,0);
        for(int i = 0; i<numeros.length;i++){
            do{
            int nuevoValor= r.nextInt(11)+1;
            for(int j = 0; j<numeros.length;j++){
                if(numeros[j]==nuevoValor||numeros[j]==0){
                    repe=true;
                }
                
            }
            if(!repe){
                numeros[i] = nuevoValor;
                
            }
        }while(repe);
        
            
    }
    imprimirNumeros(numeros);
}}
