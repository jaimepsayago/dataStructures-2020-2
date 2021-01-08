package poo;

public class Equipo {
	
	private int potencia, voltios, cd;
	private String marca;
	
	public Equipo() {
		marca = "sin marca";
		System.out.println("constructor por defecto");
		
	}
	public Equipo(String marca) {
		this.marca = marca;
		System.out.println(this.marca);
	}
	
	public Equipo(String marca, int potencia, int voltios, int cd) {
		
		this.marca= marca;
		this.potencia= potencia;
		this.voltios = voltios;
		this.cd=cd;
		System.out.println(this.marca + " "+ 
	 + this.potencia + " " + this.voltios + " " + this.cd);
		
	}
	
	public double factura() {
		return 0;
	}

}
