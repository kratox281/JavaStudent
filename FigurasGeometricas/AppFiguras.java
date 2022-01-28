package FigurasGeometricas;
    import java.util.InputMismatchException;
import java.util.Scanner;
public class AppFiguras {
    static Scanner tc = new Scanner(System.in);
    public static void usarCirculo(){
        try{
        Circulo c = new Circulo();
        System.out.println();
        System.out.println(c.toString());
        System.out.println("Vamos a mover el centro");
        Punto nuevo = new Punto();
        c.moverCentro(nuevo);
        System.out.println(c.toString());
        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
    public static void usarCuadrado(){
        try {
            System.out.println();
        Cuadrado s = new Cuadrado();
        System.out.println(s.toString());
        System.out.println("Vamos a mover el centro");
        Punto nuevo = new Punto();
        s.moverCentro(nuevo);
        System.out.println(s.toString());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        
    }
    public static void usarTriangulo(){
        try {
        System.out.println();
        Triangulo t = new Triangulo();
        System.out.println(t.toString());
        System.out.println("Vamos a mover el centro");
        Punto nuevo = new Punto();
        t.moverCentro(nuevo);
        System.out.println(t.toString());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        
    }
    public static void usarRectangulo(){
        try {
             System.out.println();
        Rectangulo r = new Rectangulo();
        System.out.println(r.toString());
        System.out.println("Vamos a mover el centro");
        Punto nuevo = new Punto();
        r.moverCentro(nuevo);
        System.out.println(r.toString());
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
       
    }
    
    public static void main(String[] args) {
        char seguir = 's';
        try{
       do{
        System.out.println();
        System.out.println("¿Qué figura quieres crear?");
        System.out.println("1:Circulo||2:Cuadrado||3:Triangulo||4:Rectangulo||5:Ninguna");
        int choose = tc.nextInt();
        switch(choose){
            case 1:
            usarCirculo();
            break;
            case 2:
            usarCuadrado();
            break;
            case 3:
            usarTriangulo();
            break;
            case 4:
            usarRectangulo();
            break;
            case 5:
            System.out.println("Hasta luego");
            break;
            default:
            System.out.println("No valido");
            break;
        }
        System.out.println();
        System.out.println("¿Deseas crear otra figura?");
        System.out.println("s = Si || n = No");
        seguir = tc.next().toLowerCase().charAt(0);
       }while(seguir == 's');
    }catch(InputMismatchException e){
        System.out.println("Error en los datos");
    }
    }
}
