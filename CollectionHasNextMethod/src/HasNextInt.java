import java.util.ArrayList;
import java.util.Iterator;

public class HasNextInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(60);
		list.size();
		System.out.println(list.size());

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

	}

}
