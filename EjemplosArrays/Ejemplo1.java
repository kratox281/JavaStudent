package EjemplosArrays;

import java.util.Arrays;

public class Ejemplo1{
    public static void mostrarAlturas(int[]array){
        for(int i = 0; i< array.length;i++){
            System.out.println("posi"+i+":"+array[i]);
        }
    }
    public static void sumarPuntos(double[]notas,double puntos){
        for(int i = 0; i<notas.length;i++){
            notas[i] += puntos;

        }

    }
    public static void main(String[] args) {
        // int[]alturas=new int[20];
        // Arrays.fill(alturas,12);
        // mostrarAlturas(alturas);

        double[] notas = {2.3,1.5,7.8};
        Arrays.sort(notas);
        System.out.println(Arrays.toString(notas));
        sumarPuntos(notas,5);
         System.out.println(Arrays.toString(notas));
    }
}