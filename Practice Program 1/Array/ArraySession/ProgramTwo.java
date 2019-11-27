package ArraySession;

import java.util.Arrays;

public class ProgramTwo {
	static int[] abc = new int[7];

	public static void main(String[] args) {
		abc[0] = 11;
		abc[1] = 21;
		abc[2] = 31;
		abc[3] = 41;
		abc[4] = 51;
		abc[5] = abc[1] + abc[2];
		abc[6] = abc[1] - abc[2];

		System.out.println("5th Element of Array is =" + abc[5]);
		System.out.println("6th Element of Array is =" + abc[6]);
		System.out.println("Printing Arrays : " + Arrays.toString(abc));
		
		 for(int str : abc)
		 {
	            System.out.println("Array OneByOne" +" "+str);
	        }
		 
		// For loop for Printing an Array length
		for (int i = 0; i < abc.length; i++) {
			abc[i] = i;
			System.out.println("Array index is : " + i);

		}

	}
}