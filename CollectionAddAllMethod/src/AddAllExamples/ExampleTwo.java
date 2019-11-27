package AddAllExamples;

import java.util.ArrayList;

public class ExampleTwo {
	ExampleTwo() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ganesh");
		list.add("Mahadev");
		list.add("Salunkhe");

		ArrayList<String> listed = new ArrayList<String>();
		listed.add("OM");
		listed.add("Shree");
		list.addAll(listed);

		for (String e : list) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) {
		ExampleTwo test = new ExampleTwo();
	}
}