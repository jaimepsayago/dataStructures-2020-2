package pucese.figuras;

public class FiguraCompleja {
	public static final int Max_Value  = 4;
	public static final int Min_Value  = 1;
	public static final int Max_Value1  = 16;
	public static void main(String[] args) {
		printTop();
		figuraSuperior();
		figuraInferior();
		printTop();
 
	}
	public static void printTop() {
		System.out.print("#");
		for (int i = 1; i<=Max_Value1; i++) {
			System.out.print("=");
		}
		System.out.println("#");
	}

	public static void figuraSuperior() {
		for (int line= 1; line <=Max_Value ; line++) {
			System.out.print("|");	
			for (int space = 1; space <= (line * -2+8);space++) {
				System.out.print(" ");
			}	
			System.out.print("<>");
			for(int dot = 1; dot <=(line *4-4);dot ++) {
				System.out.print(".");
			}	
			System.out.print("<>");
			for(int space = 1;space <= (line *-2 +8);space++){
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}
	public static void figuraInferior() {
		for (int line= 4; line >=Min_Value; line--) {
			System.out.print("|");	
			for (int space = 1; space <= (line * -2+8);space++) {
				System.out.print(" ");
			}	
			System.out.print("<>");
			for(int dot = 1; dot <=(line *4-4);dot ++) {
				System.out.print(".");
			}	
			System.out.print("<>");
			for(int space = 1;space <= (line *-2 +8);space++){
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}

}
