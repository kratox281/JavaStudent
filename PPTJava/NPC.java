package PPTJava;
import java.util.*;
public class NPC {
    static Random r = new Random();
    public static String maquina(){
        String oponente = "";
        int choose = r.nextInt(3)+1;
        switch(choose){
            case 1:
            oponente = "Piedra";
            break;
            case 2:
            oponente = "Papel";
            break;
            case 3:
            oponente = "Tijeras";
            break;
            default:
            System.out.println("No valido");
            System.exit(0);
            break;
        }
        return oponente;
    }
}
