package pucese.unidad1;

public class EjemploWhile {

	public static void main(String[] args) {
		int contadorPares = 0; 
		int acumuladorPares = 0; 
		int contadorImpares = 0; 
		int acumuladorImpares = 0; 
		int i = 1; 
		while(i<10) { //condicion
		//sentencias	
			if(i%2==0) //conocer si es par o impar atraves del mod = sobrante de la division
			{
				contadorPares++;
				acumuladorPares+=i;
			}
			else {
				contadorImpares++;
				acumuladorImpares+=i;
			}
			i++;
		}
		//imprimir las variables
		System.out.println("Se han procesado "+contadorPares+" números pares, "
				+ "y su suma es "+acumuladorPares);
		System.out.println("Se han procesado "+contadorImpares+" números impares, "
				+ "y su suma es "+acumuladorImpares); 


		
	}

}
