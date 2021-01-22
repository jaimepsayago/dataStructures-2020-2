package pilasyColas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.bind.ParseConversionEvent;

public class AppTareaStacksQueue {

	public static void main(String[] args) {
		/*
		 * Realice un programa para insertar 7 números en una pila A, 
		 * y 7 números en una pila B, posteriormente 
		 * visualice todos los números de la pila A 
		 * que también hay en la pila B. 

		 */
	/*
		java.util.Stack A = new java.util.Stack();
		java.util.Stack B = new java.util.Stack();
		//pedimos dastos
		
		while (A.size()<7) {
			String dato = leerTexto("introduce el numero pila A: ");
			A.push( Integer.parseInt(dato));
		
		}
		
		while (B.size()<7) {
			String dato = leerTexto("introduce el numero pila B: ");
			B.push( Integer.parseInt(dato));
		
		}
		
		//mostrar informacion sin vaciar la pila
		while(!A.isEmpty()) {
			System.out.println(A.pop());
		}
		while(!B.isEmpty()) {
			System.out.println(B.pop());
		}
		*/
		//segundo ejercicio
		/*
		 * . Mediante funciones (tipo pila array) hacer un programa 
		 * que dado cualquier numero de países se almacenen, 
		 * y tenga función de agregar país, eliminar país, mostrar y salir.
		Ayuda: Crear una clase Pais con los atributos nombre, capital, habitantes
		Luego generar otra clase donde tenga los métodos añadir, mostrar, eliminar
		Y por ultimo otra clase para implementar la clase y los métodos

		 */
		
		Stack<Pais> stackPais = new ArrayStack<>(); //creando una pila tipo Pais
		Pais pais; //variable o dastos Pais
		
		
		String N = leerTexto("inserter la cantidad de numero ");
		int cantidad = Integer.parseInt(N);
		for(int i =0; i<cantidad;i++) {
			//System.out.println("inserte nombre, capital y habitantes: ");
			 //agregar dastos a obj pais
			pais = new Pais( leerTexto("inserte nombre: "), 
					leerTexto("inserte capital: "), leerTexto("inserte habitantes: "));
			
			stackPais.push(pais);
			
		}
		
		//mostrar datos de pila
		while(!stackPais.isEmpty()) {
			pais = stackPais.pop();
			pais.mostrar();
		}
	

	}
	
	static private String leerTexto(String mensaje) {
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
