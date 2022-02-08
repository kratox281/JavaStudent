package Biblioteca;

public class digitales extends clasicos{

    protected String licencia;
    public digitales(){
        super();
        setLicencia();
    }

    public void setLicencia(){
        System.out.println("Introduce la licencia");
            this.licencia = tc.next();
    }
}
