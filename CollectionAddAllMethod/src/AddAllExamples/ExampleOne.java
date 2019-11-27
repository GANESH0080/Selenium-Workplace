package AddAllExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);

		ArrayList<Integer> aa = new ArrayList<Integer>();
		al.add(500);
		al.addAll(aa);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
