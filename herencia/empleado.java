package herencia;

import java.util.Scanner;



public class empleado {
    static Scanner tc = new Scanner(System.in);
    private String nombre;
    private String apellido1;
    private String apellido2;
    private double salarioBase;
    private double retencion;

    public empleado(){
        setNombre();
        setApellido1();
        setApellido2();
        System.out.println("Se ha creado el empleado");
    }
    public void setNombre(){
        System.out.println("Introduce el nombre");
        this.nombre = tc.nextLine();
    }
    public void setApellido1(){
        System.out.println("introduce el apellido 1");
        this.apellido1 = tc.nextLine();
    }
    public void setApellido2(){
        System.out.println("Introduce el apellido 2");
        this.apellido2 = tc.nextLine();
    }
    public void setSalarioBase(){
        this.salarioBase = tc.nextDouble();
    }
    public void setRetencion(){
        this.retencion = tc.nextDouble();
    }

    public void getNombre(){

    }
    public void getApellido1(){

    }
    public void getApellido2(){

    }
    public void getSalarioBase(){

    }
    public void getRetencion(){

    }

    public double calcularSalarioMensual(){
        double salario = 0;
        return salario;
    }
}
