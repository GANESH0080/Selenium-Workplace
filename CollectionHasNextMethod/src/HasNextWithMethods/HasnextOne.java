package HasNextWithMethods;

import java.util.ArrayList;
import java.util.Iterator;

public class HasnextOne {
	public void testing() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Ganesh Mahadev Salunkhe");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		HasnextOne obj = new HasnextOne();
		obj.testing();

	}

}
