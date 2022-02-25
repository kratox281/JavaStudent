package AppAgenda;

import ArraysClase.Alumno;

public class Contacto implements Comparable<Contacto>{
    static int cont=0;
    protected int id;
    protected String nombre;
    protected String tlf;

    public Contacto(String nombre) {
        this.nombre = nombre;
        cont++;
        setId(cont);
    }

    public Contacto(String nombre, String tlf) {
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

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
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

    public int comprobarNombre(String nombre){

        return this.nombre.compareTo(nombre);
    }

    public int comprobarTlf(String telefono){

        return this.tlf.compareTo(telefono);

    }
}
