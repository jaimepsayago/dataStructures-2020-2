package listas;

public class BarcoPasajeros implements Mensajes {

	//propiedades
	private int numeroCamas = 100;
	private int tripulantes = 12;
	
	//constructor
	public BarcoPasajeros() {
		System.out.println("se creo un objeto barco pasajeros");
	}

	//metodos
	
	@Override
	public void alarma() {
		System.out.println("!!!ALARMA DEL BARCO PASAJEROS");
		
	}

	@Override
	public void msgSocorro(String msg) {
		//alarma();
		System.out.println("!!!!SOS SOS SOS !!!" + msg);
		
	}
	
	
	
	
	
}
