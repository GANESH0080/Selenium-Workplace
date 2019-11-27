package ContainsMethod;

import java.util.Collection;
import java.util.HashSet;

public class ContainsHashSet {

	public static void main(String[] args) {
		Collection<String> test = new HashSet<String>();

		test.add("Elements name  is : Ganesh");
		test.add("Elements name  is : Ninad");
		test.add("Elements name  is : Jay");
		test.add("Elements name  is : Smith");

		for (String e : test) {
			System.out.println(e);
		}
		if (test.contains("Salunkhe")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

}
