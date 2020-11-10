package pucese.unidad1;

import java.util.Calendar;
import java.util.Scanner;

public class PrimerPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*varias l
		 * lieas
		 */
		
	System.out.println(" bienvenido "+ "\"entre comillas \"" + "a la programacion \n en estructura de datos");

	//printf -- formato de salida en consola
	
	System.out.printf("%s \n %s \n", "Bienvenido","programacion");
	
	//ENTRADA DE INFORMACION //entrada y salida de datos
	//Scanner
	
	Scanner input = new Scanner (System.in); //instanciación del objeto input
	
	System.out.println("inserte un texto"); //mensaje de ingreso de datos
	String text = input.nextLine() ; //crea una variable string llamada text y con el ingreso de datos 
	//Scanner puede leer tipos de datos int, string, double
	System.out.println(text);//imprimir texto ingresado
	input.close(); //cerrar input
	
	//sumar dos numeros ingresados por teclado y 
	//luego multiplicarlos con la suma y mostrar los resultados de cada operacion
	

	
	//sumar 2 num ingrasados por teclados y multiplicarlos con la suma y presentar
		
	double n = 1.25036; //variable de tipo double
	System.out.printf("%+.3f %n", n);//imprimir formato para double
	
	//MOSTRAR LAS CADENAS O STRINGS o CARACTERES
	
	char caracter = 'A'; //declarar char y darle un valor A
	String cadena = "esta es una cadena";
	Integer entero = 234;
	
	System.out.printf("%c \n ", caracter);
	System.out.printf("%s \n ", cadena);
	System.out.printf("%s \n ", entero);
	
	//FORMATO DE FECHAS
	//declar un objeto de tipo fecha Calendar
	Calendar fechaHora = Calendar.getInstance();
	
	System.out.printf("%tc \n", fechaHora); //muestra la fecha con formato
	System.out.printf("%tF \n", fechaHora); //muestra la fecha año mes dia
	System.out.printf("%tD \n", fechaHora);//muestra la fecha año/ mes/ dia
	 
	//caracteres de conversion para fechas
	System.out.printf("%1$tA, %1$tB %1$td, %1$tY \n", fechaHora);
	
	//caracteres de conversion para horas
	System.out.printf("%1$tH:%1$tM:%1$tS \n", fechaHora);
	
	}//fin metodo main

}//fin de clase primer programa
