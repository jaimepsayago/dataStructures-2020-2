package excepciones;

public class EjemplosExcepciones {

	public static void main(String[] args) {
		// generar una entrada STring pero errores
		//tratar la excepcion
		try {
			String cadena = "123A";
			int numero = Integer.parseInt(cadena);
			 System.out.println("La cadena convertida a n�mero es : "+numero);
			
		} catch (NumberFormatException e) {
			 System.out.println("No se ha podido realizar la conversi�n por encontrar alg�n d�gito no num�rico");
		}

	}

}
