package EjerciciosMatrices.Ejer4;

import java.util.Random;

public class dimenRandom {
   static Random r = new Random();
    public static int[][] generarMatriz(){
        int[][] matriz1 = new int[r.nextInt(10)][r.nextInt(10)];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j <matriz1[0].length ; j++) {
            matriz1[i][j]= r.nextInt(101);
            }

        }
        return matriz1;
    }

    public static void main(String[] args) {
    int[][] matriz = generarMatriz();
    }

}
