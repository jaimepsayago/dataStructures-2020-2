package listas;

public class PortaAvion implements Mensajes {
	
	private int aviones = 19;
	private int tripulacion ;
	
	public PortaAvion(int marinos) {
		tripulacion= marinos;
		System.out.println("se crea un objeto portaavion");
	}

	@Override
	public void alarma() {
		System.out.println("!!!MARINEROS A SUS PUESTOS!!!");
		
	}

	@Override
	public void msgSocorro(String msg) {
		System.out.println("!!! SOS SOS !!!"+msg);
		
	}
	
	

}
