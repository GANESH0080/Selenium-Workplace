package AddMethods;

import java.util.ArrayList;
import java.util.Collection;

public class NullExcAddMethod {

	public static void main(String[] args) {
		Collection<String> list = new ArrayList<String>();

		System.out.println("The ArrayList is: " + list);

	
		   try { 
	            // Appending the null to the list 
	            list.add(null); 
	            System.out.println("The ArrayList is: " + list);
	        } 
	        catch (Exception e) { 
	            System.out.println("Exception: " + e); 
	        } 
		}

	}


