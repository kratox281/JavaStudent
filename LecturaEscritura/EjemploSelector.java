package LecturaEscritura;

import javax.swing.*;
import java.io.File;

public class EjemploSelector {
    public static void main(String[] args) {
        JFileChooser jfc = new JFileChooser();
        int resp = jfc.showSaveDialog(null);
        jfc.setDialogTitle("Elige");
        if(resp == JFileChooser.APPROVE_OPTION){
            File[]objSeleccionado = jfc.getSelectedFiles();

            for(File f:objSeleccionado){
                if(f.isDirectory()){
                    System.out.println(f.getName()+"\t Directorio" +
                            " \t");
                }
                if(f.isFile()){
                    System.out.println(f.getName()+"\t File \t");
                }
            }
        }
        else {
            System.out.println("ELihe mono");
        }
    }
}

/*FileNameExtensionFilter filtro = new FileNameExtensionFilter("png","jpg")
jfc.addChoosable filter(filtro);
jfc.setAcceptAllFileFilterUsed;
*/
