package ArrayList_Iterators;

import java.util.ArrayList;

public class AddElementInList {

	public static void main(String[] args) {

		ArrayList<String> myArray = new ArrayList<String>(25);

		myArray.add("Mumbai");
		myArray.add("Pune");
		myArray.add("Banglore");
		myArray.add("Hydrabad");
		myArray.add("Chennai");
		

		System.out.println("Size of an Array is : " + myArray.size());
		myArray.add("Punjab"); // Adding new Element in List at Last
		System.out.println("Size of an Array is : " + myArray.size());
		myArray.add(2, "Kochin"); // Adding an Element at Index 2

		for (String s : myArray) {
			System.out.println(s);
		}

	}

}
