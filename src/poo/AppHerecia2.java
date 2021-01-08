package poo;

public class AppHerecia2 {

	public static void main(String[] args) {

		//vamos a crear dos objetos
		//y cada dato se va a agregar a un array de objetos
		//y luego vamos a mostrar la informacion
		
		//objeto 1
		Persona p = new Persona("juan", "calle");
		//objeto 2
		Ciudadano c = new Ciudadano("juan","calle", "032541254");
		//objeto 3
		Ciudadano j = new Ciudadano("jaime","sayago", "03000000");
		
		//array de objetos de tipo Persona
		Persona [] arrayPersona = new Persona[3];
		arrayPersona[0] = p;
		arrayPersona[1] = c;
		arrayPersona[2] = j;
		
		lectorArrayPersona(arrayPersona);
		
		// a partir de este de tipo de estructuras
		// pilas, colas, listas, 
		// arboles y 
		//collections en java ( arraylist, hashmap, obj nativos)
	}
	
	public static void lectorArrayPersona(Persona [] array) {
		for(int i = 0; i< array.length; i++)
			System.out.println("identificando: "+ array[i].identificacion());
	}

}
