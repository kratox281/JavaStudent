package escritecto;

import java.io.*;

public class EscrituraTexto {
    public static void main(String[] args) {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        try(BufferedWriter bw  =new BufferedWriter(new FileWriter("C:\\Users\\casmarru\\Desktop\\pruebaJava.txt",true))) {
            String frase = "";
            do {
                System.out.print("Frase [enter] para terminar");
                frase=teclado.readLine();
                if(!frase.isEmpty()){
                    //grabamos en el fichero
                    bw.write(frase);
                    bw.newLine();
                }
            }while(!frase.isEmpty());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
