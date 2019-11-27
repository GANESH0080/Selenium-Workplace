package ContainsMethod;

import java.util.ArrayDeque;
import java.util.Collection;

public class ContainsArrayDeque {

	public static void main(String[] args) {
		Collection<String> list = new ArrayDeque<String>();
		list.add("Five");
		list.add("Six");
		list.add("Seven");
		list.add("Eight");
		list.add("Five");
		System.out.println(list);
		if (list.contains("Five")) {
			System.out.println("Element (Five) is avaialble in List.");
		} else {
			System.out.println("Element (Five) is not avaialble in List.");
		}

	}

}