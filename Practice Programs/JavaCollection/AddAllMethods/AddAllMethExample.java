package AddAllMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

public class AddAllMethExample {

	public static void main(String[] args) {
		Collection<String> hstset = new LinkedHashSet<String>();
		hstset.add("Ganesh");
		hstset.add("Mahadev");
		hstset.add("Salunkhe");
		hstset.add("Rajiv");

		for (String element : hstset) {
			System.out.println("First Collection :" + element);
		}

		System.out.println(
				"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		Collection<String> testing = new ArrayList<String>();
		testing.add("Jay");
		testing.add("Ajay");
		testing.add("Varun");
		testing.add("Elon");
		testing.add("Haddin");
		for (String arrayListelement : testing) {
			System.out.println("Second Collection :" + arrayListelement);
		}

		hstset.addAll(testing);
		System.out.println(hstset);
		for (String intr : hstset) {
			System.out.println(intr);
		}
	}

}
