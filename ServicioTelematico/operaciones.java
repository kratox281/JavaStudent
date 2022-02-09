package ServicioTelematico;

public interface operaciones {
    void conexion (int s); //Contabiliza ‘s’ segundos en la cuenta
    double importe(); //Calcula el importe facturable
    void reset(); //Pone a cero la cuenta
}
