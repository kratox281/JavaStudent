package Barcos;
import java.util.Scanner;
public class barco {
    static Scanner tc = new Scanner(System.in);
    protected String matricula;
    protected double eslora;
    protected int anio;

    public barco(){
        try {
        System.out.println("Introduce la matricula");
            this.matricula=tc.nextLine();
        System.out.println("Introduce la eslora");
            this.eslora = tc.nextDouble();
        System.out.println("Introduce el año de fabricación");
            this.anio = tc.nextInt();
        } catch (Exception e) {
        }
    }
    public int calcularModulo(){
        int modulo;
        modulo = (int)this.eslora*10*2;
        return modulo;
    }
}
