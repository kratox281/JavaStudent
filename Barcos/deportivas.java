package Barcos;

import java.util.Scanner;

public class deportivas extends barco{
    static Scanner tc = new Scanner(System.in);
    protected int potencia;
    public deportivas(){
        super();
        System.out.println("Introduce la potencia");
        this.potencia = tc.nextInt();
    }    
    @Override
    public int calcularModulo(){
        int modulo;
        modulo = (int)(this.eslora*10*2)+this.potencia;
        return modulo;
    }
}
