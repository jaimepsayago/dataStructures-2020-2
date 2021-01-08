package poo;

public class Ciudadano extends Persona{
	
	//propiedad
	protected String documento;
	
	//constructor
	public Ciudadano(String nombre, String apellido, String documento) {
		super(nombre,apellido);
		this.documento = documento;
	}
	
	//metodo
	public String identificacion() {
		return super.identificacion() + ", documento: " + this.documento;
	}
	
	

}
