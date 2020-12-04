package pucese.figuras;

public class Figura1 {

	public static void main(String[] args) {
		
		/*
		 * ejercicio
		 * bucle exterior 5 veces
		 * bucle interno imprimir 10 numeros de esas 5 veces
		 * para un total de 50 numeros impresos
		 */
		/*for (int i = 1; i <= 5; i++) {
		   // System.out.println("externo i = " + i);
			 System.out.println();
		    for (int j = 1; j <= 10; j++) {
		        System.out.print((i * j)+ " ");
		    }
		}*/
		
		/*
		 * dibujar un cuadrado
		 */
		
		/*for (int k = 1; k <=5; k++) {
			for (int l = 1; l <= 10; l++) 
			{
			        System.out.print("*");
			 }
		System.out.println();
			}
*/
		/*
		*
		**
		***
		****
		*****
		******
		*/
		
		/*for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
			System.out.println();

		}*/
		
		/*
		 Cuál es el Código necesario para generar esta salida?
	
			1, 1
			2, 1
			3, 1
			1, 2
			2, 2
			3, 2
		 */
		/*for (int y = 1; y <= 2; y++) {
		    for (int x = 1; x <= 3; x++) {
		        System.out.println(x + ", " + y);
		    }
		}*/
		/*
		for (int line = 1; line <= 5; line++) {
			for (int j = 1; j <= (-1 * line + 5); j++) {
		        System.out.print(".");
		    }
		    System.out.println(line);

		}
		*/
		for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j <= (5 - i); j++) {
		        System.out.print(" ");
		    }
		    for (int k = 1; k <= i; k++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}

		
		


	}

}
