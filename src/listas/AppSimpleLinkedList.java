package listas;

import java.util.Scanner;

import poo.Ciudadano;

public class AppSimpleLinkedList {

	public static void main(String[] args) {

		/*SimpleLinkedList<Integer> lista = new SimpleLinkedList<>();
		
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
		System.out.println(listac.getElementObject(2).nombre);*/
		
		SimpleLinkedList<Estudiante> lista = new SimpleLinkedList<>();
		
		//crear objeto estudiante que se va ainsertar en la lista
		Estudiante e;
		
		int n=0;
		Scanner data = new Scanner(System.in);
		String cedula, nombre;
		Integer edad;
		
		//ciclo while que permita ingresar los datos de los estudiantes
		while(n<3) {
			//introducir datos desde la consola
			System.out.println("introducir cedula: " + n);
			cedula = data.next();
			System.out.println("introducir nombre: " + n);
			nombre = data.next();
			System.out.println("introducir edad: " + n);
			edad = data.nextInt();
			
			//instaciamos la clase y agregamos las varialbes al objeto
			e = new Estudiante(cedula,nombre,edad);
			
			//agregar el objeto a la lista
			lista.addFirst(e);
			n++;
		}
		
		System.out.println(lista.getElementObject(2).nombre);
		//mostrar lista
		System.out.println("lista: \n");
		lista.getAll();
		
		//metodos promedio
		System.out.println("promedio de la edad: \n");
		System.out.println(lista.promedio());
		
		//metodo mayor de la lista
		
		System.out.println("mayor de los estudiantes : \n");
		System.out.println(lista.mayor());
	}

}
