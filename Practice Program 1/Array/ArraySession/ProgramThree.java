package ArraySession;

import java.util.Arrays;

public class ProgramThree {
	
	ProgramThree()
	{
		int [] array = new int[4];
		array[0] = 55;
		array[1] = 65;
		array[2] = 75;
		array[3] = 85;
		System.out.println("Printing Arrays : " + Arrays.toString(array));
		System.out.println("Printing Array length :" +array.length);
		// Printing Array length
		for (int i = 0; i < array.length; i++)

	{
			array[i] = i;
			System.out.println("Array index is :" +i);
			
			}
		
		
	}
	
	
}
