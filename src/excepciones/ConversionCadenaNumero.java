package excepciones;

public class ConversionCadenaNumero {

	public static void main(String[] args) {
		try {
		 String cadena = "123";
		 int numero = Entero.convertirCadenaNumero(cadena);
		   System.out.println("La cadena convertida a n�mero es : "+numero);
    } catch (ConversionNumeroExcepcion excepcion) {
        System.out.println(excepcion.getMessage());
        System.out.println(excepcion.getMensaje()); 
    } 
}  


	}


