package pilasyColas;

//generica la pila <E>
public interface Stack<E> {
	//tama�o de la pila
	int size();
	
	//si esta vacia
	boolean isEmpty();
	
	//insertar dastos
	void push(E e);
	
	//remover datos
	E pop();
	
	//ultimo elemento de la pila
	E top();

}
