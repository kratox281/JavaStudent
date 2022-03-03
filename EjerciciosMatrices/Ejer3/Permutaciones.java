package EjerciciosMatrices.Ejer3;

import java.util.Scanner;
import java.util.Random;

public class Permutaciones {
    static Scanner tc = new Scanner(System.in);
    static Random r = new Random();
    public static int[][] generarMatriz(int n1, int n2){
        int[][] matriz1 = new int[n1][n2];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j <matriz1[0].length ; j++) {
             matriz1[i][j]=r.nextInt(101);
            }

        }
        return matriz1;
    }
    public static int[][] permutaFilas(int[][] original,int n1,int n2){
        int[][] cambiada = original;
        for(int i = 0;i< original[0].length;i++){
            cambiada[n1][i]=original[n2][i];

        }
        for(int j = 0;j< original[0].length;j++){
            cambiada[n2][j]=original[n1][j];

        }


        return cambiada;
    }
    public static int[][] permutaColumnas(int[][] original,int n1,int n2){
        int[][] cambiada = original;
        for(int i = 0;i< original.length;i++){
            cambiada[i][n1]=original[i][n2];

        }
        for(int i = 0;i< original.length;i++){
            cambiada[i][n2] = original[i][n1];

        }


        return cambiada;
    }

    public static void imprimirMatriz(int[][] matriz){
        for (int[] ints : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(ints[j] + " ");

            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        System.out.println("Introduce el numero de filas");
        int n1 = tc.nextInt();
        System.out.println("Introduce el numero de columnas");
        int n2 = tc.nextInt();
        int[][] matriz = generarMatriz(n1,n2);
        imprimirMatriz(matriz);
        System.out.println("Introduce la primera fila que quieras cambiar ");
         n1 = tc.nextInt();
        System.out.println("IIntroduce la segunda fila que quieras cambiar ");
         n2 = tc.nextInt();
         matriz=permutaFilas(matriz,n1,n2);
         imprimirMatriz(matriz);
         System.out.println("Introduce la primera columna que quieras cambiar ");
         n1 = tc.nextInt();
        System.out.println("IIntroduce la segunda columna que quieras cambiar ");
         n2 = tc.nextInt();
         matriz=permutaColumnas(matriz,n1,n2);
         imprimirMatriz(matriz);


    }
}
