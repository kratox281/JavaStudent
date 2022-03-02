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
            System.out.println("1:Agregar||2:Buscar||3:Mostrar Agenda|| 4:Vaciar Agenda || 5:Eliminar Contacto||6:Modificar Contacto||7:Salir");
            int elec = tc.nextInt();
            switch (elec){
                case 1:
                    String nmb = introducirNombre();
                    int tlf = introducirTlf();
                    a1.agregarContacto(new Contacto(nmb,tlf));
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
                case 5:
                    nmb = introducirNombre();
                    tlf = introducirTlf();
                    a1.eliminarContacto(new Contacto(nmb,tlf));
                    break;
                case 6:
                    System.out.println("Introduce los datos del contacto a modificar");
                    nmb=introducirNombre();
                    tlf= introducirTlf();
                    System.out.println("Introduce los nuevos datos del contacto");
                    String nnmb = introducirNombre();
                    int ntlf = introducirTlf();
                    a1.modificarContacto(new Contacto(nmb,tlf),new Contacto(nnmb,ntlf));

                    break;
                case 7:
                    x++;
                    break;

            }
        }catch (InputMismatchException ex){
            System.out.println("Error en los datos introducidos");
            x++;
        }

    }
    public static String introducirNombre (){
        System.out.println("Introduce el nombre del contacto");
        String nmb = tc.next();
        return nmb;
    }
    public static int introducirTlf (){
        System.out.println("Introduce el numero");
        int tlf = tc.nextInt();
        return tlf;

    }
    public static void busquedas() {
        try {
            System.out.println("Buscar por numero o por nombre");
            System.out.println("1:numero || 2:nombre");
            int elec = tc.nextInt();
            switch (elec){
                case 1:
                    System.out.println("Introduce el numero a buscar");
                    a1.busquedaTlf(tc.nextInt());
                    break;
                case 2:
                    System.out.println("Introduce el nombre a buscar");
                    a1.busquedaNombre(tc.next());
                    break;
            }
        }catch (InputMismatchException e){
            System.out.println("Error en los datos introducidos");
            x++;
        }

    }
}

