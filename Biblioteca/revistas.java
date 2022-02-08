package Biblioteca;

public class revistas extends clasicos{
    protected int volumen;
    protected int numero;
    protected int mes;
    public revistas(){
        super();

    }
    public void setVolumen(){
        System.out.println("Introduce el volumen");
        this.volumen = tc.nextInt();
    }
    public void setNumero(){
        System.out.println("Introduce el numero");
        this.numero = tc.nextInt();
    }
    public void setMes(){
        System.out.println("Introduce el mes de salida");
        this.mes = tc.nextInt();
    }
}
