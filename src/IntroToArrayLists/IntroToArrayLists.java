package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> aList1 = new ArrayList<String>();
		//2. Add five Strings to your list
		aList1.add("1");
		aList1.add("2");
		aList1.add("3");
		aList1.add("4");
		aList1.add("5");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < 5; i++){
			System.out.println(aList1.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String i: aList1){
			System.out.println(i);
		}
		//5. Print only the even numbered elements in the list.
		System.out.println(aList1.get(1));System.out.println(aList1.get(3));
		//6. Print all the Strings in reverse order.
		for(int i = 4; i >= 0; i--){
			System.out.println(aList1.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
