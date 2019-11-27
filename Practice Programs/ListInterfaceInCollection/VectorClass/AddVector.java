package VectorClass;

import java.util.Collection;
import java.util.Vector;

public class AddVector {

	public static void main(String[] args) {
		Collection <String> v = new Vector<String>();
		v.add("Ganesh");
		v.add("Mahadev");
		v.add("Salunkhe");
		v.add("Smith");
		v.add("Elon");
		v.add("Martin");
		System.out.println(v);
		// Interate elements
		for(String elements : v)
		{
			System.out.println(elements);
		}
	}

}
