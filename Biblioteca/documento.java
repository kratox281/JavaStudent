package Biblioteca;

import java.util.Scanner;

public class documento {
    static Scanner tc = new Scanner(System.in);
    protected int id;
    public documento(){
        System.out.println("Introduce el id del documento:");
        setId();
    }
    public void setId(){
        this.id = tc.nextInt();
    }
}
