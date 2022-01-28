package Racional;

import java.util.*;

public class Racional {
    static Scanner tc = new Scanner(System.in);

    private int Numerador;
    private int Denominador;

    public Racional(int n, int d) {
        this.Numerador = n;
        this.Denominador = d;
        simplificar();
    }

    public Racional() {
        System.out.println("Introduce el nuevo numerador");
        this.Numerador = tc.nextInt();
        System.out.println("Introduce el nuevo denominador");
        this.Denominador = tc.nextInt();
        simplificar();
    }

    public void setNumerador(int n) {
        this.Numerador = n;
    }

    public int getNumerador() {
        return this.Numerador;
    }

    public void setDenominador(int n) {
        this.Denominador = n;
    }

    public int getDenominador() {
        return this.Denominador;
    }
    
    public String toString() {
        if(this.Numerador == this.Denominador){
            return "1";
        }
        else{
        return (this.Numerador + "/" + this.Denominador);
        }
    }
    //Producto de fracciones
    public static Racional producto(Racional r1, Racional r2) {
        int nume = r1.getNumerador() * r2.getNumerador();
        int deno = r1.getDenominador() * r2.getDenominador();
        System.out.println("La multiplicación de " + r1.toString() + " y " + r2.toString());
        Racional rProducto = new Racional(nume,deno);
        System.out.println(rProducto.toString());
        return rProducto;
    }
    //División de fracciones
    public static Racional división(Racional r1, Racional r2) {
        int nume = r1.getNumerador() * r2.getDenominador();
        int deno = r1.getDenominador() * r2.getNumerador();
        System.out.println("La división de " + r1.toString() + " y " + r2.toString());
        Racional rDivision = new Racional(nume,deno);
        System.out.println(rDivision.toString());
        return rDivision;
    }
    //Suma dos fracciones
    public static Racional suma(Racional r1, Racional r2) {
        int nume = ((r1.getNumerador() * r2.getDenominador()) + (r1.getDenominador() * r2.getNumerador()));
        int deno = r1.getDenominador() * r2.getDenominador();
        System.out.println("La suma de " + r1.toString() + " y " + r2.toString());
        Racional rSuma = new Racional(nume,deno);
        System.out.println(rSuma.toString());
        return rSuma;
    }
    //Resta dos fracciones
    public static Racional resta(Racional r1, Racional r2) {
        int nume = ((r1.getNumerador() * r2.getDenominador()) - (r1.getDenominador() * r2.getNumerador()));
        int deno = r1.getDenominador() * r2.getDenominador();
        System.out.println("La resta de " + r1.toString() + " y " + r2.toString());
        Racional rResta = new Racional(nume,deno);
        System.out.println(rResta.toString());
        return rResta;
    }
    //Convierte la fraccion en un número decimal
    public Double toDecimal(){
        Double num = (double)this.Numerador;
        Double den = (double)this.Denominador;
        Double resultado = num / den;
        return resultado;
    }

    //Cálculo del máximo común divisor por el algoritmo de Euclides                                               
    private int mcd() {
        int u = Math.abs(this.Numerador); //valor absoluto del numerador
        int v = Math.abs(this.Denominador); //valor absoluto del denominador
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    //método para simplificar fracciones
    private void simplificar() {
        int n = mcd(); //se calcula el mcd de la fracción
        //Divide ambos elementos entre el mcd
        this.Numerador = this.Numerador / n;
        this.Denominador = this.Denominador / n;

    }


}
