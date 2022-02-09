package ServicioTelematico;

public class ofertas {
    public static int oferta1(int s){
        if(s<180){
            return 0;
        }
        return s-180;
    }
    public static double oferta2(double p,double d){
        return p-(p*d);

    }
}
