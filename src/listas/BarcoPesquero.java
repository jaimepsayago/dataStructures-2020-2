package listas;

public class BarcoPesquero implements Mensajes {

	private int tripulantes;
	private double potencia;
	private int pescadores;
	String nombre;
	
	
	public BarcoPesquero(int tripulantes) {
		this.tripulantes = tripulantes;
	}


	@Override
	public void alarma() {
		System.out.println("!!ALARMA PESQUERO" + nombre +  "!!!!");
		
	}


	@Override
	public void msgSocorro(String msg) {
		System.out.println("!!!SOS SOS"+ msg);
		
	}
	
	
}
