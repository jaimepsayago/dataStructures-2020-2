package pucese.unidad1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Funciones {

	public static void main(String[] args) {
		// FUNCIONES
		/*
		 * SON BLOQUES DE CODIGO DIVIDIDOS Y QUE EN CONJUNTO ESTAS PARTES PEQUEÑAS
		 * TIENEN UNA TAREA ESPECIFICA Y FORMAN LA APLICACION COMPLETA.
		 * 
		 * LUEGO DE CONCLUIR LA TAREA RETORNA AL PUNTO DONDE FUE LLAMADA
		 * 
		 * ES DECIR HACEN UN PROCESO Y DEVUELVEN UN VALOR
		 * 
		 * ALGUNAS REALIZAN EL PROCESO PERO NO DEVUELVEN NADA 
		 * ASI QUE SE LLAMAN PROCEDIMIENTOS O METODOS
		 * 
		 * SINTAXIS
		 * 
		 * TIPO_FUNCION (VOID) NOMBRE_FUNCION ( TIPO Y NOMBRE DE ARGUMENTOS)
		 * {
		 * SENTENCIAS
		 * }
		 * 
		 */
		
	//llamar a la funcion
		
		System.out.println(suma(5,4));
		mensaje("hola este es un procedimiento");
		

		String texto = leerTexto("introduce un mensaje: ");
		System.out.println(texto);
		String texto1 = leerTexto("introduce un mensaje1: ");
		System.out.println("texto\n"+ texto +  "texto 1\n"+ texto1);
	}

	//definir funcion afuera del main
	
	public static int suma(int a, int b) {
		return a + b;
	}
	
	public static void mensaje(String a) {
		System.out.println("procedimiento" + a);
	}
	
	
	public static String leerTexto(String mensaje) {
		String texto;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.print(mensaje);
			texto = in.readLine();
			
		} catch (IOException e) {
			texto = "error";
		}
		return texto;
	}
	
	
}
