package AppAgenda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static Agenda a1 = new Agenda();
    static int x = 0;
    static Scanner tc = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            menu();
        }while (x==0);
    }
    public static void menu(){
        try {
            System.out.println("Que quieres hacer");
            System.out.println("1:Agregar||2:Buscar||3:Mostrar Agenda|| 4:Vaciar Agenda");
            int elec = tc.nextInt();
            switch (elec){
                case 1:
                    System.out.println("Introduce el nombre del cliente y despues el tlf");
                    a1.agregarContacto(new Contacto(tc.next(),tc.next()));
                    break;
                case 2:
                    busquedas();
                    break;
                case 3:
                    a1.imprimirAgenda();
                    break;
                case 4:
                    a1.vaciarAgenda();
                    break;

            }
        }catch (InputMismatchException ex){
            System.out.println("Error en los datos");
        }

    }

    public static void busquedas() {
        try {
            System.out.println("Buscar por numero o por nombre");
            System.out.println("1:numero || 2:nombre");
            int elec = tc.nextInt();
            switch (elec){
                case 1:
                    System.out.println("Introduce el numero a buscar");
                    a1.busquedaTlf(tc.next());
                    break;
                case 2:
                    System.out.println("Introduce el nombre a buscar");
                    a1.busquedaNombre(tc.next());
                    break;
            }
        }catch (InputMismatchException e){
            System.out.println("Error en los datos");
        }

    }
}

