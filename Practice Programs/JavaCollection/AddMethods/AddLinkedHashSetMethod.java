package AddMethods;

import java.util.Collection;
import java.util.LinkedHashSet;

public class AddLinkedHashSetMethod {

	public static void main(String[] args) {
		Collection<String> hstset = new LinkedHashSet<String>();
		hstset.add("Ganesh");
		hstset.add("Mahadev");
		hstset.add("Salunkhe");
		hstset.add("Rajiv");
		hstset.add("Mahadev");
        System.out.println(hstset);
        for(String e : hstset)
        { 
        	System.out.println(e);
        }
	}

}
