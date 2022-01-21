package PPTJava;
import java.util.*;
public class Utilidades {
    static Scanner tc = new Scanner(System.in);
    public static void muestra(String j, String m){
        System.out.println("Has elegido: "+j);
        System.out.println("La maquina ha escogido: "+m);
    }
    public static void Ganador(String j, String m){
        muestra(j, m);
        if(j=="Piedra" && m=="Piedra"){
            System.out.println("Habeis empatado");
        }
        else if(j=="Piedra" && m=="Papel"){
            System.out.println("Has perdido");
        }
        else if(j=="Piedra" && m=="Tijeras"){
            System.out.println("Has ganado");
        }
        else if(j=="Papel" && m=="Piedra"){
            System.out.println("Has ganado");
        }
        else if(j=="Papel" && m=="Papel"){
            System.out.println("Habeis empatado");
        }
        else if(j=="Papel" && m=="Tijeras"){
            System.out.println("Has perdido");
        }
        else if(j=="Tijeras" && m=="Piedra"){
            System.out.println("Has perdido");
        }
        else if(j=="Tijeras" && m=="Papel"){
            System.out.println("Has ganado");
        }
        else if(j=="Tijeras" && m=="Tijeras"){
            System.out.println("Habeis empatado");
        }
    }
    public static char otra(){
        System.out.println("¿Quieres jugar de nuevo?");
        System.out.println("s=Sí // n=No");
        char otra = tc.nextLine().toLowerCase().charAt(0);
        return otra;
    }
}

