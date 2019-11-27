package ArrayList_Iterators;
/*
Four Main List Iterators
1. public boolean hasNext();
2. public Object next();
3. public boolean hasPrevious();
4. public Object previous();
*/

// ArrayList Example
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListWithWhile {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("SHREE");
		names.add("OM");
		names.add("Ganesh");
		names.add("Salunkhe");

		ListIterator<String> itr = names.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		
		}
		System.out.println("------------------------");

		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
