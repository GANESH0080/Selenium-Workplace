package HasNextWithMethods;

import java.util.ArrayList;
import java.util.Iterator;

public class HasnextFive {
	public static void testing() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Ganesh Mahadev Salunkhe");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.hasNext());
			System.out.println(itr.next());
		}
	}
}
