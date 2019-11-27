package ClearMethods;

import java.util.ArrayList;
import java.util.Collection;

public class ClearArrayList {

	public static void main(String[] args) {
		Collection<String> arr = new ArrayList<String>();
		arr.add("Mitendra");
		arr.add("Shashi");
		System.out.println(arr);
		arr.clear();
		System.out.println(arr);

	}

}
