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
				System.out.println("2.- Introducci�n de facturas"); 
				System.out.println("3.- Listado de facturas"); 
				System.out.println("4.- Finalizar"); 
				
				String mensajeStr = leerTexto("Introduzca n�mero opci�n escogida : "); 
				opcion = mensajeStr; 
				
				switch (opcion) {
				case "1": System.out.println("Ejecutar�a mantenimiento de clientes"); 
				//sentencias
				break; 
				case "2": System.out.println("Ejecutar�a introducci�n de facturas"); 
				break; 
				case "3": System.out.println("Ejecutar�a listado de facturas"); 
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
