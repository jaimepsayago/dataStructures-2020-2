package pilasyColas;

public interface Queue <E> {
	//metodo para el tamño de la cola
	int size();
	//si esta vacia
	boolean isEmpty();
	//insertar elemento
	void enqueue(E e);
	//retornar el primer valor
	E first();
	//remover 
	E dequeue();
	

}
