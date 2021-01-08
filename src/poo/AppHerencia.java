package poo;

public class AppHerencia {

	public static void main(String[] args) {
		
		//instanciar un obj
		Coche coche = new Coche(3,15);
		
		coche.acelerar(80);// metodo heredado
		
		coche.repostar(12);
		coche.padre= 15;
		coche.setRuedas(8);
		System.out.println(coche.ruedas);
		
	}

}
