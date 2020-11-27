package pucese.unidad1;

public class ExampleFor {

	public static void main(String[] args) {
		/*
		 * for ( inicio; comprobacion; actualizacion)
		 * sentencias
		 * siguiente sentencia
		 * 
		 * for (tipo de variable objeto : coleccion / matriz /  obj)
		 * sentencias
		 */
		
		for(int i =1; i<=100; i++)
			System.out.println(i);
		
		//bucle for aninado
		//bubles repetitivos que estan ejecuntandose uno dentro de otro
		//una tabla de multiplicar con for anidados
		for (int i = 1; i <= 10 ; i++) 
		{ 
			System.out.println("TABLA DEL : "+i); 
			for (int j = 1; j <= 10 ; j++) {
				System.out.print(i+ " x " + j + " = " + (i*j) + " ");
			}
			System.out.println(" ");
		}
		
		

	}

}
