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
        System.out.println("1:libro clasico,2:revista,3:digital,4:microfilms,5:genérico");
        int n = tc.nextInt();
        switch(n){
            case 1:
            this.consultado = new clasicos();
            break;
            case 2:
            this.consultado = new revistas();
            break;
            case 3:
            this.consultado = new digitales();
            break;
            case 4:
            this.consultado = new microfilms();
            break;
            default:
                    
            break;

        }
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
