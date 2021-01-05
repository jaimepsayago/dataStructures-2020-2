package poo;

public class AppAuto {

	public static void main(String[] args) {


		//instanciar un objeto de la clase Auto
		
		Auto aveo = new Auto(); //obj 1
		System.out.println("este coche tiene el peso "+ aveo.peso);
		System.out.println("propiedades aveo ");
		aveo.imprimir();
		
		Auto camioneta = new Auto(); //obj 2
				
		camioneta.peso = 6000;
		System.out.println("camioneta tiene el peso "+ camioneta.peso + "ancho " + camioneta.ancho);
		System.out.println("propiedades camioneta ");
		camioneta.imprimir();
		
		//UML unified model language y poo

	}

}
