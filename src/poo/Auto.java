package poo;

public class Auto {
	//podemos crear cientos de variables o propiedad o caracteristicas
	int ruedas;
	int ancho;
	int peso;
	
	//metodo constructor
	public Auto() //es un metodo especial para inicializar el objeto o variables
	{
		ruedas = 4;
		ancho = 5;
		peso = 2000;
	}
	
	//crear cientos de metodos funciones o procedimientos "comportamientos"
	public void imprimir() {
		System.out.println("ruedas "+ ruedas + "ancho "+ancho+ "peso "+peso);
	}
}
