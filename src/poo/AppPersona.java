package poo;

public class AppPersona {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Pedro"); //instanciar un obj
		System.out.println(persona.getNombre());
		
		//persona.nombre="juan"; // no esta correcta
		
		persona.setNombre("Juan");
		
		System.out.println(persona.getNombre());
		
		persona.comer(3.5);
		persona.dormir(8.5);
		
		System.out.println("la persona comio y durmio "+ persona.horasTotal());
		
		
		Persona persona1 = new Persona("Pedro2"); //instanciar un obj
		System.out.println(persona1.getNombre());

		
		
		
	}

}
