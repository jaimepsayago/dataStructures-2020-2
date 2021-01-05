package poo;

public class Racional {

	
	private int numerador, denominador;
	
	public Racional() {
		numerador=0;
		denominador=1;
	}
	
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	public void asignarNumeradorDenominador(int n, int d) {
		numerador = n;
		denominador=d;
	}
	
}
