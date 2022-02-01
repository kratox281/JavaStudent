
package Ascensor;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {

    //atributos
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private double peso;
    private char sexo;
    private LocalDate fechaNac;
    private boolean casado;
    private int altura;

    //contructor/es
    //--> constructor por defecto 
    public Persona() {
        this.dni = "";
        this.nombre = "";
        this.apellidos = "";
//        this.fechaNac=LocalDate.now();
        setFechaNac(LocalDate.now());
        this.peso = 0;
        this.sexo = '-';
        this.casado = false;
        this.altura = 0;
    }
    public Persona(String dni) {
        this.dni = dni;
        this.nombre = "";
        this.apellidos = "";
        setFechaNac(LocalDate.now());
        this.peso = 0;
        this.sexo = '-';
        this.casado = false;
        this.altura = 0;
    }
    public Persona(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        setFechaNac(LocalDate.now());
        this.peso = 0;
        this.sexo = '-';
        this.casado = false;
        this.altura = 0;
    }

    //métodos getter 
    public String getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getPeso() {
        return this.peso;
    }

    public char getSexo() {
        return sexo;
    }

    public String getFechaNac() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        return this.fechaNac.format(dtf);
    }

    public boolean isCasado() {
        return casado;
    }

    public int getAltura() {
        return altura;
    }

    //métodos setter
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
        this.edad = calcularEdad();
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }
 

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", peso=" + peso + ", sexo=" + sexo + ", fechaNac=" + fechaNac + ", casado=" + casado + ", altura=" + altura + '}';
    }

    public boolean isMayorEdad() {
        return this.edad >= 18;
    }

    public int pesoIdeal() {
        double pesoIdeal = 0.75 * (this.altura - 150) + 50;
        //prueba
        System.out.println(pesoIdeal);
//        if(this.peso < pesoIdeal) return -1;
//        else if (this.peso > pesoIdeal) return 1;
//        return 0;

        return (int) (this.peso - pesoIdeal);
    }

    public char getLetraDNI() {
        String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
        int n = Integer.parseInt(this.dni) % 23;
        return tabla.charAt(n);
    }

    private int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        return Period.between(this.fechaNac, hoy).getYears();
    }

}
