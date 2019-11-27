package ArrayList_Iterators;

import java.util.ArrayList;

public class ClearArrayElements {

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>(15);
		myList.add(50);
		myList.add(100);
		myList.add(150);
		myList.add(200);
		myList.add(250);

		System.out.println(myList.size());
		// Clear the Elements form ArrayList
		myList.clear();
		System.out.println(myList.size());

	}

}