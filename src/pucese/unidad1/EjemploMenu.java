package pucese.unidad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploMenu {

	public static void main(String[] args) {
		// ejemplo de menu utilizando estructuras de datos 
		String opcion;
		
		try {
			do {
				System.out.println("----- MENU -----"); 
				System.out.println("1.- Mantenimiento clientes"); 
				System.out.println("2.- Introducción de facturas"); 
				System.out.println("3.- Listado de facturas"); 
				System.out.println("4.- Finalizar"); 
				
				String mensajeStr = leerTexto("Introduzca número opción escogida : "); 
				opcion = mensajeStr; 
				
				switch (opcion) {
				case "1": System.out.println("Ejecutaría mantenimiento de clientes"); 
				//sentencias
				break; 
				case "2": System.out.println("Ejecutaría introducción de facturas"); 
				break; 
				case "3": System.out.println("Ejecutaría listado de facturas"); 
				break; 
				case "4":System.out.println("cerrar aplicacion");
					System.exit(0);
				break;
				
				}
				
			} while (opcion.compareTo("4") !=0);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());  
		}

	}
	
	static private String leerTexto(String mensaje) {
	      String texto;
	      try {
	         BufferedReader in = new BufferedReader(new InputStreamReader(
	               System.in));
	         System.out.print(mensaje);
	         texto = in.readLine();
	      } catch (IOException e) {
	         texto = "Error";
	      }
	      return texto;
	   }


}
