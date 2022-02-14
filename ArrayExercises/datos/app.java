package ArrayExercises.datos;

public class app {
    public static void imprimirPares(int[]numeros){
         for(int i =0;i<10;i+=2){
            System.out.println(numeros[i]);
        }
    }
    public static int sumarPares(int[]numeros){
        int resultado=0;
        for(int i =0;i<10;i+=2){
            resultado+=numeros[i];
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[]numeros = new int[10];
        for(int i =0;i<10;i++){
            numeros[i]=i;
        }
       imprimirPares(numeros);
       System.out.println("La suma de los numeros es : "+sumarPares(numeros));
    }
}
