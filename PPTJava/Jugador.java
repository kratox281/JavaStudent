package PPTJava;
import java.util.*;
public class Jugador {
    static Scanner tc = new Scanner(System.in);
    public static String player (){
        String j1="";
        System.out.println("Introduce tu elección:");
            System.out.println("1:Piedra // 2:Papel // 3:Tijeras");
            int choose = tc.nextInt();
            switch(choose){
                case 1:
                j1 = "Piedra";
                break;
                case 2:
                j1 = "Papel";
                break;
                case 3:
                j1 = "Tijeras";
                break;
                default:
                System.out.println("No valido");
                System.exit(0);
                break;
            }
        return j1;
    }
}
