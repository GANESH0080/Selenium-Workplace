package AddMethods;

import java.util.ArrayList;
import java.util.Collection;

public class AddArrayList {

	public static void main(String[] args) {
		Collection<Integer> arlst = new ArrayList<Integer>();
		arlst.add(5);
		arlst.add(10);
		arlst.add(15);
		arlst.add(20);
		arlst.add(25);
		arlst.add(30);
		arlst.add(35);
		arlst.add(40);

		System.out.println(arlst);
		arlst.clear();
		System.out.println("Updated ArrayList :" +" " +arlst);
	}

}
