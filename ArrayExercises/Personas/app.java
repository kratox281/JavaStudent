package ArrayExercises.Personas;
import java.util.Scanner;
public class app {
    static Scanner tc = new Scanner(System.in);

    public static void imprimePersonas(String[]personas){
        for(int i = 0; i< personas.length;i++){
            System.out.println("Persona "+(i+1)+" : "+personas[i]);
        }
    }
    public static void imprimePares(String[]personas){
        for(int i = 0; i< personas.length;i+=2){
            System.out.println("Persona "+(i+2)+" : "+personas[i]);
        }
    }
    public static void main(String[] args) {
        String[]nombres = new String[20];
        for(int i =0;i<20;i++){
            System.out.println("Introduce un nombre para almacenar");
            nombres[i]=tc.next();
        }
        imprimePares(nombres);
        imprimePersonas(nombres);
    }
}
