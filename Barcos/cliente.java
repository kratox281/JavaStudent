package Barcos;
import java.util.Scanner;
public class cliente {
    static Scanner tc = new Scanner(System.in);
    protected String nombre;
    protected String dni; 
    public cliente(){
        System.out.println("Introduce el dni");
            dni=tc.nextLine();
        System.out.println("Introduce el nombre");
            nombre = tc.nextLine();
    }
}
