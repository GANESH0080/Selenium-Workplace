package ArrayList_Iterators;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayLiWithWhile {

	public static void main(String[] args) {

		ArrayList<Integer> abc = new ArrayList<Integer>();
		abc.add(10);
		abc.add(20);
		abc.add(30);
		abc.add(40);
		abc.add(50);

		ListIterator<Integer> itr = abc.listIterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
		System.out.println("------------------------");

		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
