package listas;

public class SimpleLinkedList<E>{

	//CLASE INTERNA NODO DENTRO DE LA CLASE SIMPLELINKED LIST
		private static class Node<E>{
			private E element ; //elemento que se guarda en el nodo
			private Node<E> next; //referencia al siguiente nodo en la lida
			
			//constructor
			public Node(E e, Node<E> n) {
				element = e;
				next = n;
			}
			
			//getters and setters del nodo
			public E getElement() {
				return element;
			}
			public void setNext(Node<E> n) {
				next = n;
			}
			public Node<E> getNext(){
				return next;
			}
		}
	//FIN CLASE INTERNA NODE
		//INSTANCIA Y METODOS DE LA CLASE SIMPLE LINKED LIST
		
		//HEAD nodo de la lista
		private Node<E> head = null;
		private Node <E> tail = null;
		
		//numero de nodos de la lista
		private int size = 0; //edd dinamica!!!!
		
		//constructor
		public SimpleLinkedList() {
			
		}
		//metodos
		
		//tamaño
		public int size() {
			return size;
		}
		
		//si esta vacia
		public boolean isEmpty() {
			return size ==0;
		}
		
		//retornar el first elemento
		public E first() {
			if (isEmpty()) return null;
			return head.getElement();
		}
		
		//retornar el ultimo valor
		public E last() {
			if (isEmpty()) return null;
			return tail.getElement();
		}
		
		//agregar datos al inicio de la lista
		
		public void addFirst(E e) {
			head = new Node<>(e,head); // e=elemento y head=referncia al nodo
			if(size == 0)
				tail = head;
			size++;
			//  HEAD-----HEAD-----HEAD----head-----NULL
		}
		
		
		//agregar datos al final de la lista
		public void addLast(E e) {
			Node <E> newest = new Node<>(e, null);
			if (isEmpty())
				head = newest;
			else
				tail.setNext(newest);
				tail = newest;
			size++;
			//  N1----N2-----N3-----N4------N5-----N6-----N7-----N8---nulll
		}
		
		//remover
		public E removeFirst() {
			if(isEmpty()) return null;
			
			E e1 = head.getElement(); //obener valor de la primer valor
			head = head.getNext(); //apunto al siguiente
			size--;
			if(size == 0)
				tail = null;
			return e1;
			
		}
		
		//obtener
		public E getElementObject (int index) {
			int c = 0;
			Node<E> tmp = head;
			while (c<index) {
				tmp = tmp.getNext();
				c++;
			}
			return tmp.getElement();
			
		}
		//mostrat todos
		public void getAll() {
			Node <E> tmp = head; //creamos un nodo tmp y agregamos el inicio de la lista
			//recorrer la lista
			while(tmp != null) {
				System.out.println(tmp.getElement().toString());
				tmp = tmp.getNext();
			}
			//n5----n4---n3---N2---N1
			
			
			
		}
		
		//calcular el promedio de edad de los estudiantes
		
		public float promedio() {
			int suma=0, con =0;
			
			if (head !=null) {
				Node<E> tmp = head;//creamos un nodo tmp y agregamos el inicio de la lista
				while(tmp != null) {
					//crear un obj estudiante y realizando un cast para poder hacer operaciones
					Estudiante objeto = (Estudiante) tmp.getElement(); 
					suma+=objeto.getEdad();
					con++;
					tmp = tmp.getNext();
				}
				
			}
			return (float) suma/con;
		}
		
		//devolver el estudiante con mayor edad de la lista
		Estudiante mayor() {
			Estudiante objeto = null; //declarar objeto
			Integer may = 0;
			
			if(head != null) {
				Node<E> tmp = head;//creamos un nodo tmp y agregamos el inicio de la lista
				while(tmp != null) {
					objeto = (Estudiante) tmp.getElement();
					if(objeto.edad>may) {
						may=objeto.edad;
					}
					tmp = tmp.getNext();
				}
			}
			return objeto;
		
}
}
