package listas;

public class AppBarco {

	public static void main(String[] args) {
		BarcoPasajeros bp = new BarcoPasajeros();
		bp.alarma();
		bp.msgSocorro("socorroooo");
		
		PortaAvion pa = new PortaAvion(13);
		
		pa.alarma();
		pa.msgSocorro("socorro portaavion");

	}

}
