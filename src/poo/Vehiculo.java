package poo;

public class Vehiculo {
	
	//propiedades
	
	public int velocidad;
	public int ruedas;
	public int padre;
	
	//constructor
	public Vehiculo() {
		
	}

	
	//metodos
	public void parar() {
		velocidad =0;
	}
	
	
	public void acelerar(int kmxh) {
		velocidad += kmxh;
	}

	
	
	//getters and setters
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

}
