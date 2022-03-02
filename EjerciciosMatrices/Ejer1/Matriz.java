package EjerciciosMatrices.Ejer1;

public class Matriz{

    public static int[][] generarMatriz(){
        int[][] matriz1 = new int[5][5];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j <matriz1[0].length ; j++) {
                if (i%2==0){
                    matriz1[i][j]=2*(i+1)*(j+1);
                }else {
                    matriz1[i][j]=3*(i+1)*(j+1);
                }
            }

        }
        return matriz1;
    }

    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[0].length ; j++) {
                System.out.print(matriz[i][j]+" ");

            }
            System.out.println();
        }

    }

    public static int sumarMatriz(int[][] matriz){
        int suma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[0].length ; j++) {
                suma += matriz[i][j];

            }
        }
        return suma;
    }

    public static void imprimirDiagonal(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[0].length ; j++) {
                if(j==i){
                    System.out.print(" "+matriz[i][j]+" ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz = generarMatriz();
        imprimirMatriz(matriz);
        System.out.println("El resultado de la suma de todos los valores de la matriz es: "+sumarMatriz(matriz));
        imprimirDiagonal(matriz);
    }
}
