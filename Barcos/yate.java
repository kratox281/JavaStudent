package Barcos;

import java.util.Scanner;

public class yate extends deportivas{
    static Scanner tc = new Scanner(System.in);
    protected int camarotes;
    public yate(){
        super();
        System.out.println("Introduce el numero de camarotes");
        this.camarotes = tc.nextInt();
    }    
    @Override
    public int calcularModulo(){
        int modulo;
        modulo = (int)(this.eslora*10*2)+this.potencia+this.camarotes;
        return modulo;
    }
}
