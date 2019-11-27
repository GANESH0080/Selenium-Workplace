package ContainsMethod;

import java.util.Collection;
import java.util.LinkedHashSet;

public class ContainsLinkedHashSet {

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
        boolean result = hstset.contains("RAJIV");
        boolean res = hstset.contains("Rajiv");
        boolean rest = hstset.contains("dev");
        System.out.println(result);
        System.out.println(res);
        System.out.println(rest);
	}
	}

