package Ascensor;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AppAscensor {
    static Scanner tc = new Scanner(System.in);

    public static void fnAlarma(Ascensor otis){
        try {
            System.out.println("1:Activar||2:Desactivar");
        int opc = tc.nextInt();
        switch(opc){
            case 1:
            otis.activar();
            break;

            case 2:
            otis.desactivar();
            break;
        }
        } catch (InputMismatchException e) {
            System.out.println("Error en la opción");
        }catch(AscensorException ex){
            System.out.println(ex.getMessage());
        }
        
        
    }
  public static void main(String[] args) throws InterruptedException {
      char seguir = 's';
      Ascensor otis = new Ascensor();
      do{
      try{
      System.out.println("¿Que deseas hacer?");
    System.out.println("1:abrir||2:cerrar||3:entrar:||4:salir||5:Moverse||6:Fn Alarma");
        int opc = tc.nextInt();
    switch(opc){
        case 1:
        otis.abrir();
        break;

        case 2:
        otis.cerrar();
        break;

        case 3: 
        otis.entrar();
        break;
        
        case 4:
        otis.salir();
        break;

        case 5:
        otis.mover(); 
        break;

        case 6:
        fnAlarma(otis);
        break;

        default:
        System.out.println("No es una opción valida");
        break;
    }
    if(otis.getPuertas()==false && otis.getOcupacion()==0){
    System.out.println("¿Deseas hacer más cosas?");
    System.out.println("S:sí || N:No");
    seguir = tc.next().toLowerCase().charAt(0);
    }
      }catch(InputMismatchException e){
        System.out.println("Error en los datos");
      }catch(AscensorException ex){
          System.out.println(ex.getMessage());
      }
    }while(seguir == 's');
  }  
}
