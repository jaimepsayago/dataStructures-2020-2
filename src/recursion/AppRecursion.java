package recursion;

public class AppRecursion {
	public static void main(String[] args) {
	//potencia
//	System.out.println(power(5,15));
	
	//factorial
//	System.out.println(factorial(5));
	
	//suma de los valores de un array
	int []data = {4,3,6,2,8};
	System.out.println(linearSuma(data,5));
	

}
	public static int linearSuma(int [] data, int n) {
		if ( n == 0)
			return 0;
		else
			return linearSuma(data,n-1) + data[n-1];
	}

	public static int factorial(int n) throws IllegalArgumentException{
		if (n < 0) //controlar un error
			throw new IllegalArgumentException();
		
		else if (n == 0)
			return 1;
		else
			return n * factorial(n-1);
	}
	public static double power(double x, int n) {
		if (n == 0 ) //caso base if n = 0 la respuesta es 1
			return 1;
		else		//metodo recursivo
			return x * power(x, n-1);
			
		
	}
	
	
}