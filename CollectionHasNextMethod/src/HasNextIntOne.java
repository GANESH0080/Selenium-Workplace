import java.util.ArrayList;
import java.util.Iterator;

public class HasNextIntOne {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(60);
		list.size();
		System.out.println(list.size());
		list.clear();
		System.out.println(list.size());

		Iterator itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

	}

}