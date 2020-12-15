package arrays;

import java.beans.FeatureDescriptor;

public class matrices {

	public static void main(String[] args) {
		/*int [][] temperatures={
				{15,16,18,97,65},
				{95,56,42,85,23},
				{33,25,45,78,45},
				{65,69,55,29,41},
				};

		for(int[]fila:temperatures){
			for(int z:fila){
				System.out.print(z + " ");
				}
			System.out.println();
			}
*/
		String nombreDelCurso;
		
		//libro de calificaciones
		int arregloCalif[][] = { { 87, 96, 70 },
				{ 68, 87, 90 },
				 { 94, 100, 90 },
				 { 100, 81, 82 },
				 { 83, 65, 85 },
				 { 78, 87, 65 },
				 { 85, 75, 83 },
				 { 91, 94, 100 },
				 { 76, 72, 84 },
				 { 87, 93, 73 } };
		imprimirCalificaciones(arregloCalif);
		System.out.println("la calificacion mas baja es " + obtenerMinima(arregloCalif));
		System.out.println("la calificacion mas alta es " + obtenerMaximo(arregloCalif));
		imprimirGraficoBarra(arregloCalif);
	}

	public static void imprimirCalificaciones(int [] [] calificaciones) {
		System.out.println( "Las calificaciones son:\n" );
		System.out.print( "            " );
		
		//crear encabezado 
		for ( int prueba = 0; prueba < calificaciones[ 0 ].length; prueba++ )
			System.out.printf( "Prueba %d ", prueba + 1 );
			System.out.println( "Promedio" ); 
			
			//crear las filas y columnas con las calificaciones
			for ( int estudiante = 0; estudiante < calificaciones.length; estudiante++ ) {
				System.out.printf( "Estudiante %2d", estudiante + 1 );
				
			for(int prueba: calificaciones[estudiante]) //imprimir las calificaciones
				System.out.printf( "%8d", prueba );
			
				double promedio = obtenerPromedio(calificaciones[estudiante]);
				System.out.printf( "%9.2f", promedio );
				System.out.println();	//salto para ordenar calificaciones
			}
		
		
	}
	
	public static double obtenerPromedio(int conjuntoDeCalif []) {
		int total = 0;
		for(int calificacion:conjuntoDeCalif)
			total+= calificacion;
		return (double) total/conjuntoDeCalif.length;
	}
	
	public static int obtenerMinima(int calificaciones [][]) {
		//matriz vacia
		int califBaja = calificaciones [0][0] ;// asumiendo que le primer es el mas bajo
		
		//for realizamos un iteracion a atraves de la filas del arreglo
		for (int califEstudiantes[]: calificaciones) {
			//revisar las columnas
			for(int calificacion: califEstudiantes) {
				//si la califcaino es menor que califbaja, la asigna a califbaja
				if(calificacion < califBaja)
					califBaja= calificacion;
			}
		}
		return califBaja;
	}
	
	public static int obtenerMaximo(int calificaciones [][]) {
		//matriz vacia
				int califMax = calificaciones [0][0] ;// asumiendo que le primer es el mas bajo
				
				//for realizamos un iteracion a atraves de la filas del arreglo
				for (int califEstudiantes[]: calificaciones) {
					//revisar las columnas
					for(int calificacion: califEstudiantes) {
						//si la califcaino es menor que califbaja, la asigna a califbaja
						if(calificacion > califMax)
							califMax= calificacion;
					}
				}
				return califMax;
}
	
	public static void imprimirGraficoBarra(int calificaciones [][]) {
		
		System.out.println( "Distribucion de calificaciones en general:" );
		// almacena la frecuencia de las calificaciones en cada rango de 10 calificaciones
		int frecuencia[] = new int[ 11 ];
		
		// para cada calificación en LibroCalificaciones, incrementa la frecuencia apropiada
		
		for ( int califEstudiantes[] : calificaciones ) {
			for ( int calificacion : califEstudiantes ) {
				++frecuencia [calificacion / 10];
			
			}
		}
		/*
		for (int f:frecuencia) {
			System.out.println(f);
		}*/
		// para cada frecuencia de calificaciones, imprime una barra en el gráfico
		for ( int cuenta = 0; cuenta < frecuencia.length; cuenta++ )
		{
			// imprime etiquetas de las barras ( "00-09: ", ..., "90-99: ", "100: " )
			if ( cuenta == 10 )
				System.out.printf( "%5d: ", 100 );
			else
				System.out.printf( "%02d-%02d: ",cuenta * 10, cuenta * 10 + 9 );
			// imprime barra de asteriscos
			for ( int estrellas = 0; estrellas < frecuencia[ cuenta ]; estrellas++ )
						 System.out.print( "*" );//imprimie asteriscos de acuerdo a la frecuencia
			System.out.println();
		}
		
	}
}
