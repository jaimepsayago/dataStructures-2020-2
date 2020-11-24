package pucese.unidad1;

public class OperadorIf {

	public static void main(String[] args) {
		// EDD basicas
		//if for while do while switch 
		
		/*
		 * 		if (expresion condicional){
		 * 			sentencias u operaciones si es que cumple la condicion
		 * 		}
		 * 		else
		 * 			sentencias u operaciones si es que no se cumple la condicion
		 * 
		 *anidarse la sentencia if
		 *
		 */	
		
		//Ejercicio: Comparar dos valores
		
		int intento = 5;
		int solucion = 10;
		int resultado = 0;
		
		if(intento > solucion) {
			resultado = +1;
		}
		else if(intento < solucion)
			resultado = -1;
		else
			resultado =0; //si es que tiene coincidencia
		
		
		System.out.println(resultado);
	}
	
	//realizar los ejericios de la diapositivas 108 y 109

}
