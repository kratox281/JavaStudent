package Coche;

import java.util.Scanner;

public class AppAutomovil {
    public static void main(String[] args) {
        char seguir = 's';
        Scanner tc = new Scanner(System.in);
        int cm = 0;
        Detallitos.hola();
       
        do {
            System.out.println("Deseas crear un coche o  una moto");
            System.out.println("1:Coche || 2:Moto");
            cm = tc.nextInt();
        } while (cm<=0 && cm>2);
        Automovil coche1 = new Automovil();
        switch (cm) {
            case 1:
                System.out.println("Ya está creado el coche");
                Detallitos.cochesito();
                break;
            case 2:
            System.out.println("Ya está creada la moto");
            Detallitos.moto();
                break;
        }
        do {
            System.out.println("Que quieres hacer");
            System.out.println(
                    "1:Arrancar || 2:Detener || 3:Repostar || 4:Acelerar || 5:Decelerar || 6:Entrar || 7:Salir || 8:Otras");
            int opcion = tc.nextInt();
            switch (opcion) {
                case 1:
                    coche1.arrancar();
                    break;
                case 2:
                    coche1.detener();
                    break;
                case 3:
                    coche1.repostar();
                    break;
                case 4:
                    coche1.acelerar();
                    break;
                case 5:
                    coche1.decelerar();
                    break;
                case 6:
                    coche1.entrar();
                    break;
                case 7:
                    coche1.salir();
                    break;
                case 8:
                    Detallitos.modoPro();
                    break;
                default:
                    break;

            }
            if (coche1.getArrancado() == false && coche1.getPasajeros() == 0) {
                System.out.println("Deseas continuar");
                System.out.println("s: Si || n:No");
                seguir = tc.next().toLowerCase().charAt(0);
            }

        } while (seguir == 's');
    }
}
