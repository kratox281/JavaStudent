package datos2;

public class app {
    public static void imprimirImpares(int[]numeros){
         for(int i =1;i<10;i+=2){
            System.out.println(numeros[i]);
        }
    }
    public static int sumarImpares(int[]numeros){
        int resultado=0;
        for(int i =1;i<10;i+=2){
            resultado+=numeros[i];
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[]numeros = new int[10];
        for(int i =0;i<10;i++){
            numeros[i]=i+1;
        }
       imprimirImpares(numeros);
       System.out.println("La suma de los numeros es : "+sumarImpares(numeros));
    }
}
