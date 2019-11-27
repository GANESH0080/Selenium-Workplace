package ContainsMethod;

import java.util.Collection;
import java.util.LinkedList;

public class ContainsExample {

	public static void main(String[] args) {
		Collection<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		System.out.println(list);
		if (list.contains(25)) {
			System.out.println("Element (25) is avaialble in List.");
		} else {
			System.out.println("Element (25) is not avaialble in List.");
		}

	}

}
