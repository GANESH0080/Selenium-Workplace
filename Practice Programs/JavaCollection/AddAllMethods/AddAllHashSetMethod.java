package AddAllMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class AddAllHashSetMethod {

	public static void main(String[] args) {
		Collection<String> list = new HashSet<String>();
		list.add("Ganesh");

		Collection<String> arrlist = new ArrayList<String>();
		arrlist.add("Smith");
		
		 // Appending the collection to the list
		list.addAll(arrlist);
		System.out.println(arrlist);
		System.out.println(list);
	}

}
