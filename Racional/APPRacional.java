package Racional;

import java.util.Scanner;

public class APPRacional {
    static Scanner tc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce el numerador");
        int n1 = tc.nextInt();
        System.out.println("Introduce el denominador");
        int d1 = tc.nextInt();
        Racional r1 = new Racional(n1, d1);

        System.out.println(r1.toString());
        char seguir = 's';
        do {
            System.out.println("Que operación deseas realizar?");
            System.out.println("1:Producto //2:División //3:Suma //4:Resta //5:Mostrar decimal //6:exit");
            int eleccion = tc.nextInt();
            switch (eleccion) {
                // Producto de Racionales
                case 1:
                    System.out.println("Vamos a realizar el producto de racionales");
                    Racional r2 = new Racional();
                    Racional.producto(r1, r2);
                    break;
                // Division de Racionales
                case 2:
                    System.out.println("Vamos a realizar la división de racionales");
                    Racional r3 = new Racional();
                    Racional.división(r1, r3);
                    break;
                // Suma de Racionales
                case 3:
                    System.out.println("Vamos a realizar la suma de racionales");
                    Racional r4 = new Racional();
                    Racional.suma(r1, r4);
                    break;
                // Resta de Racionales
                case 4:
                    System.out.println("Vamos a realizar la resta de racionales");
                    Racional r5 = new Racional();
                    Racional.resta(r1, r5);
                    break;
                // Mostrar el resultado decimal
                case 5:
                    System.out.println("El resultado en decimal es: " + r1.toDecimal());
                    break;
                default:
                    System.out.println("Cerrando");
                    System.exit(0);
                    break;
            }
            System.out.println("¿Desea hacer otra cosa?");
            System.out.println("s = si // n= no");

            seguir = tc.next().toLowerCase().charAt(0);
        } while (seguir == 's');

    }
}
