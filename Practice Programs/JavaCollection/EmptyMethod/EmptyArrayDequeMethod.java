package EmptyMethod;

import java.util.ArrayDeque;
import java.util.Collection;

public class EmptyArrayDequeMethod {

	public static void main(String[] args) {
		Collection<String> arr = new ArrayDeque<String>();
		arr.add("Ganesh S");
		arr.add("Salunkhe");
		arr.add("Mahadev");
		System.out.println(arr.isEmpty());

	}

}
