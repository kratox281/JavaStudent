package AppAgenda;

import ArraysClase.Alumno;

import java.util.Arrays;

public class Agenda {
     private Contacto[] contactos= new Contacto[100];
     public int cont=0;

    public Agenda() {
        Arrays.fill(contactos,new Contacto("",""));
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
            if (this.contactos[i].comprobarNombre(nombre)==0) {
                resultados[coincidencias] = contactos[i];
                coincidencias++;
            }
        }
        mostrar(resultados);

    }
    public void busquedaTlf(String telfono){
        Contacto[] resultados= new Contacto[100];
        int coincidencias =0;
        for (int i = 0; i <this.contactos.length; i++) {
            if (this.contactos[i].comprobarTlf(telfono)==0) {
                resultados[coincidencias] = contactos[i];
                coincidencias++;
            }
        }
        mostrar(resultados);

    }
    public boolean comprobarExistencia(Contacto nuevo){
        if(Arrays.binarySearch(this.contactos,nuevo)>=0){
            return true;
        }else {
            return false;
        }
    }

    public void imprimirAgenda(){
        mostrar(this.contactos);
    }
    public void mostrar(Contacto[] mostrar){
        for (int i = 0; i < mostrar.length; i++) {
            if(mostrar[i]!=null){
                System.out.println(mostrar[i].toString());
            }


        }
    }

    public void  vaciarAgenda(){
        Arrays.fill(contactos,new Contacto("",""));
    }

}
