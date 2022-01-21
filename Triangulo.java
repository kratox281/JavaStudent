/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author casmarru
 */
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int n;
        int contador = 0;
        System.out.println("Introduce el numero de lineas");
            n = tc.nextInt();
        for (int i=1;i<=n;i++){
            contador +=2;
                for (int j = 0;j<n-i;j++){
                    System.out.print(" ");
                }
                for (int k = i;k<contador;k++){
                    if (k>9){
                        int r = k%9;
                        System.out.print(r);
                    }
                    else{
                    System.out.print(k);
                    }
                }
                for (int l = contador-2;l>=i;l--){
                    if (l>9){
                        int s = l%9;
                        System.out.print(s);
                    }
                    else{
                    System.out.print(l);
                    }
                }
                System.out.println(" ");
        }

    }
    
}
