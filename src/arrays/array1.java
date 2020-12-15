package arrays;

import javax.swing.JOptionPane;

public class array1 {

	public static void main(String[] args) {
		/*String[]paises={"Ecuador","Peru","Chile","Argentina","Colombia","Brasil","Venezuela","Uruguay",};
		
		for(String variable:paises)
		{
		System.out.println("Pais "+variable);
		}

		*/
		/*String[]paises= new String[8];
		
		for(int i=0;i<8;i++){
		paises[i]=JOptionPane.showInputDialog("Introduce Pais " + (i+1));
		}
		
		//recorrer el arregl0
		for(String elemento:paises)
		{
		System.out.println("Pais "+elemento);
		}
*/
		
		/*
		int[] matrizAleatorios = new int [150];
		
		for (int i=0;i<matrizAleatorios.length;i++)
		{
		matrizAleatorios[i]=(int)Math.round(Math.random()*100);
		}

		for(int elementos:matrizAleatorios){
			System.out.print(elementos + " ");
			}
*/
		
		//enviar arrays a metodos
		
		int array [] = {1,3,5,8};
		
		sum(array);
		
		int arrayP [] = parametro();
		
		for (int v:arrayP) {
			System.out.println("matriz como parametro " + v);
		}
		
	}
	
	public static void sum (int [] z) {
		int sum=0;
		for(int i=0; i<z.length;i++)
			sum+=z[i];
			//sum = sum + z[i];
		System.out.println("suma es : "+sum);
		
	}
	public static int [] parametro() {
		
		return new int [] {1,2,3};
	}

}
