package AddAllintCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;

public class AddAllIntColl {

	public static void main(String[] args) {
		Stack<String> list = new Stack<String>();
		list.add("Ganesh");
		list.add("Deepak");
		list.add("111");
		list.add("111k");
		list.add("5555");

		Collection<String> arrlist = new LinkedList<String>();
		arrlist.add("S555h");
		arrlist.add("Nikhil");
		arrlist.add("51515");
		arrlist.add("Mills");
		arrlist.add("Elon");

		// Appending the collection to the list
		list.addAll(2, arrlist);
		System.out.println(list);
	}

}
