package Barcos;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class alquiler {
    static Scanner tc = new Scanner(System.in);
    protected String nombrec;
    protected String dni;
    protected int amarre;
    protected Date inicio;
    protected Date fin;
    protected barco alquilado;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public alquiler(){
        cliente cl1 = new cliente();
        this.nombrec = cl1.nombre;
        this.dni = cl1.dni;
        setAmarre();
        this.alquilado = crearBarco();
        setInicio();
        setFin();
    }
    public void setInicio(){
        try{
        System.out.println("Introduce la fecha de inicio dd/mm/yyyy");
        String fecha = tc.next();
        this.inicio = sdf.parse(fecha);
        }catch(Exception e){

        }

    }
    public void setFin(){
        try{
        System.out.println("Introduce la fecha de fin dd/mm/yyyy");
        String fecha = tc.next();
        this.fin = sdf.parse(fecha);
        }catch(Exception e){

        }

    }
    public void setAmarre(){
        try {
            System.out.println("Introduce en que posición está el amarre");
        this.amarre = tc.nextInt();
        } catch (Exception e){
        }
        
    }
    public barco crearBarco(){
        System.out.println("Que barco vas a amarrar");
        System.out.println("1:Velero,2:lancha deportiva,3:Yate, 4:Barco genérico");
            int elec = tc.nextInt();
                if(elec == 1){
                velero v1 = new velero();
                return v1;
                }else if(elec ==2){
                deportivas d1 = new deportivas();
                return d1;
            }else if(elec == 3){
                yate y1= new yate();
                return y1;
            }else{
                barco b1 = new barco();
                return b1;
            }
            }
        public void calcularAlquiler(){
            int tiempo = (int) ((((this.fin.getTime()-this.inicio.getTime())/6000)/60)/24);
            int precio = alquilado.calcularModulo()*tiempo;
            System.out.println("El precio es: "+precio+"€");
            
        }
        
}
