package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> array = new ArrayList<String>();
		//2. Add five Strings to your list
		array.add("a");
		array.add("b");
		array.add("c");
		array.add("d");
		array.add("ee");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < array.size(); i++) {
			String a = array.get(i);
			//System.out.println( " " + a);
	
		}
		
		//4. Print all the Strings using a for-each loop
		for(String a : array){
			//System.out.println(a);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 2; i < array.size(); i+=2) {
			String b = array.get(i);
			//System.out.println( " " + b);
		}
		//6. Print all the Strings in reverse order.
		for (int i = 4; i >= 0; i--) {
			String b = array.get(i);
			//System.out.println( " " + b);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).contains("e")) {
				System.out.println(array.get(i));
			}
			
		}
	}
}

