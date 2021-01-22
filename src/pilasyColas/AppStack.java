package pilasyColas;

import poo.Persona;

public class AppStack {
//repasar la codificacion de pilas y colas y listas enlazadas
	// data structures and algorithms de goodrich
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

//stack integer
		//implementamos un stack de tipo integer
		Stack<Integer> s = new ArrayStack<>();
		
		s.push(50);
		s.push(60);
		s.push(70);
		
		//lectura de la pilas
		//while (s.empty()== false) //cuando la pilas este vacia
		while (! s.isEmpty()) //mientras no este vacia
		{
			System.out.println(s.pop());
		}
		
//objeto stack de la libreria DE JAVA
		//DEL QUE JAVA YA TIEENE IMPLEMENTADO
		
		//instancia de objeto
		
		java.util.Stack pila = new java.util.Stack();
		pila.push(10);
		pila.push(20);
		pila.push("stack pilas");
		
		while(pila.empty()== false) {
			System.out.println(pila.pop());
		}
		
//STACK DE OBJETO PERSONA
		//PILA OBJETO persona
		Stack<Persona> pilaObjeto = new ArrayStack<Persona>();
		//instanciar objetos
		Persona p1 = new Persona("jaime","sayago");
		Persona p2 = new Persona("michael","adame");
		Persona p3 = new Persona("eduardo","arizabala");
		
		pilaObjeto.push(p1);
		pilaObjeto.push(p2);
		pilaObjeto.push(p3);
		
		//elemento ultimo
		while(!pilaObjeto.isEmpty()) {
			System.out.println(pilaObjeto.pop().imprimirDatos());
		}
		
	}

}
