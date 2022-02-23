package ArraysClase;

import java.util.Arrays;

public class BusquedaBinaria2 {
    public static void main(String[] args) {
        Alumno[]clase = new Alumno[3];

        Alumno al1 = new Alumno("Juan","Perez",19);
        Alumno al2 = new Alumno("Maria","Alvarez",20);
        Alumno al3 = new Alumno("Eva","Zarzuela",22);

        clase[0]=al1;
        clase[1]=al2;
        clase[2]=al3;

        //Ordenamos el array
        //Para ordenar objetos personalizados se debe establecer el orden natural en el que se quiera que se ordene

        Arrays.sort(clase);
        Arrays.binarySearch(clase,al1);
        System.out.println(Arrays.binarySearch(clase,new Alumno("Maria","Alvarez",21)));



    }
}
