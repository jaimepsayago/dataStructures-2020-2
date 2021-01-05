package poo;

public class Persona {
	
	//atributos o propiedades
	public String nombre;
	private String contrasenia; //solo se puede acceder desde la clase padre
	protected String direccion; //solo acceden estas clases y sus descendientes

	public double horas, dormir, horasDormir;
	
	//constructor
	public Persona() {
		
	}
	public Persona(String n) {
		nombre = n;
	}
	
	//metodos
	
	public void comer (double c) {
		horas = c;
	}
	public void dormir (double d) {
		dormir = d;
	}
	public double horasTotal() {
		horasDormir = horas + dormir;
	return horasDormir;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
	
	
	
	
}
