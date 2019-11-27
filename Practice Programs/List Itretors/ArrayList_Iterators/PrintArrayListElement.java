package ArrayList_Iterators;

import java.util.ArrayList;
import java.util.ListIterator;

// Using While Loop We can not print all the elements in Arraylist
// Only Using For loop we can print all the elements in Arraylist
public class PrintArrayListElement {

	public static void main(String[] args) {
		ArrayList<String> myArray = new ArrayList<String>();
		myArray.add("Smith");
		myArray.add("Warner");
		myArray.add("Brandcraft");

		ListIterator<String> listing = myArray.listIterator();

		while (listing.hasNext()) {
			System.out.println(listing.next());

		}
		System.out.println("-------------------------------");
		while (listing.hasPrevious()) {
			System.out.println(listing.previous());

		}
	}
}
