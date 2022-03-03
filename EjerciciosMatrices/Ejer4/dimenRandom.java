package EjerciciosMatrices.Ejer4;

import java.util.Random;

public class dimenRandom {
   static Random r = new Random();
    public static int[][] generarMatriz(){
        int fil = r.nextInt(101);
        int col = r.nextInt(101);
        int[][] matriz1 = new int[fil][col];
        System.out.println("La matriz es de "+fil+" x "+col);
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j <matriz1[0].length ; j++) {
            matriz1[i][j]= r.nextInt(101);
            }

        }
        return matriz1;
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
    int[][] matriz = generarMatriz();
    imprimirMatriz(matriz);


    }

}
