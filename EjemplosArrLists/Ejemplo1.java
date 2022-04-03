package EjemplosArrLists;

import java.util.ArrayList;
import java.util.Collection;

public class Ejemplo1 {
    public static void main(String[] args) {
        //Collection c = new ArrayList<>();
    ArrayList lista = new ArrayList<>();

        System.out.println(lista.isEmpty());//Saber si está vacia
        System.out.println(lista.size());//Tamaño de la lista

        //llenar la lista
        lista.add("una");
        lista.add("dos");
        lista.add("tres");
        System.out.println(lista);

    }
}
