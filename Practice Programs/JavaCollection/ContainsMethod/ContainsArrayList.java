package ContainsMethod;

import java.util.ArrayList;
import java.util.Collection;

public class ContainsArrayList {

	public static void main(String[] args) {
		Collection<String> list = new ArrayList<String>();
		list.add("Five");
		list.add("Six");
		list.add("Seven");
		list.add("Eight");
		System.out.println(list);
		if (list.contains("Five")) {
			System.out.println("Element (Five) is avaialble in List.");
		} else {
			System.out.println("Element (Five) is not avaialble in List.");
		}

	}

}