package pilasyColas;

public interface Queue <E> {
	//metodo para el tam�o de la cola
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
