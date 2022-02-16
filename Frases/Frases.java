
import java.util.Scanner;

public class Frases {
    static Scanner tc = new Scanner(System.in);

    public static void imprimirFrases(String[]frases){
        for(int i = 0; i<frases.length;i++){
            System.out.println(frases[i]);
        }
    }

    public static void mayorFrase(String[]frases){
        String fMayor="";
        int posicion=0;
        for(int i=0;i<frases.length;i++){
            if(fMayor.length()<frases[i].length()){
                fMayor = frases[i];
                posicion = i;
            }
        }
        System.out.println("La frase más larga es: "+fMayor+" y está en la posicion "+posicion);
    }
    public static void menorFrase(String[]frases){
        String fMenor="";
        int posicion=0;
        for(int i=0;i<frases.length;i++){
            if(fMenor == ""){
                fMenor = frases[i];
                posicion = i;
            }
            if(fMenor.length()>frases[i].length()){
                fMenor = frases[i];
                posicion = i;
            }
        }
        System.out.println("La frase más corta es: "+fMenor+" y está en la posicion "+posicion);
    }

    public static void main(String[] args) {
        String[] frases = new String[5];
        for(int i = 0; i<frases.length;i++){
            System.out.println("Introduce la frase a almacenar");
            frases[i]= tc.nextLine();
        }
        imprimirFrases(frases);
        mayorFrase(frases);
        menorFrase(frases);

    }
}
