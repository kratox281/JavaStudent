package escritecto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class LecturaTexto {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\casmarru\\Desktop\\pruebaJava.txt"))){
            String frase = "";
            int i=0;
            while ((frase=br.readLine())!=null){
                i++;
                System.out.println("Frase " +i+ ":"+frase.toUpperCase(Locale.ROOT));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
