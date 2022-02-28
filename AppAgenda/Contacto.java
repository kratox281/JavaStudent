package AppAgenda;

public class Contacto implements Comparable<Contacto>{
    static int cont=0;
    protected int id;
    protected String nombre;
    protected Integer tlf;

    public Contacto(String nombre) {
        this.nombre = nombre;
        cont++;
        setId(cont);
    }

    public Contacto(String nombre, int tlf) {
        this.nombre = nombre;
        this.tlf = tlf;
        cont++;
        setId(cont);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "Id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tlf='" + tlf + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contacto nuevo) {
        return this.nombre.compareTo(nuevo.nombre)+
                this.tlf.compareTo(nuevo.tlf);
    }

    public boolean comprobarNombre(String nombre){

        return this.nombre.equals(nombre);
    }

    public boolean comprobarTlf(int telefono){

        return this.tlf.equals(telefono);

    }
}
