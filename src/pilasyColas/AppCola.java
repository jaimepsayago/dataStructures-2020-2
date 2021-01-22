package pilasyColas;

import java.util.Iterator;
import java.util.LinkedList;

public class AppCola {

	public static void main(String[] args) {

		//objeto cola de tipo integer
		Queue<Integer> s = new ArrayQueue<>();
		s.enqueue(8);
		s.enqueue(16);
		s.enqueue(26);
		
		//System.out.println(s.first());
		
		while(!s.isEmpty()) {
			System.out.println(s.dequeue());
		}
		
		//cola con la libreria de java LINKEDLIST
		LinkedList<String> cola = new LinkedList<String>();
		
		//agregar datos
		cola.add("juan");
		cola.add("luis");
		cola.add("jose");
		
		cola.addFirst("susana");
		cola.addLast("pedro");
		
		//agregar los dastos en posiciones ejemplo en la pos 3
		cola.add(2,"carlitos");
		
		//remover
		cola.remove(3);
		
		//obtengo los datos que deseo 
		Object datoObtenido = cola.get(0);
		System.out.println("dato posicion 0 "+datoObtenido);
		
		//agregar datos
		cola.add(2,"cambio por otro nombre jorge");
		
		//mostrar o recorrer la lista
		//collections
		//Iterator recorrer un objeto sin saber conocer su tamaño (recorrer un obj dinamico)
		
		Iterator<String> iterator = cola.iterator();	
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		
		}
		
		
		
		
}
}
