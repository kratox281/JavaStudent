package Barcos;

import java.util.Scanner;

public class velero extends barco{
    static Scanner tc = new Scanner(System.in);
    protected int mastiles;
    public velero(){
        super();
        System.out.println("Introduce el número de mástiles del velero");
        this.mastiles = tc.nextInt();
    }
    @Override
    public int calcularModulo(){
        int modulo;
        modulo = (int)(this.eslora*10*2)+this.mastiles;
        return modulo;
    }
}
