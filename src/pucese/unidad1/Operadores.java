package pucese.unidad1;

import java.util.Random;

public class Operadores {
	
	public static void main(String[] args) {
		
		//operadores logicos
		// * / + - %
		
		//numeros randomicos o aleatorios
	Random numeroAleatorio= new Random(); //instanciar una variable aleatoria desde la Clase Random
		
	int i = numeroAleatorio.nextInt() % 100;
	int j = numeroAleatorio.nextInt() % 100;
	
	System.out.println("i = " + i);
	System.out.println("j = " + j);
	//mayor o igual que
	System.out.println("i >= j es " + (i>=j)); //alt + 62 >
	//menor o igual que
	System.out.println("i <= j es " + (i<=j)); //alt + 60 <
	//igual
	System.out.println("i == j es " + (i==j)); 
	//no es igual
	System.out.println("i != j es " + (i!=j)); 
	//boolean de comparativas de dos o mas variables
	
	System.out.println("(i < 10) && (j<10) es " + ((i < 10) && (j<10))); //and 
	System.out.println("(i < 10)  || (j<10) es " + ((i < 10)|| (j<10))); //or alt + 124
	
	
	
	}
}
