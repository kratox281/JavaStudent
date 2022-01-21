package Pelos;
import java.util.Scanner;
import java.util.Random;
public class desordenar {
	static Scanner tc = new Scanner(System.in);
	static Random r = new Random();
	public static void main(String[] args) {
		String desordenada = "";//inicializamos la variable en la que se va a escribir la palabra desordenada
		System.out.println("introduce palabra");//Irrelevante
		String palabra= tc.nextLine();//Sustituible por cualquier escaner
		System.out.println("La palabra original es: "+palabra);//Comprobacion de la toma de datos 
		palabra = palabra.replaceAll(" ","");//Supresión de espacios en la palabra
		StringBuilder letras = new StringBuilder(palabra);//Creacion de un String en el que se va a editar
		for(int i =0;i<palabra.length();i++) { //Bucle que escribe la palabra desordenada
			int n = r.nextInt(letras.length()); //Elige un caractér al azar de entre los que quedan
			desordenada += letras.charAt(n);//Escribe el caractér elegido
			letras = letras.deleteCharAt(n);//Elimina el caractér elegido de la cadena
		}
		System.out.println("La palabra desordenada es: "+desordenada); // Escribe la palabra ya desordenada
		System.out.println("Se han suprimido los espacios tengase en cuenta a la hora de resolver");
			}
		
		
}

