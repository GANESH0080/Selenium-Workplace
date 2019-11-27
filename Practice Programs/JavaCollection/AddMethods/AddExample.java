package AddMethods;

// Added element using LinkedList

import java.util.Collection;
import java.util.LinkedList;

public class AddExample {

	public static void main(String[] args) {
		// Creating an empty LinkedList
		Collection<String> lst = new LinkedList<String>();
		System.out.println("Original List" + " " + lst);
		// Added element in the List
		lst.add("Ganesh");
		System.out.println("List after adding first element:" + " " + lst);
		// Added element in the List
		lst.add("Mahadev");
		lst.add("Salunkhe");
		lst.add("Kalamboli");
		lst.add("Panvel");
		System.out.println("Modified List:" + " " + lst);
        lst.remove("Ganesh");
        System.out.println("Modified List after REMOVE:" + " " + lst);
        lst.removeAll(lst);
        System.out.println("Modified List after REMOVEALL:" + " " + lst);
        
	}

}
