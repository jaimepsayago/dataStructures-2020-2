package poo;

/*
 * hacer herencia de la clase vehiculo
 */
public class Coche extends Vehiculo {
	
	//propiedad
	public int ruedas=4; //redefiniendo
	public int gasolina; //propiedad de coche
	
	
	//metodos
	public void repostar(int litros) {
		gasolina += litros;
	}
	

	//constructor
	public Coche(int padre, int gasolina) {
		super(); //cargen a la clase hijos la herencia
		this.gasolina= gasolina;
	}


	public int getRuedas() {
		return ruedas;
	}


	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}


	public int getGasolina() {
		return gasolina;
	}


	public void setGasolina(int gasolina) {
		this.gasolina = gasolina;
	}
	
	
}
