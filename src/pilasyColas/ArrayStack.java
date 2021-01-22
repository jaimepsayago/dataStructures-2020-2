package pilasyColas;

public class ArrayStack<E> implements Stack<E> {

	//tamaño de la pila
	public static final int CAPACITY = 1000;
	
	//declarar mi array generica
	public E[] data;
	
	//declarar el valor del indicide de elementos de mi stack
	private int t=-1;
	
	//constructor1
	//por defecto con 1000 datos
	public ArrayStack() {
		this(CAPACITY);
	}
	//constructor 2
	//valores desde la app para el tamño de la stack
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		data = (E[]) new Object[capacity];
	}

	//IMPLEMENTAR LOS METODOS

	@Override
	public int size() {
		return (t+1);
	}
	@Override
	public boolean isEmpty() {
		return (t== -1);
	}

	@Override
	public void push(E e) {
		if (size() == data.length)
		 throw new IllegalStateException("stack is full");
		data[++t] = e;
		
	}

	//shell
	
	@Override
	public E pop() {
		if (isEmpty()) return null;
		E answer = data[t];
		data[t] = null; //borra el dato
		t--; // disminuye el stack
		
		return answer;
	}

	@Override
	public E top() {
		if (isEmpty()) return null;
		return data[t];
	}
	
	

	

}
