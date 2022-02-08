package Biblioteca;

import java.util.Date;
import java.util.Scanner;

public class consulta {
    static Scanner tc = new Scanner(System.in);
    protected documento consultado;
    protected Date hoy;
    protected String dni;

    public consulta(){
        setHoy();

    }
    public void setDocumento(){
        System.out.println("Que tipo de documento quieres consultar");
    }
    public void setHoy(){
        Date fecha = new Date(System.currentTimeMillis());
        this.hoy = fecha;
    }
    public void setDNI(){
        System.out.println("Introduce el dni");
            this.dni = tc.next();
    }
}
