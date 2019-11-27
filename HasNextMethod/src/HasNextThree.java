import java.util.ArrayList;
import java.util.Iterator;

public class HasNextThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ganesh");
		list.add("Salunkhe");

		Iterator test = list.iterator();
		while (test.hasNext()) {
			System.out.println(test.next());
			System.out.println(test.hasNext());
			System.out.println(test.next());
		}

	}

}
