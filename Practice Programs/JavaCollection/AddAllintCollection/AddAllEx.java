package AddAllintCollection;


// The addAll(int, Collection) method of Stack Class is used to append all of the elements from the collection 
// passed as a parameter to this function at a specific index or position of a Stack.
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Stack;

public class AddAllEx {

	public static void main(String[] args) {
		Stack <String> list = new Stack<String>();
		list.add("Ganesh");
		list.add("Deepak");
		list.add("Latika");
		list.add("Shlok");
		list.add("Arnav");
		
		Collection<String> arrlist = new ArrayList<String>();
		arrlist.add("Smith");
		arrlist.add("Nikhil");
		arrlist.add("Anthony");
		arrlist.add("Mills");
		arrlist.add("Elon");
		
		
		 // Appending the collection to the list
		list.addAll(2, arrlist);
		System.out.println(list);
	}

}


