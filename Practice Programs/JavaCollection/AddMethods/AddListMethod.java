package AddMethods;

import java.util.Collection;
import java.util.LinkedList;

public class AddListMethod {

	public static void main(String[] args) {
		Collection<String> lst = new LinkedList<String>();
		lst.add("Ganesh");
		lst.add("Rohit");
		lst.add("Ninad");
		lst.add("Nitin");
		lst.add("Ganesh P");
		lst.add("Shashi");
		lst.add("Rajiv");
		lst.add("Nilesh");
		lst.add("Jay");

		for (String e : lst) {
			System.out.println("List elements arr = " + e);

		}

	}
}
