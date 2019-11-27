package AddAllExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleThree {
	String name;
	int rollno;

	ExampleThree(int rollno, String name) {

		this.rollno = rollno;
		this.name = name;
	}

	public static void main(String args[]) {
		ExampleThree s1 = new ExampleThree(25, "Ganesh");
		ExampleThree s2 = new ExampleThree(5, "OM");

		ArrayList<ExampleThree> list = new ArrayList<ExampleThree>();
		list.add(s1);
		list.add(s2);

		Iterator itr = list.iterator();
		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			ExampleThree st = (ExampleThree) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.rollno);

		}
	}
}