package EjerciciosMatrices.Ejer2;
import EjerciciosMatrices.Ejer1.Matriz;

import java.util.Random;
public class Traspuesta extends Matriz {
    static Random r = new Random();

    public static int[][] generarMatriz(){
        int[][] matriz1 = new int[4][5];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j <matriz1[0].length ; j++) {
                matriz1[i][j]=r.nextInt(101);
            }

        }
        return matriz1;
    }

    public static int[][] trasponer(int[][] original){
        int[][] traspuesta = new int[original[0].length][original.length];

        for (int i = 0; i < traspuesta.length; i++) {
            for (int j = 0; j <traspuesta[0].length ; j++) {
                traspuesta[i][j]= original[j][i];
            }

        }
        return traspuesta;
    }

    public static void main(String[] args) {
        int[][] matriz = generarMatriz();
        imprimirMatriz(matriz);
        int[][] traspuesta  =trasponer(matriz);
        System.out.println("--------------------------");
        imprimirMatriz(traspuesta);
    }
}
