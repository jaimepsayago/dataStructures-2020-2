package poo;

public class Persona {
	
	//atributos o propiedades
	public String nombre;
	public String apellido;
	private String contrasenia; //solo se puede acceder desde la clase padre
	protected String direccion; //solo acceden estas clases y sus descendientes

	public double horas, dormir, horasDormir;
	
	//constructor
	public Persona() {
		
	}
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido= apellido;
	}
//metodos para herencia
	public String nombreCompleto() {
		return this.nombre + ", "+ this.apellido;
	}
	
	public String imprimirDatos() {
		return this.nombreCompleto();
	}
	
	//metodos
	public String identificacion() {
		return this.nombreCompleto();
	}

	
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	
	
	
	
	
}
