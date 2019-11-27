package ArrayList_Iterators;

import java.util.ArrayList;
public class RemoveArrayElement {

	public static void main(String[] args) {	
		ArrayList<Integer> myList = new ArrayList<Integer>(9); // Size of array is 5.
		myList.add(50); // Element in Array
		myList.add(100);
		myList.add(150);
		myList.add(200);
		myList.add(250);
		myList.add(250);
		
		for (int i: myList)
		{
			System.out.println("Printing all the elements in Array: " +i);
		
		}
		System.out.println("Size of Array is :" +myList.size()); // Size of an Array change at Run time from 9 to 6
		myList.remove(2); // Removed index 2 array from list
		
		for (int i: myList)
		{
			System.out.println("Printing all the elements in Array: " +i);
		
		}
		System.out.println("Size of Array is :" +myList.size());
	}
	

}
