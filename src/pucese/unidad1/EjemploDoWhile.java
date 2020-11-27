package pucese.unidad1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EjemploDoWhile {

	public static void main(String[] args) {
		/*
		 * formato
		 * do { 
		 * instrucción 11;
		 *  instrucción 12;
		 *  … } 
		 *  while (expresión que al ser evaluado 
		 *  devuelve un valor boolean);
		 */
		
		BufferedReader bufferedReader = new BufferedReader(new
				InputStreamReader(System.in));
		String cadenaRepeticion , cadenaAConvertir; 
		int numero; 
		int contador = 0; 
		int acumulador = 0; 

		try {
			do
			{
				System.out.print("Introducir número : "); 
				cadenaAConvertir = bufferedReader.readLine(); 
				numero = Integer.parseInt(cadenaAConvertir); 
				contador++; 
				acumulador+=numero; 
				System.out.print("Introducir otro número (S/N) : ");
				cadenaRepeticion = bufferedReader.readLine(); 
				
			}
			while((cadenaRepeticion.charAt(0) == 'S') || cadenaRepeticion. charAt(0) == 's' 
					&& ((contador+1) <= 5)); 
			System.out.println("Se han introducido un total de "+contador+" números"); 
			System.out.println("El valor acumulado de todos ellos es : "+acumulador);
				
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
		}
	}

}
