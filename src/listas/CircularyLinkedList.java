package listas;

public class CircularyLinkedList<E>{

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
		//private Node<E> head = null;
		private Node <E> tail = null;
		
		//numero de nodos de la lista
		private int size = 0; //edd dinamica!!!!
		
		//constructor
		public CircularyLinkedList() {
			
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
			return tail.getNext().getElement();
		}
		
		//retornar el ultimo valor
		public E last() {
			if (isEmpty()) return null;
			return tail.getElement();
		}
		
		//agregar datos al inicio de la lista
		
		public void addFirst(E e) {
			if(size == 0) {
				tail = new Node<>(e, null);//agregamos un dato en la lista sin referencia
				tail.setNext(tail); //referencia ciclica o cirular
			}
			else {
				Node<E> newest = new Node <>(e,tail.getNext());//agregar un nuevo nodo y apunta a la cola
				tail.setNext(newest);//apunta la cola al nuevo nodo agregado
			}
			size++;
		}
		
		
		//agregar datos al final de la lista
		public void addLast(E e) {
			addFirst(e); //llamar al metodo insertar inicio
			tail = tail.getNext();
		}
		
		//rotate
		//mover el primer elemento al fin de la lista 
		public void rotate() {
			if (tail != null); //si esta vacia no hace nada
			tail = tail.getNext(); //la cabeza o principio de la lista es la nueva cola
		}
		
		//remover
		public E removeFirst() {
			if(isEmpty()) return null;
			
			Node<E> head = tail.getNext();
			if(head == tail)
				tail = null;
			else
				tail.setNext(head.getNext()); //remueve la "head" de la lista
			size--;
			return head.getElement();
						
		}
		
		//obtener
		public E getElementObject (int index) {
			int c = 0;
			Node<E> tmp = tail;
			while (c<index) {
				tmp = tmp.getNext();
				c++;
			}
			return tmp.getElement();
			
		}
		//mostrat todos
		public void getAll() {
			Node <E> tmp = tail; //creamos un nodo tmp y agregamos el inicio de la lista
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
			
			if (tail !=null) {
				Node<E> tmp = tail;//creamos un nodo tmp y agregamos el inicio de la lista
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
			
			if(tail != null) {
				Node<E> tmp = tail;//creamos un nodo tmp y agregamos el inicio de la lista
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
