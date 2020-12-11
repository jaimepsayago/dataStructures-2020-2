package pucese.unidad1;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ClaseString {

	public static void main(String[] args) {
		System.out.println("El primer programa");
//cadena
		String str=new String("El primer programa");
		String str1="El primer programa";
//string nulos
		String strn="";
		String strn1=new String();
//obtener dats

		int longitud=str.length();
		System.out.println(longitud);
		
		//donde comienza un string
		boolean resultado=str.startsWith("El");
		System.out.println(resultado);
		//donde termina un string
		boolean resultado1=str.endsWith("programa");
		System.out.println(resultado);
		
		//la primera ocurrrencia de una letra de la cadena
		
		String str3="El primer programa";
		int pos=str3.indexOf('p');
		System.out.println(pos);

		//comparaciones de strings
		
		// el operador logico == no es igual al metodo equals
		
		String str5="El lenguaje Java";
		String str6=new String("El lenguaje Java");

		
		if(str5==str6){
			System.out.println("Los mismos objetos");
			}else{
			System.out.println("Distintos objetos"); }
		if(str5.equals(str6)){
			System.out.println("El mismo contenido");
			}else{
			System.out.println("Distinto contenido"); }
		
		
		//extraer substring
		String str8="El lenguaje Java";
		String subStr=str8.substring(12);
		String subStr1=str8.substring(3,11);
		System.out.println(subStr);
		System.out.println(subStr1);
		
		//conversion de numero a string
		int valor=10;
		String str9=String.valueOf(valor);
		System.out.println(str9);
		
		//quitar espacios en blanco en un string
		String str10=" 12 ";
		String str11=str10.trim();
		int numero=Integer.parseInt(str10.trim());
		System.out.println(numero);
		
		
		//investigar REVERSE
		String input = "Geeks for Geeks";
		StringBuilder input1 = new StringBuilder();
       // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1 = input1.reverse();
 
        // print reversed String
        System.out.println(input1);
        
        //sin utilizar reverse
        String input3 = "GeeksForGeeks";
        // convert String to character array
        // by using toCharArray
        char[] try1 = input3.toCharArray();
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    	}
	

	
}
