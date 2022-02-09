package Biblioteca;

import java.util.Scanner;

abstract public class documento {
    static Scanner tc = new Scanner(System.in);
    protected int id;
    protected static int count;
    protected boolean consultado;
    public documento(){
        System.out.println("Introduce el id del documento:");
        count++;
        this.id = count;
    }
    public void setId(){
        this.id = tc.nextInt();
    }
}
