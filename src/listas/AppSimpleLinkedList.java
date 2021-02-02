package listas;

import poo.Ciudadano;

public class AppSimpleLinkedList {

	public static void main(String[] args) {

		SimpleLinkedList<Integer> lista = new SimpleLinkedList<>();
		
		lista.addFirst(5);
		lista.addFirst(15);
		lista.addFirst(25);
		
		System.out.println(lista.last());
		
		//lista simple enlazada con objetos
		Ciudadano c1 = new Ciudadano("juan", "castro", "080302145");
		Ciudadano c2 = new Ciudadano("luis", "torres", "650231245");
		Ciudadano c3 = new Ciudadano("manuel","calle","654123698");
		
		SimpleLinkedList<Ciudadano> listac = new SimpleLinkedList<>();
		
		listac.addFirst(c1);
		listac.addFirst(c2);
		listac.addFirst(c3);
		
		System.out.println(listac.last().nombre);
	
		//obtener elemento a traves del index
		System.out.println(listac.getElementObject(2).nombre);

	}

}
