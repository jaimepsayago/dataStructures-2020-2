package listas;

public class Nodo {
	
	
	Object valor; // guardar el valor que contiene
	Nodo siguiente; //enlace o referencia al siguiente nodo practicamente es un puntero

	
	//constructor
	public Nodo(Object valor) {
		this.valor=valor;
	//final de la lista
		this.siguiente=null;
	}
	
	//metodo para apuntar a otro nodo y que contiene un parametro de tipo nodo
	
	public void enlazarSiguiente(Nodo n) {
		siguiente = n;  
		
	}
	
	//recuperar el valor del nodo
	public Object obtenerValor() {
		return valor;
	}
	
	//metodo para regresar un elemento nodo
	public Nodo obtenerSiguiete() {
		return siguiente;
	}
	
	

	
	
}


