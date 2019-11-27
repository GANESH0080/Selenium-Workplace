package HasNextWithMethods;

import java.util.ArrayList;
import java.util.Iterator;

public class HasnextThree {
	int rollno;
	String name;
	int age;

	HasnextThree(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;

	}

	public static void main(String[] args) {
		HasnextThree s1 = new HasnextThree(101, "Sonoo", 23);
		HasnextThree s2 = new HasnextThree(102, "Ravi", 21);
		HasnextThree s3 = new HasnextThree(103, "Hanumat", 25);
		// creating arraylist
		ArrayList al = new ArrayList();
		al.add(s1);// adding Student class object
		al.add(s2);
		al.add(s3);
		// Getting Iterator
		Iterator itr = al.iterator();
		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			HasnextThree st = (HasnextThree) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);

		}

	}
}