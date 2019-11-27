package DifferentIterator;

import java.util.ArrayList;

public class HasNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> one = new ArrayList<String>();
		one.add("OM");
		one.add("Shree");
		for (String e : one) {
			System.out.println("Length of String element is" + " :" + e.length());
			System.out.println(e);

		}
	}

}
