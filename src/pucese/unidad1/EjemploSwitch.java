package pucese.unidad1;

public class EjemploSwitch {

	public static void main(String[] args) {
		byte numeroMes = 15; 
		if(numeroMes>=1 && numeroMes<=12)
		{
			switch (numeroMes) 
			{ 
			case 1:
			case 3: 
			case 5: 
			case 7: 
			case 8: 
			case 10: 
			case 12: System.out.println("el mes tiene 31 dias");
			break; 
			case 4: 
			case 6:  
			case 9: 
			case 11: System.out.println("el mes tiene 30 dias"); 
			break; 
			case 2: System.out.println("el mes es febrero y puede tener 28 o 29 dias segun el año"); 
			break; 
			}
		}
		else {
			System.out.println("numero de mes incorrecto o no existe");
		}
}
}
