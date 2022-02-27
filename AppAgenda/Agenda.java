package AppAgenda;

import ArraysClase.Alumno;

import java.util.Arrays;

public class Agenda {
     private Contacto[] contactos= new Contacto[100];
     private Contacto vacio = new Contacto("",0);
     public int cont=0;

    public Agenda() {
        Arrays.fill(contactos,vacio);
    }
    public void agregarContacto(Contacto nuevo){
        if(comprobarExistencia(nuevo)){
            System.out.println("Ya existe ese contacto");
        }else {
            this.contactos[cont] = nuevo;
            cont++;
        }
    }

    public void busquedaNombre(String nombre){
        Contacto[] resultados= new Contacto[100];
        int coincidencias =0;
        for (int i = 0; i <this.contactos.length; i++) {
            if (this.contactos[i].comprobarNombre(nombre)) {
                resultados[coincidencias] = contactos[i];
                coincidencias++;
            }
        }
        mostrar(resultados);

    }
    public void busquedaTlf(int telfono){
        Contacto[] resultados= new Contacto[100];
        int coincidencias =0;
        for (int i = 0; i <this.contactos.length; i++) {
            if (this.contactos[i].comprobarTlf(telfono)) {
                resultados[coincidencias] = contactos[i];
                coincidencias++;
            }
        }
        mostrar(resultados);

    }
    public boolean comprobarExistencia(Contacto nuevo){
        for (int i = 0; i <this.contactos.length; i++) {
            if (this.contactos[i].compareTo(nuevo)==0) {
                return true;
            }
        }
        return false;
    }

    public void imprimirAgenda(){
        mostrar(this.contactos);
    }
    public void mostrar(Contacto[] mostrar){
        for (int i = 0; i < mostrar.length; i++) {
            if(mostrar[i].compareTo(vacio)!=0){
                System.out.println(mostrar[i].toString());
            }


        }
    }
    public void eliminarContacto(Contacto nuevo){
        for (int i = 0; i <this.contactos.length; i++) {
            if (this.contactos[i].compareTo(nuevo)==0) {
                this.contactos[i]=vacio;
                cont--;
            }
        }
        reescribirAgenda();

    }
    public void modificarContacto(Contacto viejo,Contacto nuevo){
        for (int i = 0; i <this.contactos.length; i++) {
            if (this.contactos[i].compareTo(viejo)==0) {
                this.contactos[i]=nuevo;
            }
        }
    }
    public void reescribirAgenda(){
        Contacto[] escritos = new Contacto[100];
        Arrays.fill(escritos,vacio);
        for (int i = 0; i < contactos.length; i++) {
            int b =0;
            if(this.contactos[i].compareTo(vacio)!=0) {
                escritos[b] = contactos[i];
                b++;
            }
        }
        for (int i = 0; i <escritos.length ; i++) {
            contactos[i]=escritos[i];
        }
    }
    public void  vaciarAgenda(){
        Arrays.fill(contactos,vacio);
    }

}
