package listas;

public class Estudiante {

	String cedula, nombre;
	Integer edad;
	int sum=0;
	
	
	public Estudiante(String c, String n, Integer e) {
		cedula = c;
		nombre = n;
		edad = e;
	}
	
	@Override
	//sobrecargado
	public String toString() {
		return cedula + "\t" + nombre + "\t" + edad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	
	
	
	
	
}
