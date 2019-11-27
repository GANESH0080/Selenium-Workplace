package TestingPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOne {

	public static void ExampleOneMethod() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Shree");
		list.add("Om");
		list.add("Salunkhe");

		Iterator itr = list.iterator();
		for (String e : list) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {
		ExampleOneMethod();
		ArrayList<String> listed = new ArrayList<String>();
		listed.add("Mahadev");
		listed.add("Salunkhe");

		Iterator itrt = listed.iterator();
		while (itrt.hasNext()) {
			System.out.println(itrt.next());
			listed.remove(1);

		}
	}
}
