package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class LeerArchivo {

	public static void main(String[] args) {
		// FILE para leer archivos y tiene varias operaciones y propiedades
		//obtner informacion principal de los archivos
		
		File fichero = new File ("clientes.txt");
		if(fichero.exists()) {
			System.out.println("nombre del archivo: "+ fichero.getName());
			System.out.println("ruta: "+ fichero.getPath());
			System.out.println("ruta absoluta: "+ fichero.getAbsolutePath());
			System.out.println("se puede escribir: "+ fichero.canRead());
			System.out.println("se puede leer: "+ fichero.canWrite());
			System.out.println("tamaño: "+ fichero.length());
			

		}
		
		//leer funcion BUFFEREDREADER
		leerFichero();
		//escribirFichero();
		
		// XML or JSON or cualquier otro tipo
		
		
		
	}
	
	public static void leerFichero() {
		File archivo = null;
		FileReader reader = null;
		BufferedReader buffer = null;
		
		try {
			archivo = new File("clientes.txt");
			reader = new FileReader(archivo);
			buffer = new BufferedReader(reader);
			
			String linea;
			System.out.println("datos del arhivo leido: ");
			while ((linea = buffer.readLine()) !=null) {
				System.out.println(linea);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void escribirFichero() {
		//File archivo = null;
		// writer = null;
		PrintWriter pw = null;
		String frase="esto es un archivo escrito desde java";
		try {
			FileWriter	archivo = new FileWriter("guardar.txt");
			//writer = new FileWriter(archivo);
			//pw = new PrintWriter(writer);
			
			for (int i = 0; i<10; i++) {
				archivo.write("linea " + i);
			
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
