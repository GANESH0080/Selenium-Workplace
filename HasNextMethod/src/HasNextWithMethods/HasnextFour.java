package HasNextWithMethods;

import java.util.ArrayList;
import java.util.Iterator;

public class HasnextFour {
	public static void testing() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Ganesh Mahadev Salunkhe");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.hasNext());
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		HasnextFour.testing();
	}

}
