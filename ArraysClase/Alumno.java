package ArraysClase;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private String apellidos;
    private int edad;

    public Alumno(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }


    //@Override
    //Establecemos el orden natural de los alumnos
    //public int compareTo(Alumno o) {
      //  return this.edad-o.edad;
    //}


    @Override
    public int compareTo(Alumno o) {
        return this.apellidos.compareTo(o.apellidos)+
                this.nombre.compareTo(o.nombre)+
                this.edad-o.edad;
    }
}
