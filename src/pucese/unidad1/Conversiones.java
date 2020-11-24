package pucese.unidad1;

public class Conversiones {

	public static void main(String[] args) {
		// Conversiones de datos
		
		int  i = 12;
		double b = 3.0;
		float c= (float)(2000*i/b+5);
		//byte
		//conversion de datos = CAST
		
		byte d = (byte)i;
		
		//mostrar tipo de datos
		
		System.out.println("valor float " + c);
		System.out.println("valor double " + (double)c);
		System.out.println("valor byte " + (byte)c);
		System.out.println("valor int " + (int)c);
		System.out.println("valor long " + (long)c);
		
		//string cadenas
		
		//wrapper = clases envoltorios a los tipos primitivos integer, double, float, character..
		//convertir a string
		//convertir string al valor primitivo
		//convertir string a un objeto
		
		
		//ejemplo
		System.out.println("wrapper"+ Integer.toString(55,2));
		int x = Integer.parseInt("75");
		
		System.out.println("wrapper "+x);
		
		double y = Double.valueOf("3.14").doubleValue();
		
		System.out.println("wrapper "+y);
		
		String cadena ="900";
		
		//String a entero
		Integer entero = Integer.valueOf(cadena);
		
		System.out.println("string a entero "+entero);
		
		//entero  a string 
		String cadenac = String.valueOf(entero);
		
		System.out.println("entero a string "+cadenac);
		
		//char a string
		char codigo = 'a';
		String cadenachar = Character.toString(codigo);
		System.out.println("char a string "+cadenachar);
		
		//string a char 
		char character = cadena.charAt(0);
		System.out.println("string a char "+cadenachar);
	}

}
