package pucese.unidad1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Collection {

	public static void main(String[] args) {
		//conversion utilizando iteradores
		 String input20 = "Geeks For Geekssssss";
		 char[] hello = input20.toCharArray();
		 
		 List<Character> trial1 = new ArrayList<>();
		 
		 for (char c : hello)
	         trial1.add(c);
		 Collections.reverse(trial1);
		 ListIterator<Character> li = trial1.listIterator();
	     while (li.hasNext())
	         System.out.print(li.next());
	}

	}


