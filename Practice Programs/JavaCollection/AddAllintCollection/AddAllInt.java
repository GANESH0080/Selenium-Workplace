package AddAllintCollection;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;

public class AddAllInt {

	public static void main(String[] args) {
		Stack<Integer> list = new Stack<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);

		Collection<Integer> arrlist = new LinkedList<Integer>();
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		arrlist.add(4);
		arrlist.add(5);

		// Appending the collection to the list
		list.addAll(2, arrlist);
		System.out.println(list);
	}

}
