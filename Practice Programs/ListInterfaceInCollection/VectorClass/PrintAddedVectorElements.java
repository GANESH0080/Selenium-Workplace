package VectorClass;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class PrintAddedVectorElements {

	public static void main(String[] args) {
		Collection<String> v = new Vector<String>();
		v.add("Ganesh");
		v.add("Mahadev");
		v.add("Salunkhe");
		v.add("Smith");
		v.add("Elon");
		v.add("Martin");
		System.out.println(v);
		// Interate elements
		Iterator<String> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}