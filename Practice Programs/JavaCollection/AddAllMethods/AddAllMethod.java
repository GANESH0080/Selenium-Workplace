package AddAllMethods;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.LinkedList;

public class AddAllMethod {

	public static void main(String[] args) {
		Collection <Integer> li = new ArrayDeque<Integer>();
		li.add(5);
		li.add(10);
		li.add(25);
		li.add(30);
		Collection <String> ll = new LinkedList<String>();
		ll.add("Ganesh");
		ll.add("Mahadev");
		ll.add("Salunkhe");
		// Not able to convert or addd INT and String combination
		li.addAll(ll);
		System.out.println(li);
		

	}

}
