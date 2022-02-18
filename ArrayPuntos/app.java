public class app {
    public static void mostrarPuntos(Punto[] pt){
        for(int i = 0; i<pt.length;i++){
            if(pt[i]!=null){
                System.out.println(pt[i]);
            }
            else{
                System.err.println("");
            }
        }
    }
    public static void main(String[] args) {
        Punto[] arrayPuntos = new Punto[10];

        arrayPuntos[0]= new Punto(48,79);
        arrayPuntos[1]= new Punto(48,79);
        arrayPuntos[2]= new Punto(48,79);
        arrayPuntos[3]= new Punto(48,79);
        arrayPuntos[4]= new Punto(48,79);
        arrayPuntos[5]= new Punto(1090,79);
        arrayPuntos[6]= new Punto(48,79);
        arrayPuntos[6]= new Punto(48,79);
        arrayPuntos[7]= new Punto(48,79);
        arrayPuntos[8]= new Punto(48,79);
        arrayPuntos[9]= new Punto(1090,79);
        // Punto prueba = new Punto(38,79);
        // Punto prueba2  = new Punto(20,18);
        // boolean p1 = comprobarPunto(prueba,arrayPuntos);
        // if(p1){
        //     System.out.println("El puntzo "+prueba.toString() +"esta en el array");
        // }else{
        //     System.out.println("El puntzo "+prueba.toString() +"no esta en el array");
        
        // }
        // boolean p2 = comprobarPunto(prueba2,arrayPuntos);
        // if(p2){
        //     System.out.println("El puntzo "+prueba2.toString() +"esta en el array");
        // }else{
        //     System.out.println("El puntzo "+prueba2.toString() +"no esta en el array");
    
        // }
        Punto[] coinciden = puntosEnCuadrante(arrayPuntos, 1);
        mostrarPuntos(coinciden);
       
        
}
    public static boolean comprobarPunto(Punto p,Punto[]pt){
        for(int i = 0; i< pt.length;i++){
            if(pt[i]==p){
                return true;
            }
        }
        return false;
    }

    public static Punto[] puntosEnCuadrante(Punto[] puntos,int cuadrante){
        int contador=0;
        Punto[] coincidentes = new Punto[puntos.length];
        

        for(int i = 0;i<puntos.length;i++){
            if(puntos[i].getCuadrante()==cuadrante){
                coincidentes[contador]=puntos[i];
                contador++;
            }
        }
        Punto[] devuelta = new Punto[contador];
        for(int i = 0; i<contador;i++){
            devuelta[i]=coincidentes[i];
        }        
        return devuelta;

    }

}
