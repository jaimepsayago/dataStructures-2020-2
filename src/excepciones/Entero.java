package excepciones;

public class Entero {
	 public static int convertirCadenaNumero (String s) throws ConversionNumeroExcepcion {
		 boolean encontradoDigitoNoNumerico = false;
		  int acumulador = 0;
	        int peso = 1;
	        
	        for (int i = s.length()-1 ; i >= 0 && !encontradoDigitoNoNumerico ; i--) {
	        	 char digito = s.charAt(i);
	        	 if (digito>='0' && digito<='9')
		            {
		                acumulador = acumulador + ((digito - 48) * peso);
		                peso = peso * 10;
		            }
	        	 else
		            {
		                encontradoDigitoNoNumerico = true;
		            }
	        }
	        if (encontradoDigitoNoNumerico)       
	              throw new ConversionNumeroExcepcion("Este sería el mensaje destinado al constructor de la superclase","No se ha podido realizar la conversión por encontrar algún dígito no numérico");
	        return acumulador;
	   }   
	}