import java.util.ArrayList;
import java.util.Iterator;

public class HasNextIntThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(50);
		list.add(60);
		list.size();
		System.out.println("ArraySize is" + " :" + list.size());
		list.clear();
		System.out.println("ArraySize is" + " :" + list.size());

		Iterator itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.hasNext());

		}

	}

}