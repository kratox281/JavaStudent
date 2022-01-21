package PPTJava;
import java.util.*;
public class Index {
    static char respuesta = 's';
    static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            String player = Jugador.player();
            String maquina = NPC.maquina();
            Utilidades.Ganador(player, maquina);
            respuesta  = Utilidades.otra();
        }while(respuesta !='n' );
        
    }
    
}
