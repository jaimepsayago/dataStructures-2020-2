package listas;

public class AppNodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Nodo uno = new Nodo("ejemplo");
		Nodo dos = new Nodo(45);
		Nodo tres = new Nodo("hooola");
		Nodo cuatro = new Nodo("cuastro");
		//enlazar nodo
		
		uno.enlazarSiguiente(dos); //enlazados en nodo uno y nodo dos
		// N1----->N2
		uno.obtenerSiguiete().enlazarSiguiente(tres);
		//N1----->N2------>N3
		uno.obtenerSiguiete().obtenerSiguiete().enlazarSiguiente(cuatro);
		//N1----->N2------>N3------>N4
		
		
		//imprimir los valores de la lista
		System.out.println(uno
				.obtenerSiguiete() //N2
				.obtenerSiguiete() //N3
				.obtenerValor().toString() //obtener valor N3
				
				
				);
		
		
		

	}

}
